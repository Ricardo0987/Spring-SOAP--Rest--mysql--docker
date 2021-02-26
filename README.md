# employee solution

> Spring - SOAP - Rest - mysql - docker 

## exec proyect 🔥

```shell
#RUN MYSQL and Spring
## using docker
# before install docker and docker-compose
## then run:
docker-compose up -d

#RUN only SPRING 
#install maven; i'm using 3.6.3 version and java 8
#before mvn clean install
mvn spring-boot:run

#generate jar
mvn clean package
```

> Client SOAP
`http://localhost:4444/employeeServiceSoap?wsdl`

> Client Rest
`http://localhost:8181/employee`

### example rest request (curl)

```shell
curl --request GET \
  --url http://localhost:8181/employee \
  --header 'Content-Type: application/json' \
  --data '{
	"names":"Ricardo",
	"surNames":"Ospina P",
	"documentType":"CC",
	"documentNumber":"1039456876",
	"birthDate":"1988/12/25",
	"dateLinkCompany":"2012/10/08",
	"position":"developer",
	"salary":2500000
}'
```

### example rest response (curl)

```json
{
  "names": "Ricardo",
  "surNames": "Ospina P",
  "documentNumber": "1039456876",
  "documentType": "CC",
  "birthDate": "1988/12/25",
  "dateLinkCompany": "2012/10/08",
  "position": "developer",
  "salary": 2500000.0,
  "currentAge": "32 year(s), 2 month(s), 1 day(s)",
  "companyLinkTime": "8 year(s), 4 month(s), 18 day(s)"
}
```

### schema sql

```roomsql
DROP DATABASE IF EXISTS `employee_db`;
CREATE DATABASE IF NOT EXISTS `employee_db`; 
USE `employee_db`;


DROP TABLE IF EXISTS `employee`;
CREATE TABLE IF NOT EXISTS `employee` (
  `document_number` varchar(255) NOT NULL,
  `birth_date` varchar(255) NOT NULL,
  `date_link_company` varchar(255) NOT NULL,
  `document_type` varchar(255) DEFAULT NULL,
  `names` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `salary` double NOT NULL,
  `sur_names` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`document_number`)
);
```

## problem description | `Spanish`

> Implementar en Java un servicio Rest que reciba como parámetros los atributos del objeto empleado(que será descrito más adelante) al ser invocado mediante el método GET.

> El servicio deberá validar los formatos de las fechas y que los atributos no vengan vacíos, adicionalmente deberá validar que el empleado sea mayor de edad.

> Una vez se hayan superado estas validaciones se deberá invocar un servicio web SOAP pasando como parámetro el objeto empleado, este último servicio deberá almacenar la información en una base de datos mysql.

> El método REST responderá con el objeto en estructura JSON, en el que se deberá adicionar la siguiente información:
Tiempo de Vinculación a la compañía (años, meses y días). Edad actual del empleado (años, meses y días)

> Atributos del objeto empleado:
>- Nombres (String)
>- Apellidos (String)
>- Tipo de Documento (String)
>- Número de Documento (String)
>- Fecha de Nacimiento (Date)
>- Fecha de Vinculación a la Compañía (Date)
>- Cargo (String)
>- Salario (Double)