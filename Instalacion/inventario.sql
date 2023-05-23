-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-12-2021 a las 14:35:25
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `Id_compra` int(5) NOT NULL,
  `Id_entrada` int(5) NOT NULL,
  `Id_producto` int(5) NOT NULL,
  `Proveedor` varchar(15) NOT NULL,
  `Responsable` varchar(10) NOT NULL,
  `Cantidad` int(7) NOT NULL,
  `Precio_compra` decimal(6,2) NOT NULL,
  `Fecha_compra` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`Id_compra`, `Id_entrada`, `Id_producto`, `Proveedor`, `Responsable`, `Cantidad`, `Precio_compra`, `Fecha_compra`) VALUES
(48, 51, 53, 'proveedor', 'angel', 120, '200.00', '2021-11-30 15:31:36'),
(49, 52, 54, 'proveedor', 'angel', 15, '300.00', '2021-11-30 15:34:05'),
(50, 53, 55, 'proveedor', 'angel', 123, '200.00', '2021-11-30 15:40:22'),
(51, 54, 56, 'asd', 'Admin', 123, '123.00', '2021-11-30 00:00:00'),
(52, 54, 56, 'asd', 'Admin', 123, '123.00', '2021-11-30 00:00:00'),
(53, 56, 57, 'asdasd', 'Charli', 234, '12.00', '2021-12-02 00:00:00'),
(54, 57, 58, 'ejmplo prov', 'Admin', 200, '120.00', '2021-12-03 07:48:58');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entradas`
--

CREATE TABLE `entradas` (
  `Id_entrada` int(5) NOT NULL,
  `Id_producto` int(5) NOT NULL,
  `Fecha_entrada` datetime DEFAULT current_timestamp(),
  `Usuario_responsable` varchar(10) NOT NULL DEFAULT 'usu',
  `Cantidad` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `entradas`
--

INSERT INTO `entradas` (`Id_entrada`, `Id_producto`, `Fecha_entrada`, `Usuario_responsable`, `Cantidad`) VALUES
(51, 53, '2021-11-30 15:31:36', 'angel', 120),
(52, 54, '2021-11-30 15:34:05', 'angel', 15),
(53, 55, '2021-11-30 15:40:22', 'angel', 123),
(54, 56, '2021-11-30 00:00:00', 'Admin', 123),
(55, 56, '2021-11-30 00:00:00', 'Admin', 123),
(56, 57, '2021-12-02 00:00:00', 'Charli', 234),
(57, 58, '2021-12-03 07:48:58', 'Admin', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inventario`
--

