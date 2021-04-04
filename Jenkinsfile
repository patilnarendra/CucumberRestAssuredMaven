pipeline {
agent any
    stages {
       stage('Stage 1') {
        steps {
             withMaven(maven : 'maven_3_2_5'){
                sh 'mvn clean compile'                  
                  }

              
        	}
       	}
       	
       stage('Stage 2') {
        steps {
            withMaven(maven : 'maven_3_2_5'){
                sh 'mvn test'                
                }
        	}
       	}
       	
      stage('Cucumber Reports') {
        steps {
           cucumber buildStatus: "UNSTABLE",
           fileIncludePattern: "**/cucumber-report.json",
           jsonReportDirectory: 'target'
        	}
       	}
    }
}
