# Database.md (VERSIÓN 1.0 – APROBADA)

## Filosofía

Toda la aplicación funcionará 100% offline.

Room será la fuente de verdad.

En el futuro podrá sincronizar con la nube.

## Entidades definitivas

### 1. AccountEntity

Representa una cuenta.

Ejemplos:

Efectivo
Banco Nación
Mercado Pago
Ualá
PayPal

### 2. TransactionEntity 

Representa cualquier movimiento.

Tipos:

Gasto
Ingreso
Transferencia

### 3. CategoryEntity

Ejemplos:

Comida
Transporte
Salud
Educación

### 4. SubcategoryEntity

Ejemplo:

Comida

↓

Restaurante

↓

Supermercado

↓

Delivery

### 5. BudgetEntity

Presupuestos.

Mensual

Semanal

Categoría

### 6. ReserveEntity

Ejemplos:

Vacaciones
Auto
Emergencias
Casa

### 7. GoalEntity

Objetivos.

Ejemplo:

Comprar notebook

Monto objetivo

Fecha

### 8. ReminderEntity

Recordatorios.

Ejemplo:

Seguro

Internet

Netflix

Tarjeta

### 9. RecurringTransactionEntity

Transacciones automáticas.

Ejemplo:

Sueldo

Alquiler

Spotify

### 10. AttachmentEntity

Fotos.

PDF.

Comprobantes.

### 11. TagEntity

Etiquetas.

Ejemplo:

Trabajo

Familia

Viaje

### 12. CurrencyEntity

USD

ARS

EUR

BRL

### 13. ExchangeRateEntity

Cotizaciones.

### 14. SettingsEntity

Configuración.

### 15. UserProfileEntity

Nombre.

Avatar.

Moneda.

Idioma.

### Relaciones 

Account

│

├──── Transaction

│          │

│          ├──── Category

│          │

│          ├──── Attachment

│          │

│          └──── Tag


