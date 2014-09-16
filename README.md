JUNIT
=====


@ContextConfiguration(locations = { "[LOCATION]" })

LOCATION:
  * file:src/test/resources/com/rajput/unitTest/abc/junitExample-context.xml
  * Keep in same package both AbcTest.java and junitExample-context.xml and location would be file name only.
  * Use 'classpath:' and '/' before location such as classpath:junitExample-context.xml
