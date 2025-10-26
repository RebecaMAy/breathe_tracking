# 🌍 Propuesta de Modelo de Negocio: Red de Sensores Móviles Hiperlocales

Este proyecto define un **Modelo de Negocio** basado en un ecosistema de roles que aprovecha las flotas de trabajadores existentes para crear una **red de sensores móviles** de bajo coste. El objetivo es generar **datos ambientales hiperlocales** (calidad del aire, ruido, etc.) que son valiosos tanto para la gestión operativa B2B como para el consumo de datos B2C.

## 👥 Segmentos de Clientes y Roles

El ecosistema se articula en torno a tres roles clave, cada uno con una función y propuesta de valor diferenciada:

| Rol | Función Principal | Propuesta de Valor Clave |
| :--- | :--- | :--- |
| **1. Administrador** (Cliente B2B) | Paga la suscripción SaaS para la **gestión de su flota** y consume los datos ambientales de su zona. | **Control Operativo** de Nodoportadores, **Optimización de Rutas** y **Datos Propios** (Mapas de Calor). |
| **2. Nodoportador** (Generador de Datos) | Empleado que lleva el **sensor (nodo)** en sus rutas de trabajo, generando datos de forma pasiva. | **Simplicidad** (hardware no invasivo) y **Canal de Reporte** de incidencias fácil. |
| **3. Cliente Final** (Consumidor) | Particulares (B2C) o Empresas (B2B Secundario) que **consumen los datos** ambientales hiperlocales. | **Salud y Bienestar** (alertas y mapas personalizados), **Toma de Decisiones Informada** (valoración de zonas). |

***

## 💰 Modelo de Ingresos y Viabilidad

El proyecto se financia mediante una estrategia de ingresos dual que garantiza la sostenibilidad de la red:

### 1. Ingresos B2B (Principal: El Sustento de la Red)
* **Suscripción SaaS:** Tarifa mensual/anual por cada **Nodoportador** activo. Cubre:
    * Acceso a la **Plataforma Web** de gestión de flotas.
    * **Mantenimiento** y reemplazo del hardware sensor.
    * Acceso a los **datos propios** generados por sus equipos.

### 2. Ingresos B2C y B2B Secundario (Datos)
* **Modelo Freemium (B2C):** Acceso gratuito a un mapa general con datos limitados.
* **Suscripción Premium (B2C):** Tarifa mensual para usuarios que desbloquea **informes históricos**, **alertas personalizadas** y **monitorización de múltiples zonas**.
* **Venta de Acceso a API (B2B Secundario):** Venta de *datasets* agregados y anonimizados a terceros (ej. consultoras, inmobiliarias) que requieren información ambiental a gran escala.

***

## 💻 Arquitectura Tecnológica (Recursos Clave)

El servicio se implementa a través de una plataforma de tres canales que gestiona la interacción con cada rol:

| Rol | Canal de Acceso | Funcionalidad |
| :--- | :--- | :--- |
| **Administrador** | **Plataforma Web de Gestión (SaaS)** | Dashboard de control operativo, gestión de incidencias, informes. |
| **Nodoportador** | **Aplicación Móvil Ligera (App)** | Tracking anónimo y de bajo consumo, canal simple para reportar incidencias de hardware. |
| **Cliente Final** | **Web Pública / Aplicación Móvil** | Visualización de mapas de calor ambientales y gestión de suscripciones. |

Las **Actividades Clave** incluyen el desarrollo y mantenimiento **24/7** de estas tres interfaces, la **venta directa B2B** (licitaciones y *onboarding* de Administradores), y el **análisis de Big Data** para transformar los datos brutos en información útil.
