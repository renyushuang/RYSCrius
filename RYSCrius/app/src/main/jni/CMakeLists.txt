# 1.指定cmake最小版本
# 命令可选，但是cmake使用了高级的命令，那么需要提醒升级
cmake_minimum_required(VERSION 3.4.1)

# 2.设置项目名称
# 这个命令不是强制的，试了一下，这个命名和你的so库应该相同，如果不同的话找不到so库
#
# 这个命令不是强制性的，但最好都加上。它会引入两个变量 demo_BINARY_DIR 和 demo_SOURCE_DIR，
# 同时，cmake 自动定义了两个等价的变量 PROJECT_BINARY_DIR 和 PROJECT_SOURCE_DIR
#project(helloJniLib)

## 3.生成动态库
add_library(helloJniLib SHARED
        com_renyushuang_ryscrius_JniHelloWord.c)

add_library(NativeCodeCallJavaMethod SHARED
        com_renyushuang_ryscrius_CallJavaMethodFromNativeCode.c)

# 3.1.add_library 默认生成是静态库，通过以上命令生成文件名字，
#
# 在 Linux 下是：
# - helloJniLib 可执行文件
# - helloJniLib.a 静态库
# - helloJniLib.so 动态库
# 在 Windows 下是：
#  - helloJniLib.exe
#  - helloJniLib.lib
#  - helloJniLib.dll

# 3.2.指定包含哪些文件
# add_library(helloJniLib SHARED demo.cpp test.cpp util.cpp)

# 3.3 发现一个目录下所有的源代码文件并把他存在一个列表里
#aux_source_directory(. SRC_LIST)
#add_library(helloJniLib SHARED ${SRC_LIST})

# 3.4 自定义搜索规则
#file(GLOB SRC_LIST "*.c" "*.cpp" "protocol/*.cpp")
#add_library(helloJniLib SHARED ${SRC_LIST})
## 或者
# file(GLOB SRC_LIST "*.cpp")
# ile(GLOB SRC_PROTOCOL_LIST "protocol/*.cpp")
# add_library(demo ${SRC_LIST} ${SRC_PROTOCOL_LIST})
## 或者
# aux_source_directory(. SRC_LIST)
# aux_source_directory(protocol SRC_PROTOCOL_LIST)
# add_library(demo ${SRC_LIST} ${SRC_PROTOCOL_LIST})


# 3.5生成可执行文件
# add_executable(demo demo.cpp)

# 3.6生成静态库 Android 使用so只能生成动态链接库
#add_library(helloJniLib STATIC
#        com_renyushuang_ryscrius_JniHelloWord.c)



# Include libraries needed for hello-jni lib
# 设置target需要链接的库
target_link_libraries(helloJniLib # 目标库
                      android # 目标库需要链接的库
                      log) # 目标库需要链接的库
