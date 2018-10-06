// Prints Initials for a name passed as a parameter

@Grapes(
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.8.1')
)

import org.apache.commons.lang3.text.WordUtils
String name = 'John Patrick Doe'
WordUtils mywutil = new WordUtils()
println mywutil.initials(name)

// Troubleshooting
// I had  org.apache.commons misspelt as com.apache.commons for error: 
// 1 compilation error:
// Exception thrown
// java.lang.RuntimeException: Error grabbing Grapes -- 
// [unresolved dependency: com.apache.commons#commons-lang3;3.8.1: not found]