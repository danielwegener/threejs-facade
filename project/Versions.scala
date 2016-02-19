object Versions extends WebJarsVersions with ScalaJSVersions with SharedVersions
{
	val scala = "2.11.6"

	val akkaHttp = "2.0.1"

	val ammonite = "0.4.8"

}

trait ScalaJSVersions {

	val jqueryFacade = "0.6"

	val jsext = "0.5"

	val dom = "0.9.0"

	val codemirrorFacade = "5.4-0.5"

	val binding = "0.7.15"

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

	val codemirror = "5.3"
}

