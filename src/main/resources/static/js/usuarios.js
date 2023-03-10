// Call the dataTables jQuery plugin
$(document).ready(function() {
cargarUsuarios();
  $('#usuarios').DataTable();
});

async function cargarUsuarios (){

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

    const usuarios = await request.json();
    let rowsUser ="";


  for(let usuario of usuarios){
      let btnEliminar = `<a href="#" onclick="eliminarUsuario(${usuario.id})" class="btn btn-danger btn-circle btn-sm"> <i class="fas fa-trash"></i> </a>`
    let rowUser = `<tr> <td>${usuario.id}</td> <td>${usuario.nombre}
    ${usuario.apellido}</td> <td>${usuario.email}</td> <td>${usuario.telefono}</td>
    <td>${btnEliminar}</td> </tr>`;
    rowsUser +=rowUser;

  }
  document.querySelector("#usuarios tbody").outerHTML=rowsUser
  console.log(usuarios);

}

async function eliminarUsuario (id) {
    if(!confirm("Desea eliminar este usario")){ return; }

     const request = await fetch('api/usuario/'+id, {
                method: 'DELETE',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                }
              });
              location.reload();
}