SCD4J stands for Simple Continuous Delivery for Java and Groovy Developer. 
=============

In short, SCD4J is an automation platform for configuring and installing your Web IT infrastructure. With just one command you can install clusters and deploy applications. Note that SCD4J is not another option for Puppet or Chef. It is, actually, a SIMPLER option than those tools.

To know more about SCD4J and understand what are the advantages over competition, please take a look at [documentation](https://github.com/scd4j/gradle-plugins/wiki).

`build.gradle` example:
```
plugins {
    id "com.datamaio.scd4j" version "0.5.3"
}

scd4j {
    install {
        modules "my_module_dir"         // should be any dir into modules dir
        config  "my_config_file.conf"	// should be any properties file into config dir.
    }
}
```

For more details and complex installation take a look at the [wiki](https://github.com/scd4j/gradle-plugins/wiki/02.-Basics).

