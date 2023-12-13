<!DOCTYPE html>
<html>
<head>
    <title>Ingrese un numero del 1 al 7</title>
</head>
<body>
    <form action="dia_semana.php" method="GET">
        <label for="numero">Ingrese un número del 1 al 7:</label>
        <input type="number" name="numero" id="numero" min="1" max="7">
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

<?php
if(isset($_GET['numero'])) {
    $numero = $_GET['numero'];

    if($numero >= 1 && $numero <= 7) {
        $diasSemana = [
            1 => "Lunes",
            2 => "Martes",
            3 => "Miércoles",
            4 => "Jueves",
            5 => "Viernes",
            6 => "Sábado",
            7 => "Domingo"
        ];

        echo "El día correspondiente al número $numero es: " . $diasSemana[$numero];
    } else {
        echo "Error: El número debe estar entre 1 y 7.";
    }
}
?>
