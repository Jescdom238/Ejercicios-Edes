<?php
include 'config.php';

$stmt = $pdo->query('SELECT * FROM coches');
$coches = $stmt->fetchAll();
?>

<h2>Listado de coches</h2>

<!-- Botón para crear un nuevo jabón -->
<a href="create.php">Crear nuevo coche</a>
<br><br>

<ul>
<?php foreach ($coches as $coche): ?>
    <li>
        <?php echo $coche['nombre']; ?> - $<?php echo $coche['precio']; ?>  <?php echo $coche['descripcion']; ?>
        <a href="edit.php?id=<?php echo $coche['id']; ?>">Editar</a>
        <a href="delete.php?id=<?php echo $coche['id']; ?>">Eliminar</a>
        
    </li>
<?php endforeach; ?>
</ul>
