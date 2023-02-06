$(document).ready(function() {

});

async function registrarUsuario () {
let datos = {};
datos.nombre = document.getElementById('txtNombre').value;
datos.apellido = document.getElementById('txtApellido').value;
datos.email = document.getElementById('txtEmail').value;
datos.password = document.getElementById('txtPassword').value;
let repetirPassword = docuement.getElementById('txtRepeatPassword').value;

if(repetirPassword != datos.password){
    alert("La contraseña que escribiste es dferente")
    return;
}


        const request = await fetch('api/usuario/', {
                method: 'POST',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                }body : JSON.stringigy(datos)
              }, );
              location.reload();

}
