<?php
if(isset($_REQUEST['nombre']) && isset($_REQUEST['apellido'])){

    echo "¡Hola ".$_REQUEST['nombre']." ".$_REQUEST['apellido']."!";
}else{
?>
<form>
    Nombre
    <input type="text" name="nombre">
    <br>
    <br>
    Apellido
    <input type="text" name="apellido">
    <br>
    <br>
    <input type="submit">
</form>
<?php  }?>