# MiTask 

### **Especificaciones**

#### **Requisitos Funcionales:**

1.  **Gestión de Usuarios y Roles:**

-   Las personas pueden acceder mediante un correo y contraseña en JWT.
-   Los usuarios pueden tener roles de "Administrador" o "Colaborador".
-   Los administradores pueden gestionar proyectos y tareas, mientras que los colaboradores solo pueden gestionar sus propias tareas asignadas.

2.  **Gestión de Proyectos:**

-   Crear, editar, consultar y eliminar proyectos.
-   A cada proyecto se le asignan los siguientes atributos:
-   ID del proyecto.
-   Nombre del proyecto.
-   Descripción.
-   Fecha de inicio y fin.
-   Estado (Activo, Finalizado, Cancelado).
-   Lista de usuarios asignados al proyecto (relación muchos a muchos).

3.  **Gestión de Tareas:**

-   Crear, editar, consultar y eliminar tareas relacionadas a proyectos específicos.
-   Cada tarea debe tener los siguientes atributos:
-   ID de la tarea.
-   Nombre de la tarea.
-   Descripción.
-   Prioridad (Baja, Media, Alta).
-   Estado (Pendiente, En Progreso, Completada, Cancelada).
-   Fecha de vencimiento.
-   Usuario asignado.

4.  **Consultas Avanzadas:**

-   Consultar todas las tareas de un usuario o proyecto específico.
-   Filtrar y ordenar las tareas según atributos como estado, prioridad o fecha de vencimiento.

5.  **Seguridad:**

-   Implementar autenticación y autorización utilizando Spring Security con JWT.
-   Restringir el acceso a los endpoints según el rol del usuario.

#### **Requisitos No Funcionales:**

1.  **Framework y Herramientas:**

-   Spring Boot 3.2.3 y JDK 17.
-   Uso de JWT para los accesos de usuarios.
-   Spring Data JPA para el manejo de entidades y repositorios.
-   Swagger para la documentación de la API.

2.  **Buenas Prácticas:**

-   Respetar los principios SOLID y patrones de diseño según corresponda.
-   Uso adecuado de DTOs, Services, Entities y Controllers.
-   Documentar el código con comentarios claros y útiles.

3.  **Base de Datos:**

-   Uso de MySQL o PostgreSQL.
-   Relación entre entidades mapeada correctamente con Spring Data JPA.

4.  **Documentación:**

-   Documentar todos los endpoints con Swagger, incluyendo parámetros, cuerpos de solicitud y respuestas.
-   Configurar CORS correctamente para permitir el consumo de la API desde un cliente externo.
