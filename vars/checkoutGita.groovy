def call(String odakleDaCheckoutuje,String linkGitrepozitorijuma,String grana,String odredisteCheckouta){
  checkout([$class: 'GitSCM', branches: [[name: '*/${grana}']],
            extensions: [], 
            userRemoteConfigs: [[url: 'https://github.com/StevaRmnk/DevopsRepo']]])
}
