SUMMARY = "Mercurial"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=197e47f0b055900f203a0120aa3a847b"

SRC_URI="https://pypi.python.org/packages/source/M/Mercurial/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "47461349624dc83b33b2b038242f104b"
SRC_URI[sha256sum] = "23fdc038503911b21dc9e556118803f7b1d4150eb14933d2ea3d0ff0dc60ab5d"

inherit pypi

#BBCLASSEXTEND = "native"
