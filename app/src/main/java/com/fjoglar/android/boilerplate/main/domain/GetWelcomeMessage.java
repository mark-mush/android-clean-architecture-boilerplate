/*
 * Copyright 2017 Felipe Joglar Santos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fjoglar.android.boilerplate.main.domain;

import com.fjoglar.android.boilerplate.UseCase;
import com.fjoglar.android.boilerplate.data.source.DataSource;

import io.reactivex.Observable;
import io.reactivex.Scheduler;

/**
 * This class is an implementation of {@link UseCase} that represents a use case for
 * retrieving the welcome message.
 */
public class GetWelcomeMessage extends UseCase<String> {

    private final DataSource mRepository;

    public GetWelcomeMessage(DataSource repository,
                             Scheduler threadExecutor,
                             Scheduler postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        mRepository = repository;
    }

    @Override
    public Observable<String> buildUseCaseObservable() {
        return mRepository.getWelcomeMessage();
    }
}