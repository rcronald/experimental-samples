/*
 * Copyright (C) F.D. Sattorov Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by F.D. Sattorov <firedandy@gmail.com>, May 2016.
 *
 */

package org.farrukh.example;

public class BookRepositoryImpl implements BookRepositoryCustom {

    @Override
    public Book findById(final long id) {
        return new Book();
    }
}