📄 12 - DesignSystem.md (VERSIÓN 1.0 – APROBADA)
Objetivo

Crear un sistema de diseño reutilizable, consistente y escalable para toda la aplicación.

Regla principal: Ningún componente podrá definir sus propios colores, tamaños o espaciados. Todo deberá provenir del Design System.

1. Identidad visual
   Personalidad

Pendify debe transmitir:

Profesionalismo
Claridad
Confianza
Simplicidad
Modernidad

No queremos una aplicación recargada.

2. Paleta de colores
   Tema claro
   Uso	Color
   Primario	#1E3A8A
   Secundario	#06B6D4
   Fondo	#F8FAFC
   Superficie	#FFFFFF
   Texto principal	#0F172A
   Texto secundario	#64748B
   Éxito	#22C55E
   Advertencia	#F59E0B
   Error	#EF4444
   Tema oscuro
   Uso	Color
   Fondo	#0F172A
   Superficie	#1E293B
   Texto	#F8FAFC
   Texto secundario	#CBD5E1
   Primario	#3B82F6
   Secundario	#22D3EE
3. Espaciados

Nunca escribiremos:

padding(16.dp)

Usaremos:

Spacing.XSmall = 4.dp
Spacing.Small = 8.dp
Spacing.Medium = 16.dp
Spacing.Large = 24.dp
Spacing.XLarge = 32.dp
Spacing.XXLarge = 48.dp
4. Bordes
   Radius.Small = 8.dp

Radius.Medium = 12.dp

Radius.Large = 16.dp

Radius.Extra = 24.dp
5. Elevaciones
   Elevation.None

Elevation.Small

Elevation.Medium

Elevation.Large
6. Tipografía
   Display

Para balances importantes.

Headline

Títulos.

Title

Subtítulos.

Body

Texto normal.

Label

Botones.

Nunca se definirán tamaños manualmente.

7. Iconografía

Toda la aplicación utilizará Material Symbols.

Ejemplos:

💰 Balance

📊 Reportes

🏦 Cuenta

💳 Tarjeta

🎯 Objetivo

📅 Calendario

⚙ Configuración

8. Botones
   PrimaryButton

Color principal.

SecondaryButton

Color secundario.

OutlinedButton

Borde.

DangerButton

Eliminar.

TextButton

Acciones menores.

9. Tarjetas

Todas las tarjetas tendrán:

Radio:

16dp

Padding interno:

16dp

Sombra:

Media

10. Campos de texto

Todos compartirán:

Icono opcional.

Label.

Placeholder.

Mensaje de error.

Ayuda.

11. Chips

Para:

Etiquetas.

Filtros.

Categorías.

12. Barras de progreso

Se usarán en:

Presupuestos.

Objetivos.

Reservas.

13. Diálogos

Tipos

Confirmación.

Eliminar.

Error.

Información.

Éxito.

14. Snackbars

Éxito.

Error.

Advertencia.

15. Estados

Cada pantalla tendrá obligatoriamente:

Loading

Spinner.

Skeleton.

Empty

Ilustración.

Texto.

Botón principal.

Error

Mensaje.

Botón Reintentar.

Success

Confirmación visual.

16. Animaciones

Duración:

200–300 ms.

Transiciones suaves.

Sin animaciones innecesarias.

17. Componentes reutilizables

Todos los componentes estarán en:

presentation/common/components/

Ejemplos:

PrimaryButton

SecondaryButton

MoneyCard

BalanceCard

BudgetCard

ReserveCard

GoalCard

TransactionItem

SectionHeader

EmptyState

LoadingState

ErrorState

SearchBar

FilterChip

TopBar

BottomNavigation

FloatingAddButton
18. Formato de dinero

Siempre respetará la moneda configurada.

Ejemplos:

$25.000,50

USD 100.50

€80,25
19. Formato de fechas

Configurable según la región.

Ejemplo:

29/06/2026

29 Jun 2026

Monday, June 29
20. Accesibilidad

Pendify deberá cumplir con:

Contraste adecuado.
Tamaño mínimo de toque de 48dp.
Compatibilidad con TalkBack.
Escalado de fuentes del sistema.
21. Convenciones visuales
    Ingresos

Siempre en verde.

Gastos

Siempre en rojo.

Transferencias

Siempre en azul.

Reservas

Siempre en celeste.

Objetivos

Siempre en violeta.

22. Componentes gráficos

Se utilizarán para:

Distribución de gastos.
Evolución mensual.
Balance anual.
Comparación de categorías.
Progreso de ahorro.
23. Diseño adaptable

La interfaz debe funcionar correctamente en:

Teléfonos pequeños.
Teléfonos grandes.
Tablets.
Pantalla dividida (Split Screen).