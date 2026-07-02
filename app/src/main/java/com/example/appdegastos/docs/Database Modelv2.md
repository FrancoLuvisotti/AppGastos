Filosofía

Pendify debe soportar desde el primer día:

✅ Múltiples cuentas
✅ Múltiples monedas
✅ Múltiples usuarios (en el futuro)
✅ Sincronización en la nube
✅ Reportes complejos
✅ Miles de transacciones
✅ Copias de seguridad
✅ Android, Web y Desktop compartiendo el mismo modelo
Módulos de la Base de Datos

En lugar de pensar en tablas, pensemos en módulos.

Finanzas
│
├── Accounts
├── Transactions
├── Categories
├── Budgets
├── Goals
├── Reserves
└── Reports

Configuración
│
├── Settings
├── User
├── Currency
└── Backup

Productividad
│
├── Reminder
├── RecurringTransaction
└── Notification

Archivos
│
├── Attachment
└── TransactionTag

Modelo Financiero

Aquí viene el cambio más importante.

En Pendify TODO será una transacción.

No importa si es:

gasto
ingreso
transferencia
mover dinero a una reserva
sacar dinero de una reserva
pagar tarjeta
cobrar sueldo

Todo será una transacción.

Eso simplifica muchísimo el código.

Nuevo tipo de Transaction

Expense

Income

Transfer

ReserveDeposit

ReserveWithdraw

GoalDeposit

GoalWithdraw

CreditCardPayment

Adjustment

Ya no necesitaremos crear lógica distinta para cada módulo.

Accounts

Las cuentas ya no serán solamente bancos.

También podrán ser:

Cash

Checking Account

Savings Account

Credit Card

Investment

Digital Wallet

Crypto Wallet

Esto nos permitirá agregar inversiones más adelante.

Las Reservas ya no guardan dinero

Aquí viene un cambio importante.

Una reserva NO tendrá saldo.

Ejemplo:

Reserva Vacaciones

↓

Transacción +10000

↓

Transacción +5000

↓

Transacción -3000

↓

Saldo = 12000

El saldo siempre se calcula con las transacciones.

Ventajas:

nunca se desincroniza
historial completo
auditoría
Lo mismo para Goals

Un objetivo tampoco tendrá saldo.

Solo tendrá:

Objetivo

↓

Transacciones

↓

Progreso calculado

Tarjetas de Crédito

No quiero tratarlas como una cuenta normal.

Tendrán información propia.

Nueva tabla.

CreditCard

Campos:

id

accountId

closingDay

dueDay

creditLimit

interestRate

bankName

Luego podremos implementar cuotas correctamente.

Installments

Tabla nueva.

Installment

Ejemplo:

Notebook

12 cuotas

Cada mes genera automáticamente una transacción.

Transferencias

En vez de una sola transacción.

Habrá dos.

Cuenta A

↓

-500

↓

transferGroupId = 15

Cuenta B

↓

+500

↓

transferGroupId = 15

Así cada cuenta mantiene su historial correctamente.

TransactionTag

En vez de:

Transaction

↓

Tag

Usaremos una tabla puente.

Transaction

↓

TransactionTag

↓

Tag

Porque una compra puede tener varias etiquetas.

Attachment

Ahora también podrá guardar:

PDF
Imagen
Audio
Documento
Notification

Nueva tabla.

Notification

Para almacenar:

recordatorios enviados
alertas
presupuesto excedido
pagos próximos
AuditLog

Quiero agregar algo que casi ninguna app tiene.

AuditLog

Guardará:

Usuario eliminó transacción

↓

Fecha

↓

Valor anterior

↓

Valor nuevo

Esto será muy útil para recuperar errores.

Future Sync

Cada tabla tendrá estos campos ocultos.

createdAt

updatedAt

deletedAt

syncStatus

deviceId

Esto facilitará muchísimo una futura sincronización.

Dashboard

El Dashboard NO tendrá tabla.

Siempre se calculará.

Así evitamos inconsistencias.

Reportes

Los reportes tampoco tendrán tabla.

Se generarán mediante consultas SQL.

Nueva estructura de entidades
AccountEntity

CreditCardEntity

TransactionEntity

TransactionTagEntity

TagEntity

CategoryEntity

SubCategoryEntity

BudgetEntity

ReserveEntity

GoalEntity

InstallmentEntity

ReminderEntity

RecurringTransactionEntity

AttachmentEntity

CurrencyEntity

ExchangeRateEntity

NotificationEntity

SettingsEntity

UserProfileEntity

AuditLogEntity

Relaciones (Versión Definitiva)

UserProfile
│
│
▼
Account────────────Currency
│
│
▼
Transaction────────Category
│                  │
│                  ▼
│             SubCategory
│
├────────Attachment
│
├────────TransactionTag────Tag
│
├────────RecurringTransaction
│
├────────Installment
│
├────────Reserve
│
└────────Goal

Budget────────Category

Reminder────────Transaction

CreditCard────────Account

Notification

AuditLog

