# helloKotlin
Hello Kotlin World

## Setup & Hello World
### Prepare
```
$ brew update
$ brew install kotlin
$ brew install gradle
```

### VS Code Extension
- Kotlin
- Kotlin Language
- Kotlin Formatter
- Code Runner

### Hello World
```
touch helloWorld.kt

$ kotlinc helloWorld.kt -include-runtime -d helloWorld.jar
$ java -jar helloWorld.jar 
Hello World!
```

### Create Project
```
gradle init --type=kotlin-application

Found existing files in the project directory: '/Users/kota.oue/ghq/github.com/kotaoue/helloKotlin'.
Directory will be modified and existing files may be overwritten.  Continue? (default: no) [yes, no] yes

Enter target Java version (min: 7, default: 21): 

Project name (default: helloKotlin): 

Select application structure:
  1: Single application project
  2: Application and library project
Enter selection (default: Single application project) [1..2] 

Select build script DSL:
  1: Kotlin
  2: Groovy
Enter selection (default: Kotlin) [1..2] 

Select test framework:
  1: kotlin.test
  2: JUnit Jupiter
Enter selection (default: kotlin.test) [1..2] 

Generate build using new APIs and behavior (some features may change in the next minor release)? (default: no) [yes, no] 


> Task :init
Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10/samples/sample_building_kotlin_applications.html
```

## Links
- [VSCodeでKotlinの開発環境構築手順](https://zenn.dev/yt_hsgw/articles/ca77fb7be734a5)
- [【2024年版】VSCodeでKotlinを実行する方法（Windows&Mac対応）](https://codeforfun.jp/how-to-run-kotlin-in-vscode/)