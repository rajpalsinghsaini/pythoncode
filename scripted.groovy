node {
    stage('Build') {
        echo "Build success in scripted pipeline in VScode"
    }
    stage('Test') {
        echo "Test success in scripted pipeline in VSCode"
    }
    stage('Deploy') {
        echo "Deployment success in scripted pipeline Updated"
    }
}
