object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.11.7"

	val akkaHttp = "2.4.2"

	val ammonite = "0.4.8"

}

trait ScalaJSVersions {

	val threejsFacade =  "0.0.74-0.3.0"

	val jqueryFacade = "0.11"

	val jsext = "0.5"

	val dom = "0.9.0"

	val codemirrorFacade = "5.5-0.5"

	val binding = "0.8.2"

}

//versions for libs that are shared between client and server
trait SharedVersions
{
	val autowire = "0.2.5"

	val scalaRx = "0.2.8"

	val quicklens = "1.3.1"

	val scalaTags = "0.5.1"

	val scalaCSS = "0.3.1"

	val productCollections = "1.4.2"

	val utest = "0.3.1"
}


trait WebJarsVersions{

	val jquery =  "2.1.3"

	val semanticUI = "1.12.3"

	val threeJs = "r74"

	val codemirror = "5.5"
}

