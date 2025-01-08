node {
    stage('Build') {
        echo "Build success in scripted pipeline"
    }
    stage('Test') {
        echo "Test success in scripted pipeline"
    }
    stage('Deploy') {
        echo "Deployment success in scripted pipeline Updated"
    }
}
