package com.soasta.jenkins.cloud.postbuild.StopTestEnvironment;

f=namespace(lib.FormTagLib)

f.entry(title:"CloudTest Server",field:"cloudTestServerID") {
    f.select()
}
f.entry(title:"Test Environment Name",field:"name") {
    f.expandableTextbox()
}