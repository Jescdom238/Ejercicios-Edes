<?php

do {
    $numero = readline("Ingrese un número entre 1 y 10: ");
} while ($numero < 1 || $numero > 10);

echo "Tabla de multiplicar del $numero:\n";
for ($i = 1; $i <= 10; $i++) {
    $resultado = $numero * $i;
    echo "$numero x $i = $resultado\n";
}
?>
