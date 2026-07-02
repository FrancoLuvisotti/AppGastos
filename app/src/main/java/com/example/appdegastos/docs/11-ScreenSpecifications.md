📄 11 - ScreenSpecifications.md (VERSIÓN 1.0 - APROBADA)
Filosofía

Cada pantalla debe responder tres preguntas:

¿Qué información muestra?
¿Qué puede hacer el usuario?
¿Qué datos necesita?

Todas las pantallas seguirán el patrón:

Screen

↓

ViewModel

↓

UiState

↓

Events

↓

Components
1. Splash Screen
   Objetivo

Mostrar el logo mientras carga la configuración inicial.

Muestra
Logo de Pendify
Nombre de la aplicación
Indicador de carga
Acciones

Ninguna.

Navegación
Splash

↓

Onboarding
o
Dashboard
2. Onboarding

Solo aparecerá la primera vez.

Pantalla 1

Bienvenida.

Pantalla 2

¿Qué moneda utilizás?

Ejemplos

ARS
USD
EUR
Pantalla 3

Elegir tema

Claro
Oscuro
Sistema
Pantalla 4

Crear primera cuenta.

Ejemplo

Efectivo
Banco
Mercado Pago
3. Dashboard (Pantalla Principal)

La pantalla más importante de toda la aplicación.

Cabecera
Saludo
Fecha
Foto de perfil
Tarjeta Balance

Mostrará:

Saldo Total

Ingresos

Gastos

Balance Mensual
Tarjeta Presupuesto

Mostrará

porcentaje usado
restante
barra de progreso
Tarjeta Reservas

Ejemplo

Vacaciones

$320.000

80%
Tarjeta Objetivos

Ejemplo

Notebook

35%

Faltan $250.000
Últimos movimientos

Lista de las últimas transacciones.

Próximos vencimientos

Ejemplo

Netflix

Internet

Seguro

Botón flotante (+)

Permitirá agregar:

gasto
ingreso
transferencia
4. Pantalla de Transacciones

Lista completa.

Filtros

Fecha
Cuenta
Categoría
Etiqueta
Tipo
Importe

Buscador.

Ordenamiento.

Acciones

Crear

Editar

Duplicar

Eliminar

Compartir comprobante

5. Crear Transacción

Esta será una de las pantallas más completas.

Campos

Cuenta

Tipo

Monto

Categoría

Subcategoría

Fecha

Hora

Nota

Ubicación

Etiquetas

Adjuntos

Repetición

Vista previa

Mientras completa el formulario se verá:

Saldo anterior

↓

Nuevo saldo
6. Accounts

Lista de cuentas.

Cada tarjeta mostrará

Nombre

Saldo

Color

Último movimiento

Acciones

Crear

Editar

Archivar

Ocultar saldo

7. Budgets

Lista de presupuestos.

Cada tarjeta mostrará

Categoría

Gastado

Restante

Porcentaje

Acciones

Nuevo presupuesto.

Editar.

Eliminar.

8. Reserves

Lista de fondos.

Ejemplo

Vacaciones

Auto

Emergencias

Casa

Cada tarjeta tendrá

Objetivo

Progreso

Saldo actual

9. Goals

Muy parecido a Reservas.

Con fecha objetivo.

Mostrará

Tiempo restante.

Dinero faltante.

Ahorro mensual recomendado.

10. Reportes

Será una pantalla enorme.

Resumen

Ingresos.

Gastos.

Balance.

Gráficos
Barras
Líneas
Torta
Tendencias
Comparaciones

Mes anterior.

Año anterior.

Categorías.

Exportar

PDF.

Excel.

CSV.

11. Calendario

Una vista mensual.

Cada día mostrará:

Ingresos.

Gastos.

Recordatorios.

12. Recordatorios

Lista de pagos.

Ejemplo

Netflix

15 Julio

Pendiente
13. Estadísticas

Mostrará información inteligente.

Ejemplos

Gastás un 22% más los viernes.

Tu gasto en comida aumentó un 15%.

Este mes ahorraste más que el anterior.
14. Configuración

General

Idioma

Tema

Moneda

Backup

Seguridad

Notificaciones

Importar

Exportar

Acerca de

15. Perfil

Avatar.

Nombre.

Moneda favorita.

Objetivos cumplidos.

Nivel de ahorro.

Navegación General

                    Splash
                       │
                       ▼
                 Onboarding
                       │
                       ▼
                  Dashboard
        ┌─────────┼──────────┐
        ▼         ▼          ▼
Transactions  Accounts   Budgets
│         │          │
▼         ▼          ▼
Create Tx   Edit Account  Budget Detail
│
▼
Transaction Detail

Dashboard
├── Reserves
├── Goals
├── Reports
├── Calendar
├── Reminders
├── Statistics
├── Settings
└── Profile

Barra inferior (Bottom Navigation)

La barra tendrá 5 pestañas principales:

🏠 Inicio

💳 Cuentas

➕ Registrar

📊 Reportes

⚙️ Ajustes

El botón central (Registrar) será un botón destacado (FAB integrado) para registrar rápidamente un ingreso, gasto o transferencia.

Menú lateral (Navigation Drawer)

Las funciones menos frecuentes estarán en un menú lateral:

Objetivos
Reservas
Calendario
Recordatorios
Exportar datos
Importar datos
Copia de seguridad
Ayuda
Acerca de

Así mantenemos la navegación principal limpia.

Flujo principal de uso

Abrir app
│
▼
Dashboard
│
▼
Registrar gasto
│
▼
Guardar
│
▼
Dashboard actualizado automáticamente

