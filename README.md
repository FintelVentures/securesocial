# SecureSocial - the Fintel Fork

We are happy to report that SecureSocial is alive. Fintel uses SecureSocial and we remain committed to continuing the project. This is the official Fintel Ventures fork, and it combines the great work done by [@k4200](https://github.com/k4200) and [@risenhoover](https://github.com/risenhoover) in getting the project to run under Play Framework 2.7.

Based on the history of this code, the current code *may* contain some Fintel-specific bits and we will work to remove them as quickly as we find them, in order to return this fork to general use.

Play Framwork 2.8 is on our roadmap and we welcome any and all pull requests to help us get there.

The following comments are historical and included from prior forks (credited when possible)

# SecureSocial for Play Framework 2.7 (@k4200 comments)

This is a fork of a fork of [SecureSocial](https://github.com/jaliss/securesocial), made because we needed to migrate our app to Play Framework 2.7 and could find no other fork that successfully ran in the environment.

This fork will compile and run in Play Framwork 2.7. It is currently being used in production with the following:

- Scala version 2.12.12
- sbt Version 1.3.13
- Play Framework 2.7.9
- PayInsafe Ebean Plugin 19.10.u1

We intend to continue to maintain this fork and ultimately migrate it to Play Framework 2.8. We welcome your pull requests.

# A fork of SecureSocial

This is a fork of [SecureSocial](https://github.com/jaliss/securesocial), originally developped by Jorge Aliss. We heavily use this plugin for one of our projects, and we sometimes want to change it. Even though We send pull requests, we don't want to stop our development unitil they are merged, so we decided to fork it. Basically, we send a PR of every change, but it's up to the original author whether the change is merged or not.

Below is the original README as of Mar 12, 2015:  
[README-original.textile](README-original.textile)

# Installation

## Play! 2.4 and newer

|SecureSocial Release|Target Play Framework version|
|-------|---------------------|
|3.4.0-SNAPSHOT|2.7.X|
|3.3.0-SNAPSHOT|2.6.X|
|3.2.5|2.5.X|
|3.1.0-SNAPSHOT|2.4.X|

```
resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies += "tv.kazu" %% "securesocial" % "3.4.0-SNAPSHOT"
```

Support for Play 2.5 to 2.7 is used for some sites in production. Support for Play 2.4 is not tested nor maintained. Bug reports would be welcome.

## Play! 2.3

Add the dependencies:

```
"tv.kazu" %% "securesocial" % "3.0.6"
```

Then, implement `UserService` etc. See [the sample projects](samples/).

## Play! 2.2 and before

Use the versions by the original author for Play! 2.2 and 2.1. See [the doc](http://securesocial.ws/guide/getting-started.html).

# Supported services

* The ones the origiinal version supports:
    * Twitter (OAuth1)
    * Facebook (OAuth2)
    * GitHub (OAuth2)
    * Google (OAuth2)
    * LinkedIn (OAuth1 and OAuth2)
    * Foursquare (OAuth2)
    * Instagram (OAuth2)
    * VK (OAuth2)
    * XING (OAuth1)
    * Slack (OAuth2)
    * Username/Password with signup and reset password functionality.
* The ones that this forked version has added:
    * Bitbucket (OAuth2)
    * Backlog (OAuth2)
    * ChatWork (OAuth2)

# Changelog

* 3.2.5 (2018-05-13)
    * Added ChatWorkProvider
* 3.2.4 (2017-05-26)
    * Updated play-mailer from 3.0.1 to 5.0.0, which is for Play 2.5
    * Updated the play dependencies to 2.5.15
    * Fixed FacebookProvider
* 3.2.3 (2017-04-17)
    * Fixed a bug that `save-mode` remained in the session after login
* 3.2.2 (2017-01-23)
    * Enabled to pass `authorizationUrlParams` to ProviderController
* 3.2.1 (2017-01-03)
    * Enabled to pass `saveMode` to ProviderController
    * Improved error handling a bit
* 3.2.0 (2016-09-25)
    * Play 2.5 support
* 3.0.6 (2016-07-08)
    * Added Backlog provider
    * Fixed demo projects
* 3.0.5 (2016-05-12)
    * Fixed bug related to "scope" introduced in 3.0.4
* 3.0.4 (2015-12-08)
    * Added "login" to BasicProfile#extraInfo for GitHub accounts
	* Enabled to add "scope" param to ProviderController.authenticate
* 3.0.3 (2015-12-01)
    * Added BitbucketProvider
* 3.0.2 (2015-06-04)
    * Added ExtraInfo to BasicProfile
    * Merged changes in jaliss/securesocial#525
* 3.0.1 (2015-03-31)
    * Added SlackProvider
* 3.0.0 (2015-03-12)
    * Forked from the original version (3.0-M3)
    * A bit of refactoring