CREATE TABLE `inventario` (
  `Id_producto` int(5) NOT NULL,
  `Producto` varchar(25) NOT NULL,
  `Categoria` varchar(25) NOT NULL,
  `Entrada` int(20) NOT NULL,
  `Salida` int(20) NOT NULL,
  `Estado_producto` varchar(100) NOT NULL,
  `Precio` int(6) NOT NULL,
  `Cantidad` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inventario`
--

INSERT INTO `inventario` (`Id_producto`, `Producto`, `Categoria`, `Entrada`, `Salida`, `Estado_producto`, `Precio`, `Cantidad`) VALUES
(54, 'pruducto', 'aasdasd', 15, 0, 'Fase de Desarrollo', 300, 15),
(56, 'asd', 'asd', 246, 0, 'Fase de Introduccion', 123, 246);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `salidas`
--

CREATE TABLE `salidas` (
  `Id_salida` int(5) NOT NULL,
  `Id_producto` int(5) NOT NULL,
  `Producto` varchar(30) NOT NULL,
  `Fecha_entrada` datetime NOT NULL DEFAULT current_timestamp(),
  `Fecha_salida` datetime NOT NULL DEFAULT current_timestamp(),
  `Motivo` varchar(15) NOT NULL,
  `Usuario_responsable` varchar(10) NOT NULL,
  `Cantidad` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `salidas`
--

INSERT INTO `salidas` (`Id_salida`, `Id_producto`, `Producto`, `Fecha_entrada`, `Fecha_salida`, `Motivo`, `Usuario_responsable`, `Cantidad`) VALUES
(36, 53, 'producto', '2021-11-30 15:31:36', '2021-11-18 00:00:00', 'asdasd', 'angel', 12),
(37, 53, 'producto', '2021-11-30 15:31:36', '2021-11-30 15:36:12', 'venta', 'angel', 12),
(38, 53, 'producto', '2021-11-30 15:31:36', '2021-11-30 15:36:49', 'eliminacion', 'angel', 96),
(39, 55, 'producto', '2021-11-30 15:40:22', '2021-11-30 16:38:10', 'eliminacion', 'Admin', 123),
(40, 57, 'asdasd', '2021-12-02 00:00:00', '2021-12-02 23:06:46', 'eliminacion', 'Charli', 234),
(41, 58, 'ejmplo prod', '2021-12-03 07:48:58', '2021-12-03 00:00:00', 'ejemplo', 'Admin', 20),
(42, 58, 'ejmplo prod', '2021-12-03 07:48:58', '2021-12-03 00:00:00', 'venta', 'Admin', 18),
(43, 58, 'ejmplo prod', '2021-12-03 07:48:58', '2021-12-03 00:00:00', 'eliminacion', 'Admin', 162);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `Id_tipo` int(11) NOT NULL,
  `Tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`Id_tipo`, `Tipo`) VALUES
(1, 'Admin'),
(2, 'User');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Id_usuario` int(5) NOT NULL,
  `Usuario` varchar(10) NOT NULL,
  `Contraseña` varchar(100) NOT NULL,
  `Fecha_ingreso` datetime NOT NULL DEFAULT current_timestamp(),
  `Id_tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`Id_usuario`, `Usuario`, `Contraseña`, `Fecha_ingreso`, `Id_tipo`) VALUES
(7, 'Admin', 'd033e22ae348aeb5660fc2140aec35850c4da997', '2021-12-04 11:30:55', 1),
(38, 'raul', '8b52b6b714585648fd300da0dbc0fa0678553280', '2021-12-04 11:31:32', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `Id_venta` int(5) NOT NULL,
  `Id_salida` int(5) NOT NULL,
  `Id_producto` int(5) NOT NULL,
  `Comprador` varchar(15) NOT NULL,
  `Responsable` varchar(10) NOT NULL,
  `Cantidad` int(7) NOT NULL,
  `Precio_venta` float(6,2) NOT NULL,
  `Fecha_venta` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`Id_venta`, `Id_salida`, `Id_producto`, `Comprador`, `Responsable`, `Cantidad`, `Precio_venta`, `Fecha_venta`) VALUES
(13, 36, 53, 'asdasd', 'angel', 12, 200.00, '2021-11-30 15:36:12'),
(14, 41, 58, 'ejmplo com', 'Admin', 18, 125.00, '2021-12-03 00:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`Id_compra`);

--
-- Indices de la tabla `entradas`
--
ALTER TABLE `entradas`
  ADD PRIMARY KEY (`Id_entrada`);

--
-- Indices de la tabla `inventario`
--
ALTER TABLE `inventario`
  ADD PRIMARY KEY (`Id_producto`);

--
-- Indices de la tabla `salidas`
--
ALTER TABLE `salidas`
  ADD PRIMARY KEY (`Id_salida`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`Id_tipo`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`Id_usuario`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`Id_venta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `Id_compra` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de la tabla `entradas`
--
ALTER TABLE `entradas`
  MODIFY `Id_entrada` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;

--
-- AUTO_INCREMENT de la tabla `inventario`
--
ALTER TABLE `inventario`
  MODIFY `Id_producto` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `salidas`
--
ALTER TABLE `salidas`
  MODIFY `Id_salida` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `Id_tipo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `Id_usuario` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `Id_venta` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
