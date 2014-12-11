Continuous Integration
======================
Continuous Integration (CI) is a software development practice that requires
developers to integrate code into a shared repository several times a day.

Concepts
--------
* The building process is automated.
* It should be easy for everyone to get the latest executable.
* Everybody should be able to keep track of progress.
* Automated deployment.

Benefits
--------
* Bugs can be detected early on and can be found in no time.
* Continuously integrating allows a team to focus on creating new features.
instead of merging/debugging huge piles of code.
* The project schedule is easier to keep, since less time is lost integrating.
* A solid code base is available at all times.
* A good team is able to manage itself

Drawbacks
---------
* If project requirements change, the code is already deeply merged and it
might be difficult to do major changes.
* Since Continuous Integration requires the build to always be operational, it
might be frustrating for a team to make things work right on time.

### Team responsibilities
* Code has to be checked-in regularly.
* Broken or untested code mustn't be checked-in.
* No check-ins if the build is broken.
* A broken build has to be fixed before checking-in new code fragments.

Continuous Deployment
=====================
Continuous Deployment is related to Continuous Integration and refers to the
release of software that passes automated tests. With low-risk releases one can
quickly adapt to customer needs. Continuously deploying software allows greater
collaboration between developers and customers.
