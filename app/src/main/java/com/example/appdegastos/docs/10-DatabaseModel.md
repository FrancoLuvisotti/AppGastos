📄 10 - DatabaseModel.md (VERSIÓN 1.0 - APROBADA)
Objetivos

La base de datos debe cumplir los siguientes requisitos:

100% offline.
Escalable.
Fácil de migrar.
Sin duplicación de información.
Optimizada para búsquedas y reportes.
Compatible con futuras sincronizaciones en la nube.

Diagrama general

                      Account
                         │
                         │
                 Transaction
                  │   │   │
                  │   │   └──────── Attachment
                  │   │
                  │   └──────── Tag
                  │
                  └──────── Category
                           │
                           └──────── SubCategory

Budget ─────────────── Category

Reserve

Goal

Reminder

RecurringTransaction

Currency
│
└──── ExchangeRate

Settings

UserProfile

1. Account

Representa dónde está el dinero.

Ejemplos

Efectivo
Caja de ahorro
Cuenta corriente
Mercado Pago
Ualá
PayPal
Tarjeta de crédito

Campos


| Campo          | Tipo    | Descripción           |
| -------------- | ------- | --------------------- |
| id             | Long    | PK                    |
| name           | String  | Nombre                |
| type           | Enum    | Tipo                  |
| balance        | Double  | Saldo actual          |
| currencyId     | Long    | FK                    |
| color          | String  | Color                 |
| icon           | String  | Ícono                 |
| includeInTotal | Boolean | Participa del balance |
| archived       | Boolean | Archivada             |

2. Transaction

Es la tabla más importante.

Campos

Campo

| Campo       | Tipo   |
| ----------- | ------ |
| id          | Long   |
| accountId   | Long   |
| categoryId  | Long   |
| amount      | Double |
| type        | Enum   |
| date        | Long   |
| note        | String |
| location    | String |
| latitude    | Double |
| longitude   | Double |
| recurringId | Long?  |
| createdAt   | Long   |
| updatedAt   | Long   |


Tipos

Expense
Income
Transfer

3. Category

Campos

Campo

| Campo | Tipo   |
| ----- | ------ |
| id    | Long   |
| name  | String |
| icon  | String |
| color | String |
| type  | Enum   |


Ejemplos

Comida

Transporte

Salud

Educación

Servicios

4. SubCategory

Ejemplo

Comida

↓

Restaurante

↓

Delivery

↓

Supermercado

5. Budget

Campos

| Campo           | Tipo   |
| --------------- | ------ |
| id              | Long   |
| categoryId      | Long   |
| limit           | Double |
| spent           | Double |
| month           | Int    |
| year            | Int    |
| alertPercentage | Int    |


6. Reserve

Representa dinero separado.

Ejemplos

Vacaciones

Emergencias

Casa

Auto

Campos

| Campo   | Tipo   |
| ------- | ------ |
| id      | Long   |
| name    | String |
| target  | Double |
| current | Double |
| color   | String |


7. Goal

Muy parecido a una reserva.

La diferencia:

Tiene fecha objetivo.

Ejemplo

Comprar notebook.

Comprar auto.

Viajar.

8. Reminder

Recordatorios.

Ejemplo

Netflix

Internet

Seguro

ABL

Expensas

9. RecurringTransaction

Ejemplo

Sueldo

Spotify

Netflix

Internet

Alquiler

Frecuencia

Diario
Semanal
Mensual
Anual
10. Attachment

Fotos.

PDF.

Facturas.

Tickets.

11. Tag

Ejemplos

Trabajo

Familia

Viaje

Vacaciones

12. Currency

Campos

| Campo  | Tipo   |
| ------ | ------ |
| id     | Long   |
| code   | String |
| symbol | String |
| name   | String |


Ejemplos

ARS

USD

EUR

BRL

13. ExchangeRate

Solo para el futuro.

Permitirá múltiples monedas.

14. Settings

Configuración de la aplicación.

Tema.

Idioma.

Moneda.

PIN.

Backup.

15. UserProfile

Datos del usuario.

Nombre.

Avatar.

Moneda favorita.

Relaciones

Account 1 ─────────── N Transaction

Category 1 ────────── N Transaction

Category 1 ────────── N Budget

Transaction 1 ─────── N Attachment

Transaction N ─────── N Tag

Currency 1 ────────── N Account

Currency 1 ────────── N ExchangeRate

Índices

Se crearán índices en:

Transaction.date

Transaction.accountId

Transaction.categoryId

Reminder.date

Budget.month

Budget.year

Estrategia de migraciones

Siempre utilizaremos:

Room Migration

Nunca destruiremos la base del usuario.

Convenciones

Todos los nombres estarán en inglés.

Las tablas terminarán en:

Entity

Ejemplo

TransactionEntity

BudgetEntity

GoalEntity