
def call(Map stageParams) {
    checkout(
        [$class: 'GitSCM', 
        branches: [[name: stage.Params.branch]], 
        userRemoteConfigs: [[url: stageParams.url]]
    ])
}