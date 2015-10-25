SUMMARY = "core-image-minimal ewong version."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL_append = "python-core python-threading python-logging python-codecs python-pip python-distutils python-distribute tmux"
IMAGE_INSTALL_append += " openhab screen mercurial"
#IMAGE_INSTALL_append += " testremoteproc"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

