# Jython: Python for the Java Platform

Hacked versions - since Bitbucket drop support of Mercurial, using this to host jar files and changes.

My changes are still in mercurial and not moved to git.

  * Upstream (git) https://github.com/jython/jython

## Jython 2.5.1 hacked

https://github.com/clach04/jython-frozen-mirror/releases/tag/v2.5.1_hacked

Patched jython 2.5.1 for Java 5 - remove PyDoc, pydoc as included with 2.5.1 does NOT work, causing failures with things like CherryPy if it finds a pydoc implementation (it works fine if its missing, it expects it to work if it is present). This was built by hand by removing pydoc.

NO Jython changes, only to modules.

## Jython 2.2.1 hacked

https://github.com/clach04/jython-frozen-mirror/releases/tag/v2.2.1_hacked

Patched jython 2.2.1 for Java 1.4 - support more modern Windows operating systems and Python code; Windows 7, 8 and 10 support, adds libraries to make running code easier (e.g. logging, shlex.split(), optparse/optik, and Decimal) - see patch_jython221.py for how to build a new jar file

NO Jython changes, only to modules.

    changeset:   6603:3d1a0f68bea4
    branch:      2.2
    tag:         tip
    user:        clach04
    date:        Mon Apr 23 13:55:03 2012 -0700
    summary:     shlex.split() support.

    changeset:   6602:6d5812585aa7
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 12:51:09 2012 -0700
    summary:     Added optparse/optik back port.

    changeset:   6601:490c45b77dc1
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 12:38:39 2012 -0700
    summary:     Decimal support back port.

    changeset:   6600:495fde674c64
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 12:36:39 2012 -0700
    summary:     Document current patch limitations.

    changeset:   6599:7133250104ae
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 12:30:46 2012 -0700
    summary:     Last change did NOT patch javashell.py for Win7 support.

    changeset:   6598:6d6a76c7e3fd
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 12:28:37 2012 -0700
    summary:     Added logging module and a way to patch existing jar files.

    changeset:   6597:ffcf04e6c3b5
    branch:      2.2
    user:        clach04
    date:        Mon Apr 16 11:51:46 2012 -0700
    summary:     Added my Windows 7 (etc.) change to allow Windows support for spawning exes, environment variable access, and correct file path support.

    changeset:   6596:a9bfd397931b
    branch:      2.2
    parent:      6412:bed9f9de4ef3
    user:        clach04
    date:        Mon Apr 16 11:45:12 2012 -0700
    summary:     Added unsupported 2.2 note to readme.
