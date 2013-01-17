powerloom-clj
=============

Simple Clojure wrappers for the PowerLoom AI Inferencing System for ISI

Please see the PowerLoom web site (http://www.isi.edu/isd/LOOM/PowerLoom/) for full documentation on the PLM know representation language.

A sample PLM file is in the top level directory: test.plm

For my other open source projects, visit: http://markwatson.com/opensource

##Installation

<pre>
	
	lein deps
	cp local-jar/powerloom-clj.jar lib/

	-- Runing the example program:

	$ lein repl
	user=> (use 'test)
	Initializing...    done.
	((C4) (C3))
	((C4 KnowledgeBooks Systems) (C3 Moms Grocery))
	nil
	user=> 1
	user=> (ns test)
	nil
	test=> (def x (do-query "all (?x ?name) (and (company ?x) (company-name ?x ?name))"))
	#'test/x
	test=> x
	(("C4" "KnowledgeBooks Systems") ("C3" "Moms Grocery"))
	test=> 
	
</pre>

## License

Copyright (C) 2010 Mark Watson and the Authors of PowerLoom

Distributed under the same licenses as PowerLoom:

License
Since 2005, PowerLoom® is available free-of-charge under a triple disjunctive open-source licensing scheme that allows you to pick the Mozilla Public License v. 1.1 (MPL), the GNU General Public License v. 2.0 (GPL) or the the GNU Lesser Public License v. 2.1 (LGPL) to fit your needs. This scheme is similar to what's used for the Mozilla web browser and should give people maximum flexibility to use PowerLoom even for commercial development while still retaining the advantages of open-source licensing.

