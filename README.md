<h1 align="center" style="font-weight: bold;">Certification API 💻</h1>

<p align="center">
 <a href="#tech">Technologies</a> • 
 <a href="#started">Getting Started</a> • 
 <a href="#routes">API Endpoints</a> 
</p>

<p align="center">
    <b>This project is an API built using Java, Java Spring, PostgreSQL as the database </b>
</p>
Project developed on the NLW Expert Java track

<h2 id="technologies">💻 Technologies</h2>

- Java
- Spring Boot
- PostgreSQL

<h2 id="started">🚀 Getting started</h2>

Here you describe how to run your project locally


<h3>Installation</h3>

1. Clone the repository:

```bash
git clone https://github.com/seanycarol/nlw-expert-java.git
```

2. Install dependencies with Maven
3. Install [PostgreSQL](https://www.postgresql.org/)
4. Run the container (desktop docker required [DOCKER DESKTOP](https://www.docker.com/products/docker-desktop/))
```bash
docker-compose up -d
```
5. Populate the database by running the main method of the CreateSeed class in src/main/java/com.seanycarol.certification_nlw/seed/CreateSeed.java;


<h3>Usage</h3>

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /questions/technology/{technology}</kbd>     | Retrieve a list of all questions for a given technology
| <kbd>GET /ranking/top10</kbd>     | Retrieve a list of the top 10 highest scoring users 
| <kbd>POST /students/verifyIfHasCertification</kbd>     | Check if student has certification [request details](#verify-if-has-certification)
| <kbd>POST /students/certification/answer</kbd>     | Retrieve student certification answer [request details](#student-certification-answer)

<h3 id="get-questions-by-technology">GET /questions/technology/{technology}</h3>
<h3 id="get-top10">GET /ranking/top10</h3>

<h3 id="verify-if-has-certification">POST /students/verifyIfHasCertification</h3>

**REQUEST**
```json
{
    "email": "teste@gmail.com",
    "technology": "JAVA"
}
```
<h3 id="student-certification-answer">POST /students/certification/answer</h3>

**REQUEST**
```json
{
    "email": "teste@gmail.com",
    "technology": "JAVA",
    "questionsAnswers": [
        {
            "questionID": "c5f02721-6dc3-4fa6-b46d-6f2e8dca9c66",
            "alternativeID": "bafdf631-6edf-482a-bda9-7dce1efb1890" 
        },
        {
            "questionID": "b0ec9e6b-721c-43c7-9432-4d0b6eb15b01",
            "alternativeID": "f8e6e9b3-199b-4f0d-97ce-7e5bdc080da9" 
        },
        {
            "questionID": "f85e9434-1711-4e02-9f9e-7831aa5c743a",
            "alternativeID": "d3e51a56-9b97-4bb8-9827-8bcf89f4b276"
        }
    ]
}
```
