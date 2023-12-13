<!DOCTYPE html>
<html>
<head>
    <title>Mayor de Tres</title>
</head>
<body>
    <form method="post" action="">
        <label>Ingrese el primer número:</label>
        <input type="number" name="num1"><br><br>
        
        <label>Ingrese el segundo número:</label>
        <input type="number" name="num2"><br><br>
        
        <label>Ingrese el tercer número:</label>
        <input type="number" name="num3"><br><br>
        
        <input type="submit" name="submit" value="Encontrar Mayor">
    </form>

    <?php
    if(isset($_POST['submit'])){
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $num3 = $_POST['num3'];
        
        $mayor = $num1;
        if($num2 > $mayor){
            $mayor = $num2;
        }
        if($num3 > $mayor){
            $mayor = $num3;
        }
        
        echo "<p>El número mayor es: $mayor</p>";
    }
    ?>
</body>
</html>