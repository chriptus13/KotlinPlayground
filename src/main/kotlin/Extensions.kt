/**
 * Returns either the result of function [block] or `this` if it isn't null
 *
 */
inline fun <T> T?.computeIfNull(block: () -> T): T = this ?: block()
