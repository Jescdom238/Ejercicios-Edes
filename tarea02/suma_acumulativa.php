<?php
session_start();

if ($_SERVER['REQUEST_METHOD'] === 'POST' && isset($_POST['numero'])) {
    $numero = $_POST['numero'];

    if (!isset($_SESSION['suma'])) {
        $_SESSION['suma'] = 0;
    }

    $_SESSION['suma'] += $numero;
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Suma acumulativa</title>
</head>
<body>
    <h2>Suma acumulativa</h2>
    <form method="post">
        <label for="numero">Ingrese un número:</label>
        <input type="number" id="numero" name="numero" required>
        <input type="submit" value="Agregar">
    </form>

    <?php
    if (isset($_SESSION['suma'])) {
        echo "<p>Suma acumulativa: " . $_SESSION['suma'] . "</p>";
    } else {
        echo "<p>No se ha ingresado ningún número aún.</p>";
    }
    ?>
</body>
</html>
