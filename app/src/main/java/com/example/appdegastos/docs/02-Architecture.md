## Architecture.md (VERSIÓN 1.0 – APROBADA)

## Arquitectura

## Patrón: MVVM + Clean Architecture

UI (Compose)

↓

ViewModel

↓

UseCase

↓

Repository

↓

Room / API

## Estructura definitiva del proyecto

app/

│

├── data/

│   ├── local/

│   │   ├── dao/

│   │   ├── database/

│   │   ├── datastore/

│   │   ├── entity/

│   │   └── converter/

│   │
│   ├── remote/

│   │   ├── api/

│   │   ├── dto/

│   │   └── service/

│   │

│   ├── mapper/

│   │

│   └── repository/

│

├── domain/

│   ├── model/

│   ├── repository/

│   ├── usecase/

│   │

│   ├── dashboard/

│   ├── transaction/

│   ├── budget/

│   ├── reserve/

│   ├── report/

│   └── settings/

│

├── presentation/

│   ├── common/

│   │   ├── components/

│   │   ├── dialogs/

│   │   ├── snackbar/

│   │   ├── theme/

│   │   ├── animation/

│   │   └── util/

│   │

│   ├── navigation/

│   │

│   ├── splash/

│   ├── onboarding/

│   ├── dashboard/

│   ├── transactions/

│   ├── accounts/

│   ├── budgets/

│   ├── reserves/

│   ├── goals/

│   ├── reports/

│   ├── settings/

│   └── profile/

│

├── di/

│

└── util/


## Tecnologías aprobadas

Kotlin

Jetpack Compose

Material Design 3

Room

Hilt

Navigation Compose

DataStore

Coroutines

Flow

Coil

WorkManager

Kotlin Serialization

Timber

JUnit

Mockito

Compose UI Test


## Arquitectura de pantallas

dashboard/

DashboardScreen.kt

DashboardViewModel.kt

DashboardUiState.kt

DashboardEvent.kt

DashboardAction.kt

components/





