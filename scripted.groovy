node {
    stage('Build') {
        echo "Build success in scripted pipeline in VScode Updated"
    }
    stage('Test') {
        echo "Test success in scripted pipeline in VSCode Updated"
    }
    stage('Deploy') {
        echo "Deployment success in scripted pipeline Updated again"
    }
}
