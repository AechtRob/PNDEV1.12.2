package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraBarosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelBarosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer hipSpines;
    private final AdvancedModelRenderer tail1;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tailSpines1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tailSpines2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tailSpines3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tailSpines4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tailSpines5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer tailSpines6;
    private final AdvancedModelRenderer tail7;
    private final AdvancedModelRenderer tailSpines7;
    private final AdvancedModelRenderer tail8;
    private final AdvancedModelRenderer tailSpines8;
    private final AdvancedModelRenderer tail9;
    private final AdvancedModelRenderer tailSpines9;
    private final AdvancedModelRenderer tail10;
    private final AdvancedModelRenderer tail11;
    private final AdvancedModelRenderer tail12;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bodySpines;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer chestSpines;
    private final AdvancedModelRenderer neck1;
    private final AdvancedModelRenderer neckSpines1;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer neckSpines2;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer neckSpines3;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer neckSpines4;
    private final AdvancedModelRenderer neck5;
    private final AdvancedModelRenderer neckSpines5;
    private final AdvancedModelRenderer neck6;
    private final AdvancedModelRenderer neckSpines6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer dewlap;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer leftArm1;
    private final AdvancedModelRenderer leftArm2;
    private final AdvancedModelRenderer leftHand;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer rightArm1;
    private final AdvancedModelRenderer rightArm2;
    private final AdvancedModelRenderer rightHand;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer leftLeg1;
    private final AdvancedModelRenderer leftLeg2;
    private final AdvancedModelRenderer leftFoot;
    private final AdvancedModelRenderer leftToe;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightLeg1;
    private final AdvancedModelRenderer rightLeg2;
    private final AdvancedModelRenderer rightFoot;
    private final AdvancedModelRenderer rightToe;
    private final AdvancedModelRenderer cube_r23;

    private ModelAnimator animator;

    public ModelBarosaurus() {
        this.textureWidth = 300;
        this.textureHeight = 300;

        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, -20.0F, 21.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 18.0F, -4.0F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 145, 134, -14.0F, -24.0F, 0.0F, 28, 24, 22, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -18.6395F, -2.8697F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 156, -11.0F, 0.0F, -4.0F, 22, 18, 27, 0.0F, false));

        this.hipSpines = new AdvancedModelRenderer(this);
        this.hipSpines.setRotationPoint(0.0F, -15.0483F, 6.9971F);
        this.hips.addChild(hipSpines);
        this.setRotateAngle(hipSpines, -0.3491F, 0.0F, 0.0F);
        this.hipSpines.cubeList.add(new ModelBox(hipSpines, 176, 106, 0.0F, -3.0F, -11.5F, 0, 3, 23, 0.0F, false));

        this.tail1 = new AdvancedModelRenderer(this);
        this.tail1.setRotationPoint(0.0F, -11.0F, 16.0F);
        this.hips.addChild(tail1);
        this.setRotateAngle(tail1, -0.3927F, 0.0F, 0.0F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 11.8519F, 2.7444F);
        this.tail1.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.0038F, 0.0016F, -0.0014F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 152, 181, -9.0F, -12.0F, -7.0F, 18, 22, 24, 0.0F, false));

        this.tailSpines1 = new AdvancedModelRenderer(this);
        this.tailSpines1.setRotationPoint(0.0F, -0.1481F, 11.2444F);
        this.tail1.addChild(tailSpines1);
        this.tailSpines1.cubeList.add(new ModelBox(tailSpines1, 64, 259, 0.0F, -2.0F, -8.5F, 0, 2, 17, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 3.0468F, 17.1747F);
        this.tail1.addChild(tail2);
        this.setRotateAngle(tail2, -0.0545F, 0.0F, 0.0166F);
        this.tail2.cubeList.add(new ModelBox(tail2, 128, 90, -7.0F, -2.8111F, -3.2449F, 14, 17, 21, 0.0F, false));

        this.tailSpines2 = new AdvancedModelRenderer(this);
        this.tailSpines2.setRotationPoint(0.0F, -2.8111F, 10.255F);
        this.tail2.addChild(tailSpines2);
        this.tailSpines2.cubeList.add(new ModelBox(tailSpines2, 228, 41, 0.0F, -3.0F, -7.0F, 0, 3, 14, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 1.6889F, 14.755F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, 0.1925F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 100, 0, -5.0F, -3.5246F, -2.5665F, 10, 12, 22, 0.0F, false));

        this.tailSpines3 = new AdvancedModelRenderer(this);
        this.tailSpines3.setRotationPoint(0.0F, -3.5246F, 11.4335F);
        this.tail3.addChild(tailSpines3);
        this.tailSpines3.cubeList.add(new ModelBox(tailSpines3, 184, 41, 0.0F, -4.0F, -7.0F, 0, 4, 14, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -1.0246F, 17.4335F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.2182F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 195, 233, -4.0F, -1.6382F, -2.6967F, 8, 8, 21, 0.0F, false));

        this.tailSpines4 = new AdvancedModelRenderer(this);
        this.tailSpines4.setRotationPoint(0.0F, -1.6382F, 9.8033F);
        this.tail4.addChild(tailSpines4);
        this.tailSpines4.cubeList.add(new ModelBox(tailSpines4, 181, 263, 0.0F, -3.0F, -7.0F, 0, 3, 14, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 1.8618F, 18.3033F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.0873F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 238, 188, -3.0F, -3.0F, -3.0F, 6, 6, 22, 0.0F, false));

        this.tailSpines5 = new AdvancedModelRenderer(this);
        this.tailSpines5.setRotationPoint(0.0F, -3.0F, 8.75F);
        this.tail5.addChild(tailSpines5);
        this.tailSpines5.cubeList.add(new ModelBox(tailSpines5, 143, 0, 0.0F, -3.0F, -9.0F, 0, 3, 18, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.5F, 19.0F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.0873F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 247, 140, -2.5F, -3.0F, -3.0F, 5, 4, 19, 0.0F, false));

        this.tailSpines6 = new AdvancedModelRenderer(this);
        this.tailSpines6.setRotationPoint(0.0F, -3.0F, 7.5F);
        this.tail6.addChild(tailSpines6);
        this.tailSpines6.cubeList.add(new ModelBox(tailSpines6, 248, 0, 0.0F, -2.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.tail7 = new AdvancedModelRenderer(this);
        this.tail7.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail6.addChild(tail7);
        this.setRotateAngle(tail7, -0.0873F, 0.0F, 0.0F);
        this.tail7.cubeList.add(new ModelBox(tail7, 68, 72, -1.5F, -2.0F, -2.0F, 3, 3, 18, 0.0F, false));

        this.tailSpines7 = new AdvancedModelRenderer(this);
        this.tailSpines7.setRotationPoint(0.0F, -2.0F, 7.25F);
        this.tail7.addChild(tailSpines7);
        this.tailSpines7.cubeList.add(new ModelBox(tailSpines7, 0, 263, 0.0F, -2.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.tail8 = new AdvancedModelRenderer(this);
        this.tail8.setRotationPoint(0.0F, -0.5F, 16.0F);
        this.tail7.addChild(tail8);
        this.setRotateAngle(tail8, -0.0436F, 0.0F, 0.0F);
        this.tail8.cubeList.add(new ModelBox(tail8, 0, 133, -1.5F, -1.0F, -2.0F, 3, 2, 18, -0.01F, false));

        this.tailSpines8 = new AdvancedModelRenderer(this);
        this.tailSpines8.setRotationPoint(0.0F, -1.0F, 7.25F);
        this.tail8.addChild(tailSpines8);
        this.tailSpines8.cubeList.add(new ModelBox(tailSpines8, 31, 263, 0.0F, -2.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.tail9 = new AdvancedModelRenderer(this);
        this.tail9.setRotationPoint(0.0F, 0.0F, 15.5F);
        this.tail8.addChild(tail9);
        this.setRotateAngle(tail9, -0.1309F, 0.0F, 0.0F);
        this.tail9.cubeList.add(new ModelBox(tail9, 0, 202, -1.0F, -1.0F, 0.0F, 2, 2, 16, 0.0F, false));

        this.tailSpines9 = new AdvancedModelRenderer(this);
        this.tailSpines9.setRotationPoint(0.0F, -1.0F, 7.5F);
        this.tail9.addChild(tailSpines9);
        this.tailSpines9.cubeList.add(new ModelBox(tailSpines9, 263, 75, 0.0F, -2.0F, -7.5F, 0, 2, 15, 0.0F, false));

        this.tail10 = new AdvancedModelRenderer(this);
        this.tail10.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.tail9.addChild(tail10);
        this.setRotateAngle(tail10, -0.2182F, 0.0F, 0.0F);
        this.tail10.cubeList.add(new ModelBox(tail10, 113, 221, -0.5F, -1.0F, -0.5F, 1, 2, 17, 0.0F, false));
        this.tail10.cubeList.add(new ModelBox(tail10, 0, 22, -1.5F, 0.0F, 2.5F, 3, 0, 12, 0.0F, false));
        this.tail10.cubeList.add(new ModelBox(tail10, 0, 0, 0.0F, -2.0F, -0.5F, 0, 4, 17, 0.0F, false));

        this.tail11 = new AdvancedModelRenderer(this);
        this.tail11.setRotationPoint(0.0F, 0.0F, 16.5F);
        this.tail10.addChild(tail11);
        this.setRotateAngle(tail11, -0.3927F, 0.0F, 0.0F);
        this.tail11.cubeList.add(new ModelBox(tail11, 247, 164, -0.5F, -0.5F, -1.0F, 1, 1, 15, -0.01F, false));
        this.tail11.cubeList.add(new ModelBox(tail11, 21, 202, -1.5F, 0.0F, -1.0F, 3, 0, 15, 0.0F, false));
        this.tail11.cubeList.add(new ModelBox(tail11, 0, 154, 0.0F, -1.5F, 0.0F, 0, 3, 13, 0.0F, false));

        this.tail12 = new AdvancedModelRenderer(this);
        this.tail12.setRotationPoint(0.0F, 0.0F, 14.0F);
        this.tail11.addChild(tail12);
        this.setRotateAngle(tail12, -0.5672F, 0.0F, 0.0F);
        this.tail12.cubeList.add(new ModelBox(tail12, 150, 22, -0.5F, -0.5F, -0.25F, 1, 1, 15, 0.0F, false));
        this.tail12.cubeList.add(new ModelBox(tail12, 162, 0, -2.0F, 0.0F, -0.25F, 4, 0, 15, 0.0F, false));
        this.tail12.cubeList.add(new ModelBox(tail12, 99, 259, 0.0F, -2.0F, -0.25F, 0, 4, 15, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.0F, -8.0F);
        this.hips.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -16.0F, -6.0F, -31.0F, 32, 32, 35, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -18.9162F, -23.1823F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 106, 39, -12.0F, -0.75F, -2.0F, 24, 21, 29, 0.0F, false));

        this.bodySpines = new AdvancedModelRenderer(this);
        this.bodySpines.setRotationPoint(0.0F, -16.9429F, -10.8163F);
        this.body.addChild(bodySpines);
        this.setRotateAngle(bodySpines, -0.2182F, 0.0F, 0.0F);
        this.bodySpines.cubeList.add(new ModelBox(bodySpines, 228, 41, 0.0F, -4.0F, -14.5F, 0, 4, 29, 0.0F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -6.0F, -28.0F);
        this.body.addChild(chest);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 30.0F, -3.0F);
        this.chest.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 221, -13.0F, -27.0F, -14.0F, 26, 27, 14, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 25.5355F, -15.4182F);
        this.chest.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 184, 0, -11.0F, -21.0F, -1.0F, 22, 21, 19, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -15.0F, -7.0F);
        this.chest.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1745F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 224, 104, -9.0F, -0.25F, -2.0F, 18, 21, 14, 0.0F, false));

        this.chestSpines = new AdvancedModelRenderer(this);
        this.chestSpines.setRotationPoint(0.0F, -14.6384F, -3.5098F);
        this.chest.addChild(chestSpines);
        this.setRotateAngle(chestSpines, -0.1745F, 0.0F, 0.0F);
        this.chestSpines.cubeList.add(new ModelBox(chestSpines, 72, 156, 0.0F, -5.0F, -5.5F, 0, 5, 11, 0.0F, false));

        this.neck1 = new AdvancedModelRenderer(this);
        this.neck1.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.chest.addChild(neck1);
        this.setRotateAngle(neck1, -0.3054F, 0.0F, 0.0F);
        this.neck1.cubeList.add(new ModelBox(neck1, 0, 68, -7.0F, -14.0F, -38.0F, 14, 25, 39, 0.0F, false));

        this.neckSpines1 = new AdvancedModelRenderer(this);
        this.neckSpines1.setRotationPoint(0.0F, -14.0F, -20.5F);
        this.neck1.addChild(neckSpines1);
        this.neckSpines1.cubeList.add(new ModelBox(neckSpines1, 81, 221, 0.0F, -6.0F, -15.5F, 0, 6, 31, 0.0F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, -10.0F, -37.0F);
        this.neck1.addChild(neck2);
        this.setRotateAngle(neck2, -0.3054F, 0.0F, 0.0F);
        this.neck2.cubeList.add(new ModelBox(neck2, 68, 94, -5.0F, -3.4628F, -32.9929F, 10, 22, 39, 0.0F, false));

        this.neckSpines2 = new AdvancedModelRenderer(this);
        this.neckSpines2.setRotationPoint(0.0F, -3.4628F, -17.4929F);
        this.neck2.addChild(neckSpines2);
        this.neckSpines2.cubeList.add(new ModelBox(neckSpines2, 215, 150, 0.0F, -6.0F, -15.5F, 0, 6, 31, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, 6.0372F, -31.9929F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, -0.0873F, 0.0F, 0.0F);
        this.neck3.cubeList.add(new ModelBox(neck3, 63, 166, -4.0F, -9.0F, -32.0F, 8, 18, 36, 0.0F, false));

        this.neckSpines3 = new AdvancedModelRenderer(this);
        this.neckSpines3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.neck3.addChild(neckSpines3);
        this.neckSpines3.cubeList.add(new ModelBox(neckSpines3, 116, 156, 0.0F, -14.0F, -30.25F, 0, 5, 27, 0.0F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, -0.5F, -31.0F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.1745F, 0.0F, 0.0F);
        this.neck4.cubeList.add(new ModelBox(neck4, 178, 55, -3.5F, -8.0F, -32.0F, 7, 13, 35, 0.0F, false));

        this.neckSpines4 = new AdvancedModelRenderer(this);
        this.neckSpines4.setRotationPoint(0.0F, -8.0F, -15.0F);
        this.neck4.addChild(neckSpines4);
        this.neckSpines4.cubeList.add(new ModelBox(neckSpines4, 205, 196, 0.0F, -4.0F, -16.0F, 0, 4, 32, 0.0F, false));

        this.neck5 = new AdvancedModelRenderer(this);
        this.neck5.setRotationPoint(0.0F, -2.25F, -31.0F);
        this.neck4.addChild(neck5);
        this.setRotateAngle(neck5, 0.288F, 0.0F, 0.0F);
        this.neck5.cubeList.add(new ModelBox(neck5, 235, 244, -2.5F, -5.0F, -16.0F, 5, 9, 19, 0.0F, false));

        this.neckSpines5 = new AdvancedModelRenderer(this);
        this.neckSpines5.setRotationPoint(0.0F, -5.0F, -7.5F);
        this.neck5.addChild(neckSpines5);
        this.neckSpines5.cubeList.add(new ModelBox(neckSpines5, 253, 217, 0.0F, -3.0F, -8.5F, 0, 3, 17, 0.0F, false));

        this.neck6 = new AdvancedModelRenderer(this);
        this.neck6.setRotationPoint(0.0F, -3.4718F, -15.2909F);
        this.neck5.addChild(neck6);
        this.setRotateAngle(neck6, 0.2356F, 0.0F, 0.0F);
        this.neck6.cubeList.add(new ModelBox(neck6, 100, 0, -2.0F, -1.5F, -6.0F, 4, 6, 6, 0.0F, false));

        this.neckSpines6 = new AdvancedModelRenderer(this);
        this.neckSpines6.setRotationPoint(0.0F, -1.5F, -3.5F);
        this.neck6.addChild(neckSpines6);
        this.neckSpines6.cubeList.add(new ModelBox(neckSpines6, 28, 68, 0.0F, -2.0F, -2.5F, 0, 2, 5, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.5F, -6.1603F);
        this.neck6.addChild(head);
        this.setRotateAngle(head, 0.7854F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 100, 13, -2.0F, 0.0F, -7.26F, 4, 2, 5, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 93, 84, -1.5F, 0.0F, -9.0F, 3, 2, 2, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 19, 30, -1.5F, 1.5F, -8.75F, 3, 1, 2, -0.04F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.5F, -1.5307F, -3.5545F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.6807F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 68, -2.0F, 0.0F, -2.15F, 3, 2, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, -3.3302F, -1.4328F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.6283F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 93, 68, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.5F, 0.0F, -7.25F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.5498F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 19, 22, -1.0F, 0.2F, 0.7F, 1, 1, 6, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 0.0F, -7.25F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 75, -2.0F, 0.0F, 0.0F, 3, 2, 4, 0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -3.1385F, -1.6358F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.3578F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 128, 90, -2.5F, 0.6F, -0.31F, 5, 5, 4, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.5F, 2.0F, -1.25F);
        this.head.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 43, 149, -3.0F, -0.05F, -2.6289F, 5, 2, 4, -0.01F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 84, 156, -2.5F, -0.05F, -6.01F, 4, 2, 5, -0.02F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 93, 74, -2.0F, -0.05F, -7.75F, 3, 2, 2, -0.03F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 0, 30, -2.0F, -0.55F, -7.5F, 3, 1, 2, -0.05F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-0.5F, 0.0F, -3.5F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.48F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 93, 79, -2.0F, -2.25F, -0.01F, 4, 3, 1, -0.03F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.0F, -2.6F);
        this.jaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.48F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 11, -2.0F, -2.0F, -0.0289F, 5, 2, 2, -0.02F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(-0.5F, 1.95F, -5.0F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0436F, 0.0F, 0.0F);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 1.1481F, 2.7716F);
        this.throat.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.829F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 128, 100, -1.5F, -3.0F, -0.01F, 3, 3, 6, 0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.throat.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.3927F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 68, 82, -1.5F, -2.0F, -0.01F, 3, 2, 4, 0.0F, false));

        this.dewlap = new AdvancedModelRenderer(this);
        this.dewlap.setRotationPoint(0.0F, -0.0685F, -0.6027F);
        this.throat.addChild(dewlap);
        this.setRotateAngle(dewlap, -0.1745F, 0.0F, 0.0F);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.75F, 2.25F);
        this.dewlap.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2618F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 0, -0.5F, -3.0F, -0.01F, 1, 3, 7, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 2.6858F, -0.3212F);
        this.dewlap.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.4363F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 0, -0.5F, -2.5F, -0.51F, 0, 3, 7, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.3142F, -0.3212F);
        this.dewlap.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.8727F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 22, -0.5F, -3.0F, -0.01F, 1, 3, 4, 0.0F, false));

        this.leftArm1 = new AdvancedModelRenderer(this);
        this.leftArm1.setRotationPoint(12.5F, 21.5F, -6.5F);
        this.chest.addChild(leftArm1);
        this.setRotateAngle(leftArm1, 0.1309F, 0.0F, 0.0F);
        this.leftArm1.cubeList.add(new ModelBox(leftArm1, 258, 32, -5.0F, -2.5F, -5.0F, 10, 18, 9, 0.0F, false));

        this.leftArm2 = new AdvancedModelRenderer(this);
        this.leftArm2.setRotationPoint(0.0F, 15.0F, -0.5F);
        this.leftArm1.addChild(leftArm2);
        this.setRotateAngle(leftArm2, -0.3491F, 0.0F, 0.0F);
        this.leftArm2.cubeList.add(new ModelBox(leftArm2, 81, 221, -4.0F, -1.5F, -3.5F, 8, 15, 7, 0.0F, false));

        this.leftHand = new AdvancedModelRenderer(this);
        this.leftHand.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.leftArm2.addChild(leftHand);
        this.setRotateAngle(leftHand, 0.2182F, 0.0F, 0.0F);
        this.leftHand.cubeList.add(new ModelBox(leftHand, 228, 75, -4.5F, -1.0F, -3.0F, 9, 8, 6, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-4.5F, 3.0F, -1.0F);
        this.leftHand.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.3956F, 0.7493F, -0.55F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 11, -5.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

        this.rightArm1 = new AdvancedModelRenderer(this);
        this.rightArm1.setRotationPoint(-12.5F, 21.5F, -6.5F);
        this.chest.addChild(rightArm1);
        this.setRotateAngle(rightArm1, 0.1309F, 0.0F, 0.0F);
        this.rightArm1.cubeList.add(new ModelBox(rightArm1, 258, 32, -5.0F, -2.5F, -5.0F, 10, 18, 9, 0.0F, true));

        this.rightArm2 = new AdvancedModelRenderer(this);
        this.rightArm2.setRotationPoint(0.0F, 15.0F, -0.5F);
        this.rightArm1.addChild(rightArm2);
        this.setRotateAngle(rightArm2, -0.3491F, 0.0F, 0.0F);
        this.rightArm2.cubeList.add(new ModelBox(rightArm2, 81, 221, -4.0F, -1.5F, -3.5F, 8, 15, 7, 0.0F, true));

        this.rightHand = new AdvancedModelRenderer(this);
        this.rightHand.setRotationPoint(0.0F, 13.0F, 0.0F);
        this.rightArm2.addChild(rightHand);
        this.setRotateAngle(rightHand, 0.2182F, 0.0F, 0.0F);
        this.rightHand.cubeList.add(new ModelBox(rightHand, 228, 75, -4.5F, -1.0F, -3.0F, 9, 8, 6, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(4.5F, 3.0F, -1.0F);
        this.rightHand.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.3956F, -0.7493F, 0.55F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 11, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, true));

        this.leftLeg1 = new AdvancedModelRenderer(this);
        this.leftLeg1.setRotationPoint(13.0F, 0.0F, 0.0F);
        this.hips.addChild(leftLeg1);
        this.setRotateAngle(leftLeg1, -0.1309F, 0.0F, 0.0F);
        this.leftLeg1.cubeList.add(new ModelBox(leftLeg1, 144, 228, -6.0F, -5.0F, -4.0F, 12, 27, 13, 0.0F, false));

        this.leftLeg2 = new AdvancedModelRenderer(this);
        this.leftLeg2.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.leftLeg1.addChild(leftLeg2);
        this.setRotateAngle(leftLeg2, 0.3054F, 0.0F, 0.0F);
        this.leftLeg2.cubeList.add(new ModelBox(leftLeg2, 0, 68, -4.5F, -3.0F, -2.0F, 9, 24, 9, 0.0F, false));

        this.leftFoot = new AdvancedModelRenderer(this);
        this.leftFoot.setRotationPoint(0.0F, 19.0F, 3.0F);
        this.leftLeg2.addChild(leftFoot);
        this.setRotateAngle(leftFoot, -0.1745F, 0.0F, 0.0F);
        this.leftFoot.cubeList.add(new ModelBox(leftFoot, 25, 133, -5.5F, 0.0F, -5.5F, 11, 5, 10, 0.0F, false));

        this.leftToe = new AdvancedModelRenderer(this);
        this.leftToe.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.leftFoot.addChild(leftToe);


        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftToe.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 68, 94, -4.5F, 0.0F, -3.5F, 9, 5, 4, -0.01F, false));

        this.rightLeg1 = new AdvancedModelRenderer(this);
        this.rightLeg1.setRotationPoint(-13.0F, 0.0F, 0.0F);
        this.hips.addChild(rightLeg1);
        this.setRotateAngle(rightLeg1, -0.1309F, 0.0F, 0.0F);
        this.rightLeg1.cubeList.add(new ModelBox(rightLeg1, 144, 228, -6.0F, -5.0F, -4.0F, 12, 27, 13, 0.0F, true));

        this.rightLeg2 = new AdvancedModelRenderer(this);
        this.rightLeg2.setRotationPoint(0.0F, 21.0F, 0.0F);
        this.rightLeg1.addChild(rightLeg2);
        this.setRotateAngle(rightLeg2, 0.3054F, 0.0F, 0.0F);
        this.rightLeg2.cubeList.add(new ModelBox(rightLeg2, 0, 68, -4.5F, -3.0F, -2.0F, 9, 24, 9, 0.0F, true));

        this.rightFoot = new AdvancedModelRenderer(this);
        this.rightFoot.setRotationPoint(0.0F, 19.0F, 3.0F);
        this.rightLeg2.addChild(rightFoot);
        this.setRotateAngle(rightFoot, -0.1745F, 0.0F, 0.0F);
        this.rightFoot.cubeList.add(new ModelBox(rightFoot, 25, 133, -5.5F, 0.0F, -5.5F, 11, 5, 10, 0.0F, true));

        this.rightToe = new AdvancedModelRenderer(this);
        this.rightToe.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.rightFoot.addChild(rightToe);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightToe.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.2182F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 68, 94, -4.5F, 0.0F, -3.5F, 9, 5, 4, -0.01F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.hips.render(f5);
    }

    public void renderStaticWall(float f) {
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 1.95F;
        this.hips.offsetX = 1.7F;
        this.hips.rotateAngleY = (float)Math.toRadians(210);
        this.hips.rotateAngleX = (float)Math.toRadians(0);
        this.hips.rotateAngleZ = (float)Math.toRadians(0);
        this.hips.scaleChildren = true;
        float scaler = 0.47F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void faceTarget(float yaw, float pitch, float rotationDivisor, AdvancedModelRenderer... boxes) {
        //Overidden as the model is kinda twisted for some reason
        float actualRotationDivisor = rotationDivisor * (float)boxes.length;
        float yawAmount = yaw / 57.295776F / actualRotationDivisor;
        float pitchAmount = pitch / 57.295776F / actualRotationDivisor;
        AdvancedModelRenderer[] var8 = boxes;
        int var9 = boxes.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            AdvancedModelRenderer box = var8[var10];
            box.rotateAngleZ -= yawAmount; //would normally be Y
            box.rotateAngleY += pitchAmount; //would normally be X
        }

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
       // this.Hips.offsetY = 0.04F;
        //this.resetToDefaultPose();

        EntityPrehistoricFloraBarosaurus diplo = (EntityPrehistoricFloraBarosaurus) e;

//        this.faceTarget(f3, f4, 6, neck1);
//        this.faceTarget(f3, f4, 6, neck2);
//        this.faceTarget(f3, f4, 6, neck3);
//        this.faceTarget(f3, f4, 4, neck4);
//        this.faceTarget(f3, f4, 4, neck5);
//        this.faceTarget(f3, f4, 4, head);

        boolean isBaby = diplo.getJuvenile();

        if (isBaby) {
            this.neck5.scaleChildren = true;
            this.neck6.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1.025F, 1.025F, 1.025F);
            this.neck6.setScale(1.025F, 1.025F, 1.025F);
            this.head.setScale(1.375F, 1.375F, 1.375F);
        }
        else {
            this.neck4.scaleChildren = true;
            this.neck5.scaleChildren = true;
            this.head.scaleChildren = true;
            this.neck5.setScale(1F, 1, 1F);
            this.neck6.setScale(1F, 1, 1F);
            this.head.setScale(1F, 1, 1F);
        }

        AdvancedModelRenderer[] Tail = {this.tail1, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6, this.tail7, this.tail8, this.tail9, this.tail10, this.tail11, this.tail12};
        AdvancedModelRenderer[] Neck = {this.neck1, this.neck2, this.neck3, this.neck4, this.neck5, this.neck6, this.head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        diplo.tailBuffer.applyChainSwingBuffer(Tail);
        float masterSpeed = diplo.getTravelSpeed()/2;

        if (!diplo.isInWater()) {

            if (f3 == 0.0F || !diplo.getIsMoving()) {
                if (diplo.getAnimation() != diplo.EAT_ANIMATION
                        && diplo.getAnimation() != diplo.DRINK_ANIMATION
                        && diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                    this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                }

                if (diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                    this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                    this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
                }

                return;
            }

            if (diplo.getAnimation() != diplo.EAT_ANIMATION
                    && diplo.getAnimation() != diplo.DRINK_ANIMATION
                    && diplo.getAnimation() != diplo.ATTACK_ANIMATION
                    && diplo.getAnimation() != diplo.ATTACK_ANIMATION) {
                this.chainFlap(Neck, 0.05F, 0.02F, 0.5, f2, 0.8F);
                this.chainWave(Neck, 0.05F * 2, -0.01F, 0.5F, f2, 0.8F);
                this.chainFlap(Tail, (0.15F * 0.1F), 0.05F, 0.2F, f2, 1F);
                this.chainWave(Tail, (0.15F * 0.1F) * 2F, 0.05F * 0.15F, 0.12F, f2, 1F);
                this.chainSwing(Tail, (0.15F * 0.1F) * 8F, 0.05F * 0.15F, 0F, f2, 1F);
            }

            if (diplo.getIsFast()) { //Running
//                    float speed = masterSpeed / 2F;
//                    this.chainFlap(Tail, (speed * 1.2F), 0.1F, 0.5F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.6F) , 0.05F, 0.12F, f2, 1F);

            } else { //Walking
//                    float speed = masterSpeed / 1.50F;
//                    this.chainFlap(Tail, (speed * 0.5F), 0.1F, 0.2F, f2, 1F);
//                    this.chainWave(Tail, (speed * 0.5F), 0.05F * 0.65F, 0.12F, f2, 1F);
            }
        } else {
            //Swimming pose:
            if (f3 == 0.0F) { //static in water
                return;
            }
            //moving in water
            return;
        }
    }
    


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraBarosaurus ee = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;

        //if (!ee.isInWater()) {
            if (ee.getIsMoving() && ee.getAnimation() != ee.ATTACK_ANIMATION) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        //}
//        else {
//            //Swimming pose:
//            if (!ee.getIsMoving()) { //static in water
//                //
//            }
//            else {
//                //moving in water
//                //
//            }
//        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
//            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The roar anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAZE_ANIMATION) { //The leaves grazing anim
            animLeafGrazeUpwards(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animIdle1(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;


    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-0.98538118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0.23463-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-2.4509114407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*3-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -0.98538118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2 + (((tickAnim - 21) / 24) * (0-(-0.98538118+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*2)));
            yy = 0.23463 + (((tickAnim - 21) / 24) * (0-(0.23463)));
            zz = -2.4509114407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*3 + (((tickAnim - 21) / 24) * (0-(-2.4509114407+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-1.8971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-1.2511+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*2-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-1.9423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*2-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -1.8971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*3 + (((tickAnim - 21) / 24) * (0-(-1.8971+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-70))*3)));
            yy = -1.2511+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*2 + (((tickAnim - 21) / 24) * (0-(-1.2511+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*2)));
            zz = -1.9423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*2 + (((tickAnim - 21) / 24) * (0-(-1.9423+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-0.132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-4.6185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-3.2547+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -0.132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3 + (((tickAnim - 21) / 24) * (0-(-0.132+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*3)));
            yy = -4.6185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 21) / 24) * (0-(-4.6185+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            zz = -3.2547+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5 + (((tickAnim - 21) / 24) * (0-(-3.2547+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-2.6287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.0844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-4.24657-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -2.6287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 21) / 24) * (0-(-2.6287+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = -2.0844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3 + (((tickAnim - 21) / 24) * (0-(-2.0844+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3)));
            zz = -4.24657 + (((tickAnim - 21) / 24) * (0-(-4.24657)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-2.50852-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.78384-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-4.0795-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -2.50852 + (((tickAnim - 21) / 24) * (0-(-2.50852)));
            yy = -2.78384 + (((tickAnim - 21) / 24) * (0-(-2.78384)));
            zz = -4.0795 + (((tickAnim - 21) / 24) * (0-(-4.0795)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-7.42167-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (-2.89882-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (-1.46041-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 45) {
            xx = -7.42167 + (((tickAnim - 21) / 24) * (0-(-7.42167)));
            yy = -2.89882 + (((tickAnim - 21) / 24) * (0-(-2.89882)));
            zz = -1.46041 + (((tickAnim - 21) / 24) * (0-(-1.46041)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (-13-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = -13 + (((tickAnim - 21) / 10) * (-22.1-(-13)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 45) {
            xx = -22.1 + (((tickAnim - 31) / 14) * (0-(-22.1)));
            yy = 0 + (((tickAnim - 31) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 0) / 19) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 19) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 19) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 31) {
            xx = 23 + (((tickAnim - 19) / 12) * (2.12-(23)));
            yy = 0 + (((tickAnim - 19) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 12) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 2.12 + (((tickAnim - 31) / 7) * (24.75-(2.12)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 24.75 + (((tickAnim - 38) / 7) * (0-(24.75)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 31) {
            xx = 0 + (((tickAnim - 21) / 10) * (12.25-(0)));
            yy = 0 + (((tickAnim - 21) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 10) * (0-(0)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = 12.25 + (((tickAnim - 31) / 7) * (2.25-(12.25)));
            yy = 0 + (((tickAnim - 31) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 7) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 45) {
            xx = 2.25 + (((tickAnim - 38) / 7) * (0-(2.25)));
            yy = 0 + (((tickAnim - 38) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -7.25 + (((tickAnim - 23) / 5) * (-7.25-(-7.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -7.25 + (((tickAnim - 28) / 22) * (0-(-7.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-10.15-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = -10.15 + (((tickAnim - 23) / 5) * (-10.15-(-10.15)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = -10.15 + (((tickAnim - 28) / 22) * (0-(-10.15)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -5 + (((tickAnim - 23) / 5) * (-5-(-5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -5 + (((tickAnim - 28) / 22) * (0-(-5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -5.25 + (((tickAnim - 23) / 5) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 28) / 22) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 5.5 + (((tickAnim - 23) / 5) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 28) / 22) * (0-(5.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 7.25 + (((tickAnim - 23) / 5) * (7.25-(7.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.25 + (((tickAnim - 28) / 22) * (0-(7.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3 + (((tickAnim - 23) / 5) * (3-(3)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3 + (((tickAnim - 28) / 22) * (0-(3)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 7.75 + (((tickAnim - 23) / 5) * (7.75-(7.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 7.75 + (((tickAnim - 28) / 22) * (0-(7.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.75 + (((tickAnim - 23) / 5) * (11.75-(11.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.75 + (((tickAnim - 28) / 22) * (0-(11.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 24.75 + (((tickAnim - 23) / 5) * (24.75-(24.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 24.75 + (((tickAnim - 28) / 22) * (0-(24.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (31.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 31.75 + (((tickAnim - 23) / 5) * (31.75-(31.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 31.75 + (((tickAnim - 28) / 22) * (0-(31.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 23) / 5) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 28) / 22) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 4 + (((tickAnim - 23) / 5) * (4-(4)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 28) / 22) * (0-(4)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 2.75 + (((tickAnim - 23) / 5) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 28) / 22) * (0-(2.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 3.25 + (((tickAnim - 23) / 5) * (3.25-(3.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 3.25 + (((tickAnim - 28) / 22) * (0-(3.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -3.25 + (((tickAnim - 23) / 5) * (-3.25-(-3.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -3.25 + (((tickAnim - 28) / 22) * (0-(-3.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-12.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -12.75 + (((tickAnim - 23) / 5) * (-12.75-(-12.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -12.75 + (((tickAnim - 28) / 22) * (0-(-12.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 10.5 + (((tickAnim - 23) / 5) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 28) / 22) * (0-(10.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.25 + (((tickAnim - 23) / 5) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 28) / 22) * (0-(11.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 23) / 5) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 28) / 22) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 23) / 5) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 19.25 + (((tickAnim - 23) / 5) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 28) / 22) * (0-(19.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.625 + (((tickAnim - 23) / 5) * (0.625-(0.625)));
            zz = -0.3 + (((tickAnim - 23) / 5) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.625 + (((tickAnim - 28) / 22) * (0-(0.625)));
            zz = -0.3 + (((tickAnim - 28) / 22) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 11.25 + (((tickAnim - 23) / 5) * (11.25-(11.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 11.25 + (((tickAnim - 28) / 22) * (0-(11.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -23.75 + (((tickAnim - 23) / 5) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 28) / 22) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.525-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.525 + (((tickAnim - 23) / 5) * (0.525-(0.525)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 19.25 + (((tickAnim - 23) / 5) * (19.25-(19.25)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 19.25 + (((tickAnim - 28) / 22) * (0-(19.25)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.625-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.3-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 0.625 + (((tickAnim - 23) / 5) * (0.625-(0.625)));
            zz = -0.3 + (((tickAnim - 23) / 5) * (-0.3-(-0.3)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 0.625 + (((tickAnim - 28) / 22) * (0-(0.625)));
            zz = -0.3 + (((tickAnim - 28) / 22) * (0-(-0.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (-2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 23) / 5) * (-16-(-16)));
            yy = -2.75 + (((tickAnim - 23) / 5) * (-2.75-(-2.75)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 28) / 22) * (0-(-16)));
            yy = -2.75 + (((tickAnim - 28) / 22) * (0-(-2.75)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (49.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 49.5 + (((tickAnim - 23) / 5) * (49.5-(49.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 49.5 + (((tickAnim - 28) / 22) * (0-(49.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -27.5 + (((tickAnim - 23) / 5) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 28) / 22) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.55-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 23) / 5) * (1.25-(1.25)));
            zz = 0.55 + (((tickAnim - 23) / 5) * (0.55-(0.55)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 1.25 + (((tickAnim - 28) / 22) * (0-(1.25)));
            zz = 0.55 + (((tickAnim - 28) / 22) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-16-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (2.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -16 + (((tickAnim - 23) / 5) * (-16-(-16)));
            yy = 2.75 + (((tickAnim - 23) / 5) * (2.75-(2.75)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -16 + (((tickAnim - 28) / 22) * (0-(-16)));
            yy = 2.75 + (((tickAnim - 28) / 22) * (0-(2.75)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (49.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 49.5 + (((tickAnim - 23) / 5) * (49.5-(49.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 49.5 + (((tickAnim - 28) / 22) * (0-(49.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-27.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = -27.5 + (((tickAnim - 23) / 5) * (-27.5-(-27.5)));
            yy = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 5) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = -27.5 + (((tickAnim - 28) / 22) * (0-(-27.5)));
            yy = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (1.25-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.55-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 23) / 5) * (0-(0)));
            yy = 1.25 + (((tickAnim - 23) / 5) * (1.25-(1.25)));
            zz = 0.55 + (((tickAnim - 23) / 5) * (0.55-(0.55)));
        }
        else if (tickAnim >= 28 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 28) / 22) * (0-(0)));
            yy = 1.25 + (((tickAnim - 28) / 22) * (0-(1.25)));
            zz = 0.55 + (((tickAnim - 28) / 22) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.25 + (((tickAnim - 15) / 20) * (20-(-15.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 20 + (((tickAnim - 35) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-8.02-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -8.02 + (((tickAnim - 8) / 7) * (-7-(-8.02)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 15) / 20) * (10.5-(-7)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 10.5 + (((tickAnim - 35) / 8) * (-1.26097-(10.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0.21009-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0.07576-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -1.26097 + (((tickAnim - 43) / 7) * (0-(-1.26097)));
            yy = 0.21009 + (((tickAnim - 43) / 7) * (0-(0.21009)));
            zz = 0.07576 + (((tickAnim - 43) / 7) * (0-(0.07576)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.775-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 1.775 + (((tickAnim - 8) / 7) * (-0.4-(1.775)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -0.4 + (((tickAnim - 15) / 20) * (0-(-0.4)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 8) * (2.825-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (-0.425-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 2.825 + (((tickAnim - 43) / 7) * (0-(2.825)));
            zz = -0.425 + (((tickAnim - 43) / 7) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (26.55-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 26.55 + (((tickAnim - 8) / 7) * (21.5-(26.55)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 21.5 + (((tickAnim - 15) / 10) * (0-(21.5)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (13.25-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = 13.25 + (((tickAnim - 35) / 8) * (14.25-(13.25)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 14.25 + (((tickAnim - 43) / 7) * (0-(14.25)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-1.1-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = -1.1 + (((tickAnim - 15) / 10) * (0-(-1.1)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (-0.025-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -0.025 + (((tickAnim - 35) / 15) * (0-(-0.025)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (-48.5-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 43) {
            xx = -48.5 + (((tickAnim - 35) / 8) * (0-(-48.5)));
            yy = 0 + (((tickAnim - 35) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 8) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 7 + (((tickAnim - 23) / 22) * (0-(7)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 8 + (((tickAnim - 23) / 22) * (0-(8)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (8.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 8.5 + (((tickAnim - 23) / 22) * (0-(8.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (2.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 2.575 + (((tickAnim - 23) / 22) * (0-(2.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 19.25 + (((tickAnim - 23) / 22) * (0-(19.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.925-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 1.925 + (((tickAnim - 23) / 22) * (0-(1.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 9.5 + (((tickAnim - 23) / 22) * (0-(9.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (1.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 1.75 + (((tickAnim - 23) / 22) * (0-(1.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 7.5 + (((tickAnim - 23) / 22) * (0-(7.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0.75 + (((tickAnim - 23) / 22) * (0-(0.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 14.5 + (((tickAnim - 23) / 22) * (0-(14.5)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (23.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 23.25 + (((tickAnim - 17) / 6) * (0-(23.25)));
            yy = 0 + (((tickAnim - 17) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -22.25 + (((tickAnim - 23) / 22) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -21.75 + (((tickAnim - 23) / 22) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.75 + (((tickAnim - 23) / 22) * (0-(0.75)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 27.75 + (((tickAnim - 23) / 22) * (0-(27.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.425-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.85 + (((tickAnim - 23) / 22) * (0-(0.85)));
            zz = -0.425 + (((tickAnim - 23) / 22) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-22.25-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -22.25 + (((tickAnim - 23) / 22) * (0-(-22.25)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (-21.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = -21.75 + (((tickAnim - 23) / 22) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.75-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.75 + (((tickAnim - 23) / 22) * (0-(0.75)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 27.75 + (((tickAnim - 23) / 22) * (0-(27.75)));
            yy = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.425-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 45) {
            xx = 0 + (((tickAnim - 23) / 22) * (0-(0)));
            yy = 0.85 + (((tickAnim - 23) / 22) * (0-(0.85)));
            zz = -0.425 + (((tickAnim - 23) / 22) * (0-(-0.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);

    }
    public void animLeafGrazeUpwards(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 460;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -3.25 + (((tickAnim - 60) / 35) * (-5-(-3.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -5 + (((tickAnim - 95) / 45) * (-2.25-(-5)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -2.25 + (((tickAnim - 140) / 60) * (-3.25-(-2.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -3.25 + (((tickAnim - 200) / 35) * (-5-(-3.25)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -5 + (((tickAnim - 235) / 45) * (-2.25-(-5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -2.25 + (((tickAnim - 280) / 60) * (-3.25-(-2.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -3.25 + (((tickAnim - 340) / 35) * (-5-(-3.25)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -5 + (((tickAnim - 375) / 45) * (0-(-5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-5.25-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -5.25 + (((tickAnim - 60) / 35) * (-4.525-(-5.25)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -4.525 + (((tickAnim - 95) / 45) * (-3.175-(-4.525)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = -3.175 + (((tickAnim - 140) / 60) * (-5.25-(-3.175)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -5.25 + (((tickAnim - 200) / 35) * (-4.525-(-5.25)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -4.525 + (((tickAnim - 235) / 45) * (-3.175-(-4.525)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = -3.175 + (((tickAnim - 280) / 60) * (-5.25-(-3.175)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -5.25 + (((tickAnim - 340) / 35) * (-4.525-(-5.25)));
        }
        else if (tickAnim >= 375 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            zz = -4.525 + (((tickAnim - 375) / 85) * (0-(-4.525)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -4.25 + (((tickAnim - 60) / 35) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4 + (((tickAnim - 140) / 60) * (-1.75-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -1.75 + (((tickAnim - 200) / 35) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4 + (((tickAnim - 280) / 60) * (-1.75-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-70))*-4)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -1.75 + (((tickAnim - 340) / 35) * (0-(-1.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (2-(0)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 2 + (((tickAnim - 420) / 40) * (0-(2)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(xx), tail1.rotateAngleY + (float) Math.toRadians(yy), tail1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -2.5 + (((tickAnim - 60) / 35) * (-1.75-(-2.5)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -1.75 + (((tickAnim - 95) / 45) * (1.25-(-1.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 1.25 + (((tickAnim - 140) / 60) * (-2.5-(1.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -2.5 + (((tickAnim - 200) / 35) * (-1.75-(-2.5)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -1.75 + (((tickAnim - 235) / 45) * (1.25-(-1.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 1.25 + (((tickAnim - 280) / 60) * (-2.5-(1.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -2.5 + (((tickAnim - 340) / 35) * (-1.75-(-2.5)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -1.75 + (((tickAnim - 375) / 45) * (1.25-(-1.75)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 1.25 + (((tickAnim - 420) / 40) * (0-(1.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -3 + (((tickAnim - 60) / 35) * (-6-(-3)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = -6 + (((tickAnim - 95) / 22) * (-6.16-(-6)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = -6.16 + (((tickAnim - 117) / 23) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2-(-6.16)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2 + (((tickAnim - 140) / 60) * (-3-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*2)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -3 + (((tickAnim - 200) / 35) * (-6-(-3)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = -6 + (((tickAnim - 235) / 22) * (-6.16-(-6)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = -6.16 + (((tickAnim - 257) / 23) * (-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3-(-6.16)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3 + (((tickAnim - 280) / 60) * (-3-(-4.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50))*3)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -3 + (((tickAnim - 340) / 35) * (-6-(-3)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = -6 + (((tickAnim - 375) / 22) * (-6.16-(-6)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = -6.16 + (((tickAnim - 397) / 23) * (-4.25-(-6.16)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -4.25 + (((tickAnim - 420) / 40) * (0-(-4.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -1.75 + (((tickAnim - 60) / 35) * (-2.5-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = -2.5 + (((tickAnim - 95) / 22) * (-6.69-(-2.5)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = -6.69 + (((tickAnim - 117) / 23) * (-8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*4-(-6.69)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*4 + (((tickAnim - 140) / 60) * (-1.75-(-8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*4)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -1.75 + (((tickAnim - 200) / 35) * (-2.5-(-1.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = -2.5 + (((tickAnim - 235) / 22) * (-5.19-(-2.5)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = -5.19 + (((tickAnim - 257) / 23) * (-8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-6-(-5.19)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-6 + (((tickAnim - 280) / 60) * (-1.75-(-8.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*70))*-6)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -1.75 + (((tickAnim - 340) / 35) * (-2.5-(-1.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = -2.5 + (((tickAnim - 375) / 22) * (-6.69-(-2.5)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = -6.69 + (((tickAnim - 397) / 23) * (-6-(-6.69)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -6 + (((tickAnim - 420) / 40) * (0-(-6)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 1.5 + (((tickAnim - 60) / 35) * (1-(1.5)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = 1 + (((tickAnim - 95) / 22) * (-3.48-(1)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = -3.48 + (((tickAnim - 117) / 23) * (0-(-3.48)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (1.5-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 1.5 + (((tickAnim - 200) / 35) * (1-(1.5)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = 1 + (((tickAnim - 235) / 22) * (-3.48-(1)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = -3.48 + (((tickAnim - 257) / 23) * (0-(-3.48)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (1.5-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 1.5 + (((tickAnim - 340) / 35) * (1-(1.5)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = 1 + (((tickAnim - 375) / 22) * (-3.48-(1)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = -3.48 + (((tickAnim - 397) / 23) * (0-(-3.48)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 2 + (((tickAnim - 60) / 35) * (0.25-(2)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = 0.25 + (((tickAnim - 95) / 22) * (-0.68456-(0.25)));
            yy = 0 + (((tickAnim - 95) / 22) * (0.06173-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (-0.06613-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = -0.68456 + (((tickAnim - 117) / 23) * (-2.25-(-0.68456)));
            yy = 0.06173 + (((tickAnim - 117) / 23) * (0-(0.06173)));
            zz = -0.06613 + (((tickAnim - 117) / 23) * (0-(-0.06613)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -2.25 + (((tickAnim - 140) / 60) * (2-(-2.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 2 + (((tickAnim - 200) / 35) * (1.25-(2)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = 1.25 + (((tickAnim - 235) / 22) * (-0.68456-(1.25)));
            yy = 0 + (((tickAnim - 235) / 22) * (0.06173-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (-0.06613-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = -0.68456 + (((tickAnim - 257) / 23) * (-2.25-(-0.68456)));
            yy = 0.06173 + (((tickAnim - 257) / 23) * (0-(0.06173)));
            zz = -0.06613 + (((tickAnim - 257) / 23) * (0-(-0.06613)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -2.25 + (((tickAnim - 280) / 60) * (2-(-2.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 2 + (((tickAnim - 340) / 35) * (1.25-(2)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = 1.25 + (((tickAnim - 375) / 22) * (-0.68456-(1.25)));
            yy = 0 + (((tickAnim - 375) / 22) * (0.06173-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (-0.06613-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = -0.68456 + (((tickAnim - 397) / 23) * (-2.25-(-0.68456)));
            yy = 0.06173 + (((tickAnim - 397) / 23) * (0-(0.06173)));
            zz = -0.06613 + (((tickAnim - 397) / 23) * (0-(-0.06613)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -2.25 + (((tickAnim - 420) / 40) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 5 + (((tickAnim - 60) / 35) * (4.5-(5)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = 4.5 + (((tickAnim - 95) / 22) * (4.17-(4.5)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = 4.17 + (((tickAnim - 117) / 23) * (2.25-(4.17)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 2.25 + (((tickAnim - 140) / 60) * (5-(2.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 5 + (((tickAnim - 200) / 35) * (4.5-(5)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = 4.5 + (((tickAnim - 235) / 22) * (4.17-(4.5)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = 4.17 + (((tickAnim - 257) / 23) * (2.25-(4.17)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 2.25 + (((tickAnim - 280) / 60) * (5-(2.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 5 + (((tickAnim - 340) / 35) * (4.5-(5)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = 4.5 + (((tickAnim - 375) / 22) * (4.17-(4.5)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = 4.17 + (((tickAnim - 397) / 23) * (2.25-(4.17)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 2.25 + (((tickAnim - 420) / 40) * (0-(2.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(xx), tail7.rotateAngleY + (float) Math.toRadians(yy), tail7.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 3.75 + (((tickAnim - 60) / 35) * (3-(3.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = 3 + (((tickAnim - 95) / 22) * (3.42-(3)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = 3.42 + (((tickAnim - 117) / 23) * (-0.25-(3.42)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -0.25 + (((tickAnim - 140) / 60) * (3.75-(-0.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 3.75 + (((tickAnim - 200) / 35) * (2-(3.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = 2 + (((tickAnim - 235) / 22) * (3.42-(2)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = 3.42 + (((tickAnim - 257) / 23) * (-0.25-(3.42)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -0.25 + (((tickAnim - 280) / 60) * (3.75-(-0.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 3.75 + (((tickAnim - 340) / 35) * (2-(3.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = 2 + (((tickAnim - 375) / 22) * (3.42-(2)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = 3.42 + (((tickAnim - 397) / 23) * (-0.25-(3.42)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -0.25 + (((tickAnim - 420) / 40) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(xx), tail8.rotateAngleY + (float) Math.toRadians(yy), tail8.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 8.75 + (((tickAnim - 60) / 35) * (14.75-(8.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 117) {
            xx = 14.75 + (((tickAnim - 95) / 22) * (10.22-(14.75)));
            yy = 0 + (((tickAnim - 95) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 22) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 140) {
            xx = 10.22 + (((tickAnim - 117) / 23) * (6-(10.22)));
            yy = 0 + (((tickAnim - 117) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 23) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 6 + (((tickAnim - 140) / 60) * (8.75-(6)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 8.75 + (((tickAnim - 200) / 35) * (7-(8.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 257) {
            xx = 7 + (((tickAnim - 235) / 22) * (5.72-(7)));
            yy = 0 + (((tickAnim - 235) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 22) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 280) {
            xx = 5.72 + (((tickAnim - 257) / 23) * (1.75-(5.72)));
            yy = 0 + (((tickAnim - 257) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 23) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 1.75 + (((tickAnim - 280) / 60) * (11.75-(1.75)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 11.75 + (((tickAnim - 340) / 35) * (3.25-(11.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 397) {
            xx = 3.25 + (((tickAnim - 375) / 22) * (10.22-(3.25)));
            yy = 0 + (((tickAnim - 375) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 22) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 420) {
            xx = 10.22 + (((tickAnim - 397) / 23) * (1.75-(10.22)));
            yy = 0 + (((tickAnim - 397) / 23) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 23) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 1.75 + (((tickAnim - 420) / 40) * (0-(1.75)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(xx), tail9.rotateAngleY + (float) Math.toRadians(yy), tail9.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 14.5 + (((tickAnim - 60) / 35) * (11.29437-(14.5)));
            yy = 0 + (((tickAnim - 60) / 35) * (-0.19522-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (-0.47061-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 11.29437 + (((tickAnim - 95) / 5) * (2.18-(11.29437)));
            yy = -0.19522 + (((tickAnim - 95) / 5) * (0-(-0.19522)));
            zz = -0.47061 + (((tickAnim - 95) / 5) * (0-(-0.47061)));
        }
        else if (tickAnim >= 100 && tickAnim < 106) {
            xx = 2.18 + (((tickAnim - 100) / 6) * (6.51-(2.18)));
            yy = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 6) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 112) {
            xx = 6.51 + (((tickAnim - 106) / 6) * (8.4-(6.51)));
            yy = 0 + (((tickAnim - 106) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 6) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 8.4 + (((tickAnim - 112) / 5) * (5.81-(8.4)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 5.81 + (((tickAnim - 117) / 11) * (7.31-(5.81)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 7.31 + (((tickAnim - 128) / 12) * (8.5-(7.31)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 162) {
            xx = 8.5 + (((tickAnim - 140) / 22) * (12.42-(8.5)));
            yy = 0 + (((tickAnim - 140) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 22) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 200) {
            xx = 12.42 + (((tickAnim - 162) / 38) * (14.5-(12.42)));
            yy = 0 + (((tickAnim - 162) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 38) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 14.5 + (((tickAnim - 200) / 35) * (9.25-(14.5)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 246) {
            xx = 9.25 + (((tickAnim - 235) / 11) * (6.51-(9.25)));
            yy = 0 + (((tickAnim - 235) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 11) * (0-(0)));
        }
        else if (tickAnim >= 246 && tickAnim < 257) {
            xx = 6.51 + (((tickAnim - 246) / 11) * (12.81-(6.51)));
            yy = 0 + (((tickAnim - 246) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 246) / 11) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 268) {
            xx = 12.81 + (((tickAnim - 257) / 11) * (15.06-(12.81)));
            yy = 0 + (((tickAnim - 257) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 11) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 280) {
            xx = 15.06 + (((tickAnim - 268) / 12) * (11.5-(15.06)));
            yy = 0 + (((tickAnim - 268) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 12) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 11.5 + (((tickAnim - 280) / 60) * (7.25-(11.5)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 7.25 + (((tickAnim - 340) / 35) * (14.25-(7.25)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 386) {
            xx = 14.25 + (((tickAnim - 375) / 11) * (6.51-(14.25)));
            yy = 0 + (((tickAnim - 375) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 11) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 397) {
            xx = 6.51 + (((tickAnim - 386) / 11) * (12.81-(6.51)));
            yy = 0 + (((tickAnim - 386) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 11) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 408) {
            xx = 12.81 + (((tickAnim - 397) / 11) * (3.81-(12.81)));
            yy = 0 + (((tickAnim - 397) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 11) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 420) {
            xx = 3.81 + (((tickAnim - 408) / 12) * (4-(3.81)));
            yy = 0 + (((tickAnim - 408) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 408) / 12) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 4 + (((tickAnim - 420) / 40) * (0-(4)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(xx), tail10.rotateAngleY + (float) Math.toRadians(yy), tail10.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 25 + (((tickAnim - 60) / 35) * (9-(25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 9 + (((tickAnim - 95) / 5) * (20.74-(9)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 106) {
            xx = 20.74 + (((tickAnim - 100) / 6) * (17.57-(20.74)));
            yy = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 6) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 112) {
            xx = 17.57 + (((tickAnim - 106) / 6) * (21.56-(17.57)));
            yy = 0 + (((tickAnim - 106) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 6) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 21.56 + (((tickAnim - 112) / 5) * (25.44-(21.56)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 25.44 + (((tickAnim - 117) / 11) * (14.94-(25.44)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 14.94 + (((tickAnim - 128) / 12) * (10.75-(14.94)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 162) {
            xx = 10.75 + (((tickAnim - 140) / 22) * (18.66-(10.75)));
            yy = 0 + (((tickAnim - 140) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 22) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 200) {
            xx = 18.66 + (((tickAnim - 162) / 38) * (25-(18.66)));
            yy = 0 + (((tickAnim - 162) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 38) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 25 + (((tickAnim - 200) / 35) * (23.75-(25)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 240) {
            xx = 23.75 + (((tickAnim - 235) / 5) * (19.24-(23.75)));
            yy = 0 + (((tickAnim - 235) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 5) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 246) {
            xx = 19.24 + (((tickAnim - 240) / 6) * (19.82-(19.24)));
            yy = 0 + (((tickAnim - 240) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 6) * (0-(0)));
        }
        else if (tickAnim >= 246 && tickAnim < 257) {
            xx = 19.82 + (((tickAnim - 246) / 11) * (23.94-(19.82)));
            yy = 0 + (((tickAnim - 246) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 246) / 11) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 263) {
            xx = 23.94 + (((tickAnim - 257) / 6) * (25.57-(23.94)));
            yy = 0 + (((tickAnim - 257) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 6) * (0-(0)));
        }
        else if (tickAnim >= 263 && tickAnim < 268) {
            xx = 25.57 + (((tickAnim - 263) / 5) * (24.19-(25.57)));
            yy = 0 + (((tickAnim - 263) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 263) / 5) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 280) {
            xx = 24.19 + (((tickAnim - 268) / 12) * (20-(24.19)));
            yy = 0 + (((tickAnim - 268) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 12) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 20 + (((tickAnim - 280) / 60) * (14.75-(20)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 14.75 + (((tickAnim - 340) / 35) * (23.75-(14.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 380) {
            xx = 23.75 + (((tickAnim - 375) / 5) * (25.99-(23.75)));
            yy = 0 + (((tickAnim - 375) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 5) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 386) {
            xx = 25.99 + (((tickAnim - 380) / 6) * (26.32-(25.99)));
            yy = 0 + (((tickAnim - 380) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 6) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 397) {
            xx = 26.32 + (((tickAnim - 386) / 11) * (19.44-(26.32)));
            yy = 0 + (((tickAnim - 386) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 11) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 408) {
            xx = 19.44 + (((tickAnim - 397) / 11) * (20.19-(19.44)));
            yy = 0 + (((tickAnim - 397) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 11) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 420) {
            xx = 20.19 + (((tickAnim - 408) / 12) * (13.75-(20.19)));
            yy = 0 + (((tickAnim - 408) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 408) / 12) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 13.75 + (((tickAnim - 420) / 40) * (0-(13.75)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(xx), tail11.rotateAngleY + (float) Math.toRadians(yy), tail11.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (38.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 38.25 + (((tickAnim - 60) / 35) * (21.5-(38.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 100) {
            xx = 21.5 + (((tickAnim - 95) / 5) * (31.9-(21.5)));
            yy = 0 + (((tickAnim - 95) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 5) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 106) {
            xx = 31.9 + (((tickAnim - 100) / 6) * (35.375-(31.9)));
            yy = 0 + (((tickAnim - 100) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 6) * (0-(0)));
        }
        else if (tickAnim >= 106 && tickAnim < 112) {
            xx = 35.375 + (((tickAnim - 106) / 6) * (34.83-(35.375)));
            yy = 0 + (((tickAnim - 106) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 106) / 6) * (0-(0)));
        }
        else if (tickAnim >= 112 && tickAnim < 117) {
            xx = 34.83 + (((tickAnim - 112) / 5) * (36.39-(34.83)));
            yy = 0 + (((tickAnim - 112) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 112) / 5) * (0-(0)));
        }
        else if (tickAnim >= 117 && tickAnim < 128) {
            xx = 36.39 + (((tickAnim - 117) / 11) * (21.51-(36.39)));
            yy = 0 + (((tickAnim - 117) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 117) / 11) * (0-(0)));
        }
        else if (tickAnim >= 128 && tickAnim < 140) {
            xx = 21.51 + (((tickAnim - 128) / 12) * (16.25-(21.51)));
            yy = 0 + (((tickAnim - 128) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 128) / 12) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 149) {
            xx = 16.25 + (((tickAnim - 140) / 9) * (28.24-(16.25)));
            yy = 0 + (((tickAnim - 140) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 9) * (0-(0)));
        }
        else if (tickAnim >= 149 && tickAnim < 156) {
            xx = 28.24 + (((tickAnim - 149) / 7) * (31.76-(28.24)));
            yy = 0 + (((tickAnim - 149) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 149) / 7) * (0-(0)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 31.76 + (((tickAnim - 156) / 6) * (29.22-(31.76)));
            yy = 0 + (((tickAnim - 156) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 156) / 6) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 200) {
            xx = 29.22 + (((tickAnim - 162) / 38) * (38.25-(29.22)));
            yy = 0 + (((tickAnim - 162) / 38) * (0-(0)));
            zz = 0 + (((tickAnim - 162) / 38) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 38.25 + (((tickAnim - 200) / 35) * (39.5-(38.25)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 240) {
            xx = 39.5 + (((tickAnim - 235) / 5) * (31.9-(39.5)));
            yy = 0 + (((tickAnim - 235) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 5) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 246) {
            xx = 31.9 + (((tickAnim - 240) / 6) * (46.4-(31.9)));
            yy = 0 + (((tickAnim - 240) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 6) * (0-(0)));
        }
        else if (tickAnim >= 246 && tickAnim < 252) {
            xx = 46.4 + (((tickAnim - 246) / 6) * (40.83-(46.4)));
            yy = 0 + (((tickAnim - 246) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 246) / 6) * (0-(0)));
        }
        else if (tickAnim >= 252 && tickAnim < 257) {
            xx = 40.83 + (((tickAnim - 252) / 5) * (36.39-(40.83)));
            yy = 0 + (((tickAnim - 252) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 252) / 5) * (0-(0)));
        }
        else if (tickAnim >= 257 && tickAnim < 268) {
            xx = 36.39 + (((tickAnim - 257) / 11) * (37.26-(36.39)));
            yy = 0 + (((tickAnim - 257) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 257) / 11) * (0-(0)));
        }
        else if (tickAnim >= 268 && tickAnim < 280) {
            xx = 37.26 + (((tickAnim - 268) / 12) * (33.5-(37.26)));
            yy = 0 + (((tickAnim - 268) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 268) / 12) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 33.5 + (((tickAnim - 280) / 60) * (14.25-(33.5)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 14.25 + (((tickAnim - 340) / 35) * (39.5-(14.25)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 380) {
            xx = 39.5 + (((tickAnim - 375) / 5) * (31.9-(39.5)));
            yy = 0 + (((tickAnim - 375) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 5) * (0-(0)));
        }
        else if (tickAnim >= 380 && tickAnim < 386) {
            xx = 31.9 + (((tickAnim - 380) / 6) * (42.4-(31.9)));
            yy = 0 + (((tickAnim - 380) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 380) / 6) * (0-(0)));
        }
        else if (tickAnim >= 386 && tickAnim < 392) {
            xx = 42.4 + (((tickAnim - 386) / 6) * (40.83-(42.4)));
            yy = 0 + (((tickAnim - 386) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 386) / 6) * (0-(0)));
        }
        else if (tickAnim >= 392 && tickAnim < 397) {
            xx = 40.83 + (((tickAnim - 392) / 5) * (36.39-(40.83)));
            yy = 0 + (((tickAnim - 392) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 392) / 5) * (0-(0)));
        }
        else if (tickAnim >= 397 && tickAnim < 408) {
            xx = 36.39 + (((tickAnim - 397) / 11) * (37.26-(36.39)));
            yy = 0 + (((tickAnim - 397) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 397) / 11) * (0-(0)));
        }
        else if (tickAnim >= 408 && tickAnim < 420) {
            xx = 37.26 + (((tickAnim - 408) / 12) * (25.25-(37.26)));
            yy = 0 + (((tickAnim - 408) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 408) / 12) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 25.25 + (((tickAnim - 420) / 40) * (0-(25.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(xx), tail12.rotateAngleY + (float) Math.toRadians(yy), tail12.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (3.25-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 3.25 + (((tickAnim - 95) / 45) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 4.75 + (((tickAnim - 140) / 60) * (0-(4.75)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (3.25-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 3.25 + (((tickAnim - 235) / 45) * (4.75-(3.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 4.75 + (((tickAnim - 280) / 60) * (0-(4.75)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (3.25-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 3.25 + (((tickAnim - 375) / 45) * (0-(3.25)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 140) / 140) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 140) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 280) / 180) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 180) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 180) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -7 + (((tickAnim - 60) / 35) * (-8.5-(-7)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -8.5 + (((tickAnim - 95) / 45) * (-7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(-8.5)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 140) / 60) * (-7-(-7.825+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -7 + (((tickAnim - 200) / 35) * (-8.5-(-7)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -8.5 + (((tickAnim - 235) / 45) * (-8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(-8.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 280) / 60) * (-7-(-8.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -7 + (((tickAnim - 340) / 35) * (-8.5-(-7)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -8.5 + (((tickAnim - 375) / 45) * (-3.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5-(-8.5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -3.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5 + (((tickAnim - 420) / 40) * (0-(-3.2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*50-50))*5)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(xx), neck1.rotateAngleY + (float) Math.toRadians(yy), neck1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.525-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -1.525 + (((tickAnim - 60) / 35) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -1.525 + (((tickAnim - 95) / 45) * (0.08-(-1.525)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0.08 + (((tickAnim - 140) / 60) * (-1.525-(0.08)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -1.525 + (((tickAnim - 200) / 35) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -1.525 + (((tickAnim - 235) / 45) * (0.08-(-1.525)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0.08 + (((tickAnim - 280) / 60) * (-1.525-(0.08)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -1.525 + (((tickAnim - 340) / 35) * (-1.525-(-1.525)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = -1.525 + (((tickAnim - 375) / 45) * (0.08-(-1.525)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0.08 + (((tickAnim - 420) / 40) * (0-(0.08)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck1.rotationPointX = this.neck1.rotationPointX + (float)(xx);
        this.neck1.rotationPointY = this.neck1.rotationPointY - (float)(yy);
        this.neck1.rotationPointZ = this.neck1.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2 + (((tickAnim - 28) / 32) * (4.75-(2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 4.75 + (((tickAnim - 60) / 35) * (3-(4.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 3 + (((tickAnim - 95) / 45) * (-1.25-(3)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = -1.25 + (((tickAnim - 140) / 28) * (2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2-(-1.25)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = 2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2 + (((tickAnim - 168) / 32) * (4.75-(2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 4.75 + (((tickAnim - 200) / 35) * (3-(4.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 3 + (((tickAnim - 235) / 45) * (-1.25-(3)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = -1.25 + (((tickAnim - 280) / 28) * (2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2-(-1.25)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2 + (((tickAnim - 308) / 32) * (4.75-(2.345+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*-2)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 4.75 + (((tickAnim - 340) / 35) * (3-(4.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 3 + (((tickAnim - 375) / 45) * (-1.25-(3)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -1.25 + (((tickAnim - 420) / 40) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.8-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -2.8 + (((tickAnim - 60) / 35) * (-2.8-(-2.8)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -2.8 + (((tickAnim - 95) / 45) * (-1.3-(-2.8)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = -1.3 + (((tickAnim - 140) / 60) * (-2.8-(-1.3)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -2.8 + (((tickAnim - 200) / 35) * (-2.8-(-2.8)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -2.8 + (((tickAnim - 235) / 45) * (-1.3-(-2.8)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = -1.3 + (((tickAnim - 280) / 60) * (-2.8-(-1.3)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -2.8 + (((tickAnim - 340) / 35) * (-2.8-(-2.8)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = -2.8 + (((tickAnim - 375) / 45) * (-1.3-(-2.8)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = -1.3 + (((tickAnim - 420) / 40) * (0-(-1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4 + (((tickAnim - 28) / 32) * (6.75-(0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 6.75 + (((tickAnim - 60) / 35) * (4-(6.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 4 + (((tickAnim - 95) / 45) * (-4.5-(4)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = -4.5 + (((tickAnim - 140) / 28) * (0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4-(-4.5)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = 0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4 + (((tickAnim - 168) / 32) * (6.75-(0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 6.75 + (((tickAnim - 200) / 35) * (4-(6.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 4 + (((tickAnim - 235) / 45) * (-4.5-(4)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = -4.5 + (((tickAnim - 280) / 28) * (0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4-(-4.5)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4 + (((tickAnim - 308) / 32) * (6.75-(0.705+Math.sin((Math.PI/180)*(((double)tickAnim/20)*80+50))*4)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 6.75 + (((tickAnim - 340) / 35) * (4-(6.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 4 + (((tickAnim - 375) / 45) * (-4.5-(4)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -4.5 + (((tickAnim - 420) / 40) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-1.125-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -1.125 + (((tickAnim - 60) / 35) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -1.125 + (((tickAnim - 95) / 45) * (0-(-1.125)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (-1.125-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -1.125 + (((tickAnim - 200) / 35) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -1.125 + (((tickAnim - 235) / 45) * (0-(-1.125)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (-1.125-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -1.125 + (((tickAnim - 340) / 35) * (-1.125-(-1.125)));
        }
        else if (tickAnim >= 375 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            zz = -1.125 + (((tickAnim - 375) / 85) * (0-(-1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-8-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-8 + (((tickAnim - 28) / 32) * (-6-(-1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60-50))*-8)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -6 + (((tickAnim - 60) / 35) * (0.75-(-6)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0.75 + (((tickAnim - 95) / 45) * (7.25-(0.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 7.25 + (((tickAnim - 140) / 28) * (-1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8-(7.25)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = -1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8 + (((tickAnim - 168) / 32) * (-6-(-1.9+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -6 + (((tickAnim - 200) / 35) * (0.75-(-6)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0.75 + (((tickAnim - 235) / 45) * (7.25-(0.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 7.25 + (((tickAnim - 280) / 28) * (4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8-(7.25)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8 + (((tickAnim - 308) / 32) * (-6-(4.525+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*8)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -6 + (((tickAnim - 340) / 35) * (0.75-(-6)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0.75 + (((tickAnim - 375) / 45) * (7.25-(0.75)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 7.25 + (((tickAnim - 420) / 40) * (0-(7.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.35-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -2.35 + (((tickAnim - 60) / 35) * (-2.35-(-2.35)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -2.35 + (((tickAnim - 95) / 45) * (0-(-2.35)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (-2.35-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -2.35 + (((tickAnim - 200) / 35) * (-2.35-(-2.35)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -2.35 + (((tickAnim - 235) / 45) * (0-(-2.35)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (-2.35-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -2.35 + (((tickAnim - 340) / 35) * (-2.35-(-2.35)));
        }
        else if (tickAnim >= 375 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            zz = -2.35 + (((tickAnim - 375) / 85) * (0-(-2.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-6.37-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -6.37 + (((tickAnim - 28) / 32) * (-9.25-(-6.37)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -9.25 + (((tickAnim - 60) / 35) * (-4-(-9.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 111) {
            xx = -4 + (((tickAnim - 95) / 16) * (-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5-(-4)));
            yy = 0 + (((tickAnim - 95) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 16) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 140) {
            xx = -0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5 + (((tickAnim - 111) / 29) * (5.5-(-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5)));
            yy = 0 + (((tickAnim - 111) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 29) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 5.5 + (((tickAnim - 140) / 28) * (-6.37-(5.5)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = -6.37 + (((tickAnim - 168) / 32) * (-9.25-(-6.37)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -9.25 + (((tickAnim - 200) / 35) * (-4-(-9.25)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 251) {
            xx = -4 + (((tickAnim - 235) / 16) * (-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5-(-4)));
            yy = 0 + (((tickAnim - 235) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 16) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 280) {
            xx = -0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5 + (((tickAnim - 251) / 29) * (5.5-(-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5)));
            yy = 0 + (((tickAnim - 251) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 29) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 5.5 + (((tickAnim - 280) / 28) * (-6.37-(5.5)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -6.37 + (((tickAnim - 308) / 32) * (-9.25-(-6.37)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -9.25 + (((tickAnim - 340) / 35) * (-4-(-9.25)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 391) {
            xx = -4 + (((tickAnim - 375) / 16) * (-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5-(-4)));
            yy = 0 + (((tickAnim - 375) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 16) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 420) {
            xx = -0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5 + (((tickAnim - 391) / 29) * (5.5-(-0.36+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-80))*5)));
            yy = 0 + (((tickAnim - 391) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 29) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 5.5 + (((tickAnim - 420) / 40) * (0-(5.5)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(xx), neck5.rotateAngleY + (float) Math.toRadians(yy), neck5.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (-2.275-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = -2.275 + (((tickAnim - 60) / 35) * (-2.275-(-2.275)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = -2.275 + (((tickAnim - 95) / 45) * (0-(-2.275)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (-2.275-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = -2.275 + (((tickAnim - 200) / 35) * (-2.275-(-2.275)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = -2.275 + (((tickAnim - 235) / 45) * (0-(-2.275)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (-2.275-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = -2.275 + (((tickAnim - 340) / 35) * (-2.275-(-2.275)));
        }
        else if (tickAnim >= 375 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            yy = 0 + (((tickAnim - 375) / 85) * (0-(0)));
            zz = -2.275 + (((tickAnim - 375) / 85) * (0-(-2.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck5.rotationPointX = this.neck5.rotationPointX + (float)(xx);
        this.neck5.rotationPointY = this.neck5.rotationPointY - (float)(yy);
        this.neck5.rotationPointZ = this.neck5.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -5.75 + (((tickAnim - 28) / 32) * (-10.75-(-5.75)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -10.75 + (((tickAnim - 60) / 35) * (-13.25-(-10.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 111) {
            xx = -13.25 + (((tickAnim - 95) / 16) * (-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10-(-13.25)));
            yy = 0 + (((tickAnim - 95) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 16) * (0-(0)));
        }
        else if (tickAnim >= 111 && tickAnim < 140) {
            xx = -3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10 + (((tickAnim - 111) / 29) * (0-(-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10)));
            yy = 0 + (((tickAnim - 111) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 111) / 29) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = -5.75 + (((tickAnim - 168) / 32) * (-10.75-(-5.75)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -10.75 + (((tickAnim - 200) / 35) * (-13.25-(-10.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 251) {
            xx = -13.25 + (((tickAnim - 235) / 16) * (-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10-(-13.25)));
            yy = 0 + (((tickAnim - 235) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 16) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 280) {
            xx = -3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10 + (((tickAnim - 251) / 29) * (0-(-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10)));
            yy = 0 + (((tickAnim - 251) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 251) / 29) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -5.75 + (((tickAnim - 308) / 32) * (-10.75-(-5.75)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -10.75 + (((tickAnim - 340) / 35) * (-13.25-(-10.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 391) {
            xx = -13.25 + (((tickAnim - 375) / 16) * (-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10-(-13.25)));
            yy = 0 + (((tickAnim - 375) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 16) * (0-(0)));
        }
        else if (tickAnim >= 391 && tickAnim < 420) {
            xx = -3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10 + (((tickAnim - 391) / 29) * (0-(-3.285+Math.sin((Math.PI/180)*(((double)tickAnim/20)*60))*10)));
            yy = 0 + (((tickAnim - 391) / 29) * (0-(0)));
            zz = 0 + (((tickAnim - 391) / 29) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(xx), neck6.rotateAngleY + (float) Math.toRadians(yy), neck6.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck6.rotationPointX = this.neck6.rotationPointX + (float)(0);
        this.neck6.rotationPointY = this.neck6.rotationPointY - (float)(0);
        this.neck6.rotationPointZ = this.neck6.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 28) / 25) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -20.5 + (((tickAnim - 53) / 7) * (-1.75-(-20.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -1.75 + (((tickAnim - 60) / 35) * (-20.25-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -20.25 + (((tickAnim - 95) / 45) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 168) / 25) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 168) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 25) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = -20.5 + (((tickAnim - 193) / 7) * (-1.75-(-20.5)));
            yy = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 7) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -1.75 + (((tickAnim - 200) / 35) * (-20.25-(-1.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -20.25 + (((tickAnim - 235) / 45) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 308) / 25) * (-20.5-(0)));
            yy = 0 + (((tickAnim - 308) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 25) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 340) {
            xx = -20.5 + (((tickAnim - 333) / 7) * (-1.75-(-20.5)));
            yy = 0 + (((tickAnim - 333) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 7) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -1.75 + (((tickAnim - 340) / 35) * (-20.25-(-1.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -20.25 + (((tickAnim - 375) / 45) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));

        this.head.rotationPointX = this.head.rotationPointX + (float)(0);
        this.head.rotationPointY = this.head.rotationPointY - (float)(0);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 28) / 25) * (27.5-(0)));
            yy = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 27.5 + (((tickAnim - 53) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 168) / 25) * (27.5-(0)));
            yy = 0 + (((tickAnim - 168) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 25) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = 27.5 + (((tickAnim - 193) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 7) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 308) / 25) * (27.5-(0)));
            yy = 0 + (((tickAnim - 308) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 25) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 340) {
            xx = 27.5 + (((tickAnim - 333) / 7) * (0-(27.5)));
            yy = 0 + (((tickAnim - 333) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 28) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 25) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (16.5-(0)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 16.5 + (((tickAnim - 95) / 45) * (0-(16.5)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 193) {
            xx = 0 + (((tickAnim - 168) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 168) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 25) * (0-(0)));
        }
        else if (tickAnim >= 193 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 193) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 193) / 7) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (16.5-(0)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 16.5 + (((tickAnim - 235) / 45) * (0-(16.5)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 333) {
            xx = 0 + (((tickAnim - 308) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 308) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 25) * (0-(0)));
        }
        else if (tickAnim >= 333 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 333) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 333) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 333) / 7) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (16.5-(0)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 16.5 + (((tickAnim - 375) / 45) * (0-(16.5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(throat, throat.rotateAngleX + (float) Math.toRadians(xx), throat.rotateAngleY + (float) Math.toRadians(yy), throat.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 10.5 + (((tickAnim - 60) / 80) * (4.25-(10.5)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 4.25 + (((tickAnim - 140) / 60) * (10.5-(4.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = 10.5 + (((tickAnim - 200) / 80) * (4.25-(10.5)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 4.25 + (((tickAnim - 280) / 60) * (10.5-(4.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 10.5 + (((tickAnim - 340) / 35) * (7.25-(10.5)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 7.25 + (((tickAnim - 375) / 45) * (10.5-(7.25)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 10.5 + (((tickAnim - 420) / 40) * (0-(10.5)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 9 + (((tickAnim - 60) / 35) * (9-(9)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 9 + (((tickAnim - 95) / 45) * (-13.75-(9)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -13.75 + (((tickAnim - 140) / 60) * (9-(-13.75)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 9 + (((tickAnim - 200) / 35) * (9-(9)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 9 + (((tickAnim - 235) / 45) * (-13.75-(9)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -13.75 + (((tickAnim - 280) / 60) * (9-(-13.75)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 9 + (((tickAnim - 340) / 35) * (5.5-(9)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 5.5 + (((tickAnim - 375) / 45) * (-13.75-(5.5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -13.75 + (((tickAnim - 420) / 40) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.5-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -1.5 + (((tickAnim - 60) / 35) * (-1.5-(-1.5)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -1.5 + (((tickAnim - 95) / 45) * (0.125-(-1.5)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0.125 + (((tickAnim - 140) / 60) * (-1.5-(0.125)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -1.5 + (((tickAnim - 200) / 35) * (-1.5-(-1.5)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -1.5 + (((tickAnim - 235) / 45) * (0.125-(-1.5)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0.125 + (((tickAnim - 280) / 60) * (-1.5-(0.125)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -1.5 + (((tickAnim - 340) / 35) * (-0.8-(-1.5)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -0.8 + (((tickAnim - 375) / 45) * (-0.15-(-0.8)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = -0.15 + (((tickAnim - 420) / 40) * (0-(-0.15)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -8 + (((tickAnim - 60) / 35) * (-8-(-8)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -8 + (((tickAnim - 95) / 45) * (8-(-8)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 8 + (((tickAnim - 140) / 60) * (-8-(8)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -8 + (((tickAnim - 200) / 35) * (-8-(-8)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -8 + (((tickAnim - 235) / 45) * (8-(-8)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 8 + (((tickAnim - 280) / 60) * (-8-(8)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -8 + (((tickAnim - 340) / 35) * (-8-(-8)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -8 + (((tickAnim - 375) / 45) * (2.75-(-8)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 2.75 + (((tickAnim - 420) / 40) * (0-(2.75)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -1.175 + (((tickAnim - 60) / 35) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -1.175 + (((tickAnim - 95) / 45) * (0.105-(-1.175)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0.105 + (((tickAnim - 140) / 60) * (-1.175-(0.105)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -1.175 + (((tickAnim - 200) / 35) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -1.175 + (((tickAnim - 235) / 45) * (0.105-(-1.175)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0.105 + (((tickAnim - 280) / 60) * (-1.175-(0.105)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -1.175 + (((tickAnim - 340) / 35) * (-1.175-(-1.175)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -1.175 + (((tickAnim - 375) / 45) * (-0.57-(-1.175)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = -0.57 + (((tickAnim - 420) / 40) * (0-(-0.57)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -14.25 + (((tickAnim - 60) / 80) * (-16-(-14.25)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = -16 + (((tickAnim - 140) / 60) * (-14.25-(-16)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = -14.25 + (((tickAnim - 200) / 80) * (-16-(-14.25)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = -16 + (((tickAnim - 280) / 60) * (-14.25-(-16)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 420) {
            xx = -14.25 + (((tickAnim - 340) / 80) * (-17.75-(-14.25)));
            yy = 0 + (((tickAnim - 340) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 80) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = -17.75 + (((tickAnim - 420) / 20) * (0.88-(-17.75)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = 0.88 + (((tickAnim - 440) / 20) * (0-(0.88)));
            yy = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (-25.06-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = -25.06 + (((tickAnim - 28) / 32) * (15.75-(-25.06)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 15.75 + (((tickAnim - 60) / 35) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 15.75 + (((tickAnim - 95) / 45) * (0.25-(15.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0.25 + (((tickAnim - 140) / 28) * (-25.06-(0.25)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = -25.06 + (((tickAnim - 168) / 32) * (15.75-(-25.06)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 15.75 + (((tickAnim - 200) / 35) * (15.75-(15.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 15.75 + (((tickAnim - 235) / 45) * (0.25-(15.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0.25 + (((tickAnim - 280) / 28) * (-25.06-(0.25)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = -25.06 + (((tickAnim - 308) / 32) * (15.75-(-25.06)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 15.75 + (((tickAnim - 340) / 35) * (12.5-(15.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 12.5 + (((tickAnim - 375) / 45) * (4.25-(12.5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 4.25 + (((tickAnim - 420) / 20) * (-28.62-(4.25)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = -28.62 + (((tickAnim - 440) / 20) * (0-(-28.62)));
            yy = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0.85-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0.475-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = 0.85 + (((tickAnim - 28) / 32) * (-1.95-(0.85)));
            zz = 0.475 + (((tickAnim - 28) / 32) * (0-(0.475)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -1.95 + (((tickAnim - 60) / 35) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -1.95 + (((tickAnim - 95) / 45) * (0.175-(-1.95)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            yy = 0.175 + (((tickAnim - 140) / 28) * (0.85-(0.175)));
            zz = 0 + (((tickAnim - 140) / 28) * (0.475-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            yy = 0.85 + (((tickAnim - 168) / 32) * (-1.95-(0.85)));
            zz = 0.475 + (((tickAnim - 168) / 32) * (0-(0.475)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -1.95 + (((tickAnim - 200) / 35) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -1.95 + (((tickAnim - 235) / 45) * (0.175-(-1.95)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            yy = 0.175 + (((tickAnim - 280) / 28) * (0.85-(0.175)));
            zz = 0 + (((tickAnim - 280) / 28) * (0.475-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 0.85 + (((tickAnim - 308) / 32) * (-1.95-(0.85)));
            zz = 0.475 + (((tickAnim - 308) / 32) * (0-(0.475)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -1.95 + (((tickAnim - 340) / 35) * (-1.95-(-1.95)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -1.95 + (((tickAnim - 375) / 45) * (-0.9-(-1.95)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            yy = -0.9 + (((tickAnim - 420) / 20) * (1.925-(-0.9)));
            zz = 0 + (((tickAnim - 420) / 20) * (1.125-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            yy = 1.925 + (((tickAnim - 440) / 20) * (0-(1.925)));
            zz = 1.125 + (((tickAnim - 440) / 20) * (0-(1.125)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (38.02-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (0-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 38.02 + (((tickAnim - 28) / 32) * (-5.25-(38.02)));
            yy = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 28) / 32) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -5.25 + (((tickAnim - 60) / 35) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -5.25 + (((tickAnim - 95) / 45) * (9.5-(-5.25)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 9.5 + (((tickAnim - 140) / 28) * (38.02-(9.5)));
            yy = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 28) * (0-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = 38.02 + (((tickAnim - 168) / 32) * (-5.25-(38.02)));
            yy = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 168) / 32) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -5.25 + (((tickAnim - 200) / 35) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -5.25 + (((tickAnim - 235) / 45) * (9.5-(-5.25)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 9.5 + (((tickAnim - 280) / 28) * (38.02-(9.5)));
            yy = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 28) * (0-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 38.02 + (((tickAnim - 308) / 32) * (-5.25-(38.02)));
            yy = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 308) / 32) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -5.25 + (((tickAnim - 340) / 35) * (-0.5-(-5.25)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -0.5 + (((tickAnim - 375) / 45) * (13.25-(-0.5)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 13.25 + (((tickAnim - 420) / 20) * (38.88-(13.25)));
            yy = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 20) * (0-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = 38.88 + (((tickAnim - 440) / 20) * (0-(38.88)));
            yy = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 440) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 0) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 28) * (1.175-(0)));
            zz = 0 + (((tickAnim - 0) / 28) * (-0.775-(0)));
        }
        else if (tickAnim >= 28 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 28) / 32) * (0-(0)));
            yy = 1.175 + (((tickAnim - 28) / 32) * (-1.025-(1.175)));
            zz = -0.775 + (((tickAnim - 28) / 32) * (0-(-0.775)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -1.025 + (((tickAnim - 60) / 35) * (-1.025-(-1.025)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -1.025 + (((tickAnim - 95) / 45) * (-0.395-(-1.025)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 168) {
            xx = 0 + (((tickAnim - 140) / 28) * (0-(0)));
            yy = -0.395 + (((tickAnim - 140) / 28) * (1.175-(-0.395)));
            zz = 0 + (((tickAnim - 140) / 28) * (-0.775-(0)));
        }
        else if (tickAnim >= 168 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 168) / 32) * (0-(0)));
            yy = 1.175 + (((tickAnim - 168) / 32) * (-1.025-(1.175)));
            zz = -0.775 + (((tickAnim - 168) / 32) * (0-(-0.775)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -1.025 + (((tickAnim - 200) / 35) * (-1.025-(-1.025)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -1.025 + (((tickAnim - 235) / 45) * (-0.395-(-1.025)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 308) {
            xx = 0 + (((tickAnim - 280) / 28) * (0-(0)));
            yy = -0.395 + (((tickAnim - 280) / 28) * (1.175-(-0.395)));
            zz = 0 + (((tickAnim - 280) / 28) * (-0.775-(0)));
        }
        else if (tickAnim >= 308 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 308) / 32) * (0-(0)));
            yy = 1.175 + (((tickAnim - 308) / 32) * (-1.025-(1.175)));
            zz = -0.775 + (((tickAnim - 308) / 32) * (0-(-0.775)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -1.025 + (((tickAnim - 340) / 35) * (-0.4-(-1.025)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -0.4 + (((tickAnim - 375) / 45) * (-0.395-(-0.4)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 440) {
            xx = 0 + (((tickAnim - 420) / 20) * (0-(0)));
            yy = -0.395 + (((tickAnim - 420) / 20) * (1.125-(-0.395)));
            zz = 0 + (((tickAnim - 420) / 20) * (-0.725-(0)));
        }
        else if (tickAnim >= 440 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 440) / 20) * (0-(0)));
            yy = 1.125 + (((tickAnim - 440) / 20) * (0-(1.125)));
            zz = -0.725 + (((tickAnim - 440) / 20) * (0-(-0.725)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 10 + (((tickAnim - 60) / 35) * (10-(10)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 10 + (((tickAnim - 95) / 45) * (6.25-(10)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 6.25 + (((tickAnim - 140) / 60) * (10-(6.25)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 10 + (((tickAnim - 200) / 35) * (10-(10)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 10 + (((tickAnim - 235) / 45) * (6.25-(10)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 6.25 + (((tickAnim - 280) / 60) * (10-(6.25)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 10 + (((tickAnim - 340) / 35) * (10-(10)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 10 + (((tickAnim - 375) / 45) * (2.75-(10)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 2.75 + (((tickAnim - 420) / 40) * (0-(2.75)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 0) / 140) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 140) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 280) {
            xx = -3 + (((tickAnim - 140) / 140) * (-3-(-3)));
            yy = 0 + (((tickAnim - 140) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 140) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 420) {
            xx = -3 + (((tickAnim - 280) / 140) * (-3-(-3)));
            yy = 0 + (((tickAnim - 280) / 140) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 140) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -3 + (((tickAnim - 420) / 40) * (0-(-3)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -0.675 + (((tickAnim - 60) / 35) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -0.675 + (((tickAnim - 95) / 45) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -0.675 + (((tickAnim - 200) / 35) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -0.675 + (((tickAnim - 235) / 45) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -0.675 + (((tickAnim - 340) / 35) * (-0.675-(-0.675)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -0.675 + (((tickAnim - 375) / 45) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = -5.75 + (((tickAnim - 60) / 35) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 95) / 45) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = -5.75 + (((tickAnim - 200) / 35) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = -5.75 + (((tickAnim - 235) / 45) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = -5.75 + (((tickAnim - 340) / 35) * (-5.75-(-5.75)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = -5.75 + (((tickAnim - 375) / 45) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 95) {
            xx = 0 + (((tickAnim - 60) / 35) * (0-(0)));
            yy = -0.2 + (((tickAnim - 60) / 35) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 60) / 35) * (0-(0)));
        }
        else if (tickAnim >= 95 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 95) / 45) * (0-(0)));
            yy = -0.2 + (((tickAnim - 95) / 45) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 95) / 45) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 235) {
            xx = 0 + (((tickAnim - 200) / 35) * (0-(0)));
            yy = -0.2 + (((tickAnim - 200) / 35) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 200) / 35) * (0-(0)));
        }
        else if (tickAnim >= 235 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 235) / 45) * (0-(0)));
            yy = -0.2 + (((tickAnim - 235) / 45) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 235) / 45) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            yy = -0.2 + (((tickAnim - 340) / 35) * (-0.2-(-0.2)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            yy = -0.2 + (((tickAnim - 375) / 45) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (10-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 10 + (((tickAnim - 60) / 80) * (6.5-(10)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 6.5 + (((tickAnim - 140) / 60) * (10-(6.5)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = 10 + (((tickAnim - 200) / 80) * (6.5-(10)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 6.5 + (((tickAnim - 280) / 60) * (10-(6.5)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 375) {
            xx = 10 + (((tickAnim - 340) / 35) * (10.75-(10)));
            yy = 0 + (((tickAnim - 340) / 35) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 35) * (0-(0)));
        }
        else if (tickAnim >= 375 && tickAnim < 420) {
            xx = 10.75 + (((tickAnim - 375) / 45) * (2.25-(10.75)));
            yy = 0 + (((tickAnim - 375) / 45) * (0-(0)));
            zz = 0 + (((tickAnim - 375) / 45) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 2.25 + (((tickAnim - 420) / 40) * (0-(2.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = -0.675 + (((tickAnim - 60) / 80) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            yy = -0.675 + (((tickAnim - 200) / 80) * (0-(-0.675)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (-0.675-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 340) / 80) * (0-(0)));
            yy = -0.675 + (((tickAnim - 340) / 80) * (0.2-(-0.675)));
            zz = 0 + (((tickAnim - 340) / 80) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = 0.2 + (((tickAnim - 420) / 40) * (0-(0.2)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = -5.75 + (((tickAnim - 60) / 80) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = -5.75 + (((tickAnim - 200) / 80) * (0-(-5.75)));
            yy = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (-5.75-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 420) {
            xx = -5.75 + (((tickAnim - 340) / 80) * (-2.25-(-5.75)));
            yy = 0 + (((tickAnim - 340) / 80) * (0-(0)));
            zz = 0 + (((tickAnim - 340) / 80) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = -2.25 + (((tickAnim - 420) / 40) * (0-(-2.25)));
            yy = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 0) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 0) / 60) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 60) / 80) * (0-(0)));
            yy = -0.2 + (((tickAnim - 60) / 80) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 60) / 80) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 200) {
            xx = 0 + (((tickAnim - 140) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 140) / 60) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 280) {
            xx = 0 + (((tickAnim - 200) / 80) * (0-(0)));
            yy = -0.2 + (((tickAnim - 200) / 80) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 200) / 80) * (0-(0)));
        }
        else if (tickAnim >= 280 && tickAnim < 340) {
            xx = 0 + (((tickAnim - 280) / 60) * (0-(0)));
            yy = 0 + (((tickAnim - 280) / 60) * (-0.2-(0)));
            zz = 0 + (((tickAnim - 280) / 60) * (0-(0)));
        }
        else if (tickAnim >= 340 && tickAnim < 420) {
            xx = 0 + (((tickAnim - 340) / 80) * (0-(0)));
            yy = -0.2 + (((tickAnim - 340) / 80) * (-0.625-(-0.2)));
            zz = 0 + (((tickAnim - 340) / 80) * (0-(0)));
        }
        else if (tickAnim >= 420 && tickAnim < 460) {
            xx = 0 + (((tickAnim - 420) / 40) * (0-(0)));
            yy = -0.625 + (((tickAnim - 420) / 40) * (0-(-0.625)));
            zz = 0 + (((tickAnim - 420) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-80))*-0.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1.5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-80))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*-1.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-180))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*-4), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-250))*-5), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-280))*-5), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-300))*-7), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-320))*-9), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(0), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-350))*-12), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+20))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*0.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*1));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*0.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+80))*-1));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-120))*-1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+120))*1));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+150))*1));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*-0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+180))*1));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-270))*-0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+230))*1));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-320))*-0.5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+250))*1));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*-0.5), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240+280))*0.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(dewlap, dewlap.rotateAngleX + (float) Math.toRadians(0), dewlap.rotateAngleY + (float) Math.toRadians(0), dewlap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*-7));



        if (tickAnim >= 0 && tickAnim < 14) {
            xx = -11.76 + (((tickAnim - 0) / 14) * (13-(-11.76)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 23) {
            xx = 13 + (((tickAnim - 14) / 9) * (-16.01-(13)));
            yy = 0 + (((tickAnim - 14) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 9) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -16.01 + (((tickAnim - 23) / 7) * (-11.76-(-16.01)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 14) {
            xx = 11.66 + (((tickAnim - 0) / 14) * (8.75-(11.66)));
            yy = 0 + (((tickAnim - 0) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 14) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 8.75 + (((tickAnim - 14) / 6) * (-20.9-(8.75)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -20.9 + (((tickAnim - 20) / 3) * (5.91-(-20.9)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5.91 + (((tickAnim - 23) / 7) * (11.66-(5.91)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.16-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = -0.16 + (((tickAnim - 7) / 7) * (-0.85-(-0.16)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = -0.85 + (((tickAnim - 14) / 6) * (1.195-(-0.85)));
            zz = 0 + (((tickAnim - 14) / 6) * (0.975-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.195 + (((tickAnim - 20) / 3) * (-0.67-(1.195)));
            zz = 0.975 + (((tickAnim - 20) / 3) * (0.43-(0.975)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.67 + (((tickAnim - 23) / 7) * (0-(-0.67)));
            zz = 0.43 + (((tickAnim - 23) / 7) * (0-(0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = -2.87 + (((tickAnim - 7) / 7) * (0-(-2.87)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (38.49-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 38.49 + (((tickAnim - 20) / 3) * (9.66-(38.49)));
            yy = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 3) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 9.66 + (((tickAnim - 23) / 7) * (0-(9.66)));
            yy = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.155-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.155 + (((tickAnim - 7) / 7) * (0-(0.155)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (1.245-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (-0.675-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 20) / 3) * (0-(0)));
            yy = 1.245 + (((tickAnim - 20) / 3) * (-0.2-(1.245)));
            zz = -0.675 + (((tickAnim - 20) / 3) * (0-(-0.675)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 23) / 7) * (0-(0)));
            yy = -0.2 + (((tickAnim - 23) / 7) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 23) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 13 + (((tickAnim - 0) / 8) * (-16.01-(13)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = -16.01 + (((tickAnim - 8) / 22) * (13-(-16.01)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 8.75 + (((tickAnim - 0) / 5) * (-20.9-(8.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -20.9 + (((tickAnim - 5) / 3) * (5.91-(-20.9)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 5.91 + (((tickAnim - 8) / 22) * (8.75-(5.91)));
            yy = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 5) * (1.195-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.975-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.195 + (((tickAnim - 5) / 3) * (-0.67-(1.195)));
            zz = 0.975 + (((tickAnim - 5) / 3) * (0.43-(0.975)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = -0.67 + (((tickAnim - 8) / 22) * (-0.85-(-0.67)));
            zz = 0.43 + (((tickAnim - 8) / 22) * (0-(0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (38.49-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 38.49 + (((tickAnim - 5) / 3) * (9.66-(38.49)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 9.66 + (((tickAnim - 8) / 10) * (-5.39-(9.66)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -5.39 + (((tickAnim - 18) / 12) * (0-(-5.39)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (1.245-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.675-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            yy = 1.245 + (((tickAnim - 5) / 3) * (-0.2-(1.245)));
            zz = -0.675 + (((tickAnim - 5) / 3) * (0-(-0.675)));
        }
        else if (tickAnim >= 8 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 8) / 22) * (0-(0)));
            yy = -0.2 + (((tickAnim - 8) / 22) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 8) / 22) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 2 + (((tickAnim - 0) / 6) * (8.75-(2)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 8.75 + (((tickAnim - 6) / 12) * (-14-(8.75)));
            yy = 0 + (((tickAnim - 6) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 12) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 18) / 12) * (2-(-14)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 6) / 7) * (8.16-(11.75)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 8.16 + (((tickAnim - 13) / 5) * (-1.25-(8.16)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -1.25 + (((tickAnim - 18) / 12) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-2.525-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -2.525 + (((tickAnim - 6) / 7) * (1.74-(-2.525)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.925-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            yy = 1.74 + (((tickAnim - 13) / 5) * (-1.125-(1.74)));
            zz = -0.925 + (((tickAnim - 13) / 5) * (0-(-0.925)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            yy = -1.125 + (((tickAnim - 18) / 12) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-5.6-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -5.6 + (((tickAnim - 6) / 7) * (26.81-(-5.6)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 26.81 + (((tickAnim - 13) / 3) * (0.44-(26.81)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0.44 + (((tickAnim - 16) / 2) * (12.75-(0.44)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 18) / 12) * (0-(12.75)));
            yy = 0 + (((tickAnim - 18) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 6) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 6) / 7) * (1.805-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (-0.475-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = 1.805 + (((tickAnim - 13) / 3) * (0-(1.805)));
            zz = -0.475 + (((tickAnim - 13) / 3) * (0-(-0.475)));
        }
        else if (tickAnim >= 16 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 16) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 16) / 14) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 16) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = -14 + (((tickAnim - 6) / 7) * (0-(-14)));
            yy = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 7) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (1.35-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 6) / 7) * (0-(0)));
            yy = -0.425 + (((tickAnim - 6) / 7) * (0-(-0.425)));
            zz = 1.35 + (((tickAnim - 6) / 7) * (0-(1.35)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToe.rotationPointX = this.leftToe.rotationPointX + (float)(xx);
        this.leftToe.rotationPointY = this.leftToe.rotationPointY - (float)(yy);
        this.leftToe.rotationPointZ = this.leftToe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -14 + (((tickAnim - 0) / 20) * (8.75-(-14)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 20) / 10) * (-14-(8.75)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = -1.25 + (((tickAnim - 0) / 20) * (11.75-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 11.75 + (((tickAnim - 20) / 5) * (8.16-(11.75)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 8.16 + (((tickAnim - 25) / 5) * (-1.25-(8.16)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 20) * (-2.525-(-1.125)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -2.525 + (((tickAnim - 20) / 5) * (1.74-(-2.525)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.925-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.74 + (((tickAnim - 25) / 5) * (-1.125-(1.74)));
            zz = -0.925 + (((tickAnim - 25) / 5) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 12.75 + (((tickAnim - 0) / 20) * (-5.6-(12.75)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -5.6 + (((tickAnim - 20) / 5) * (26.81-(-5.6)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 26.81 + (((tickAnim - 25) / 4) * (0.44-(26.81)));
            yy = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 4) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0.44 + (((tickAnim - 29) / 1) * (12.75-(0.44)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 5) * (1.805-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (-0.475-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 25) / 4) * (0-(0)));
            yy = 1.805 + (((tickAnim - 25) / 4) * (0-(1.805)));
            zz = -0.475 + (((tickAnim - 25) / 4) * (0-(-0.475)));
        }
        else if (tickAnim >= 29 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 29) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 29) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -14 + (((tickAnim - 20) / 5) * (0-(-14)));
            yy = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 5) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToe, rightToe.rotateAngleX + (float) Math.toRadians(xx), rightToe.rotateAngleY + (float) Math.toRadians(yy), rightToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (1.35-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.425 + (((tickAnim - 20) / 5) * (0-(-0.425)));
            zz = 1.35 + (((tickAnim - 20) / 5) * (0-(1.35)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToe.rotationPointX = this.rightToe.rotationPointX + (float)(xx);
        this.rightToe.rotationPointY = this.rightToe.rotationPointY - (float)(yy);
        this.rightToe.rotationPointZ = this.rightToe.rotationPointZ + (float)(zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraBarosaurus entity = (EntityPrehistoricFloraBarosaurus) entitylivingbaseIn;
        int animCycle = 45;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-80))*-0.5), hips.rotateAngleY + (float) Math.toRadians(0), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0);


        this.setRotateAngle(tail1, tail1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-20))*0.5), tail1.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-50))*-1), tail1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-80))*-1), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-120))*-1.5), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-150))*-1.5), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-180))*-2), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(0), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-200))*-3), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail7, tail7.rotateAngleX + (float) Math.toRadians(0), tail7.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-220))*-4), tail7.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail8, tail8.rotateAngleX + (float) Math.toRadians(0), tail8.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-250))*-5), tail8.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail9, tail9.rotateAngleX + (float) Math.toRadians(0), tail9.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-280))*-5), tail9.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail10, tail10.rotateAngleX + (float) Math.toRadians(0), tail10.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-300))*-7), tail10.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail11, tail11.rotateAngleX + (float) Math.toRadians(0), tail11.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-320))*-9), tail11.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(tail12, tail12.rotateAngleX + (float) Math.toRadians(0), tail12.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157-350))*-12), tail12.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+20))*1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-150))*0.5), body.rotateAngleY + (float) Math.toRadians(0), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+80))*0.5));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-120))*0.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+80))*-0.5));


        this.setRotateAngle(neck1, neck1.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-120))*-1), neck1.rotateAngleY + (float) Math.toRadians(0), neck1.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+120))*0.5));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-200))*-0.5), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+150))*0.5));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-230))*-0.5), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+180))*0.5));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-270))*-0.5), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+230))*0.5));


        this.setRotateAngle(neck5, neck5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-320))*-0.5), neck5.rotateAngleY + (float) Math.toRadians(0), neck5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+250))*0.5));


        this.setRotateAngle(neck6, neck6.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157/0.5-350))*-0.5), neck6.rotateAngleY + (float) Math.toRadians(0), neck6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157+280))*0.5));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(dewlap, dewlap.rotateAngleX + (float) Math.toRadians(0), dewlap.rotateAngleY + (float) Math.toRadians(0), dewlap.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*157))*-4));



        if (tickAnim >= 0 && tickAnim < 21) {
            xx = -11.76 + (((tickAnim - 0) / 21) * (13-(-11.76)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 34) {
            xx = 13 + (((tickAnim - 21) / 13) * (-16.01-(13)));
            yy = 0 + (((tickAnim - 21) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 13) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = -16.01 + (((tickAnim - 34) / 12) * (-11.76-(-16.01)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm1, leftArm1.rotateAngleX + (float) Math.toRadians(xx), leftArm1.rotateAngleY + (float) Math.toRadians(yy), leftArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 21) {
            xx = 11.66 + (((tickAnim - 0) / 21) * (8.75-(11.66)));
            yy = 0 + (((tickAnim - 0) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 21) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 8.75 + (((tickAnim - 21) / 9) * (-20.9-(8.75)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = -20.9 + (((tickAnim - 30) / 4) * (5.91-(-20.9)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 5.91 + (((tickAnim - 34) / 12) * (11.66-(5.91)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftArm2, leftArm2.rotateAngleX + (float) Math.toRadians(xx), leftArm2.rotateAngleY + (float) Math.toRadians(yy), leftArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (-0.16-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = -0.16 + (((tickAnim - 11) / 10) * (-0.85-(-0.16)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = -0.85 + (((tickAnim - 21) / 9) * (1.195-(-0.85)));
            zz = 0 + (((tickAnim - 21) / 9) * (0.975-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 1.195 + (((tickAnim - 30) / 4) * (-0.67-(1.195)));
            zz = 0.975 + (((tickAnim - 30) / 4) * (0.43-(0.975)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = -0.67 + (((tickAnim - 34) / 12) * (0-(-0.67)));
            zz = 0.43 + (((tickAnim - 34) / 12) * (0-(0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftArm2.rotationPointX = this.leftArm2.rotationPointX + (float)(xx);
        this.leftArm2.rotationPointY = this.leftArm2.rotationPointY - (float)(yy);
        this.leftArm2.rotationPointZ = this.leftArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (-2.87-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = -2.87 + (((tickAnim - 11) / 10) * (0-(-2.87)));
            yy = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (38.49-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 38.49 + (((tickAnim - 30) / 4) * (9.66-(38.49)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 9.66 + (((tickAnim - 34) / 12) * (0-(9.66)));
            yy = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftHand, leftHand.rotateAngleX + (float) Math.toRadians(xx), leftHand.rotateAngleY + (float) Math.toRadians(yy), leftHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 0) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 11) * (0.155-(0)));
            zz = 0 + (((tickAnim - 0) / 11) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 11) / 10) * (0-(0)));
            yy = 0.155 + (((tickAnim - 11) / 10) * (0-(0.155)));
            zz = 0 + (((tickAnim - 11) / 10) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 21) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 21) / 9) * (1.245-(0)));
            zz = 0 + (((tickAnim - 21) / 9) * (-0.675-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            yy = 1.245 + (((tickAnim - 30) / 4) * (-0.2-(1.245)));
            zz = -0.675 + (((tickAnim - 30) / 4) * (0-(-0.675)));
        }
        else if (tickAnim >= 34 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 34) / 12) * (0-(0)));
            yy = -0.2 + (((tickAnim - 34) / 12) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 34) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftHand.rotationPointX = this.leftHand.rotationPointX + (float)(xx);
        this.leftHand.rotationPointY = this.leftHand.rotationPointY - (float)(yy);
        this.leftHand.rotationPointZ = this.leftHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 13 + (((tickAnim - 0) / 13) * (-16.01-(13)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 46) {
            xx = -16.01 + (((tickAnim - 13) / 33) * (13-(-16.01)));
            yy = 0 + (((tickAnim - 13) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm1, rightArm1.rotateAngleX + (float) Math.toRadians(xx), rightArm1.rotateAngleY + (float) Math.toRadians(yy), rightArm1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 8.75 + (((tickAnim - 0) / 8) * (-20.9-(8.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = -20.9 + (((tickAnim - 8) / 5) * (5.91-(-20.9)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 46) {
            xx = 5.91 + (((tickAnim - 13) / 33) * (8.75-(5.91)));
            yy = 0 + (((tickAnim - 13) / 33) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightArm2, rightArm2.rotateAngleX + (float) Math.toRadians(xx), rightArm2.rotateAngleY + (float) Math.toRadians(yy), rightArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.85 + (((tickAnim - 0) / 8) * (1.195-(-0.85)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.975-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.195 + (((tickAnim - 8) / 5) * (-0.67-(1.195)));
            zz = 0.975 + (((tickAnim - 8) / 5) * (0.43-(0.975)));
        }
        else if (tickAnim >= 13 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 13) / 33) * (0-(0)));
            yy = -0.67 + (((tickAnim - 13) / 33) * (-0.85-(-0.67)));
            zz = 0.43 + (((tickAnim - 13) / 33) * (0-(0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightArm2.rotationPointX = this.rightArm2.rotationPointX + (float)(xx);
        this.rightArm2.rotationPointY = this.rightArm2.rotationPointY - (float)(yy);
        this.rightArm2.rotationPointZ = this.rightArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (38.49-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 38.49 + (((tickAnim - 8) / 5) * (9.66-(38.49)));
            yy = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 5) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 26) {
            xx = 9.66 + (((tickAnim - 13) / 13) * (-5.39-(9.66)));
            yy = 0 + (((tickAnim - 13) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 13) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = -5.39 + (((tickAnim - 26) / 20) * (0-(-5.39)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightHand, rightHand.rotateAngleX + (float) Math.toRadians(xx), rightHand.rotateAngleY + (float) Math.toRadians(yy), rightHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.245-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.675-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 8) / 5) * (0-(0)));
            yy = 1.245 + (((tickAnim - 8) / 5) * (-0.2-(1.245)));
            zz = -0.675 + (((tickAnim - 8) / 5) * (0-(-0.675)));
        }
        else if (tickAnim >= 13 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 13) / 33) * (0-(0)));
            yy = -0.2 + (((tickAnim - 13) / 33) * (0-(-0.2)));
            zz = 0 + (((tickAnim - 13) / 33) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightHand.rotationPointX = this.rightHand.rotationPointX + (float)(xx);
        this.rightHand.rotationPointY = this.rightHand.rotationPointY - (float)(yy);
        this.rightHand.rotationPointZ = this.rightHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 2 + (((tickAnim - 0) / 10) * (8.75-(2)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 26) {
            xx = 8.75 + (((tickAnim - 10) / 16) * (-14-(8.75)));
            yy = 0 + (((tickAnim - 10) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 16) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = -14 + (((tickAnim - 26) / 20) * (2-(-14)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg1, leftLeg1.rotateAngleX + (float) Math.toRadians(xx), leftLeg1.rotateAngleY + (float) Math.toRadians(yy), leftLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 11.75 + (((tickAnim - 10) / 8) * (8.16-(11.75)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 8.16 + (((tickAnim - 18) / 8) * (-1.25-(8.16)));
            yy = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 8) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = -1.25 + (((tickAnim - 26) / 20) * (0-(-1.25)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLeg2, leftLeg2.rotateAngleX + (float) Math.toRadians(xx), leftLeg2.rotateAngleY + (float) Math.toRadians(yy), leftLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-2.525-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -2.525 + (((tickAnim - 10) / 8) * (1.74-(-2.525)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 18) / 8) * (0-(0)));
            yy = 1.74 + (((tickAnim - 18) / 8) * (-1.125-(1.74)));
            zz = -0.925 + (((tickAnim - 18) / 8) * (0-(-0.925)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            yy = -1.125 + (((tickAnim - 26) / 20) * (0-(-1.125)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftLeg2.rotationPointX = this.leftLeg2.rotationPointX + (float)(xx);
        this.leftLeg2.rotationPointY = this.leftLeg2.rotationPointY - (float)(yy);
        this.leftLeg2.rotationPointZ = this.leftLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.6-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -5.6 + (((tickAnim - 10) / 8) * (26.81-(-5.6)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 26.81 + (((tickAnim - 18) / 5) * (0.44-(26.81)));
            yy = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 5) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 26) {
            xx = 0.44 + (((tickAnim - 23) / 3) * (12.75-(0.44)));
            yy = 0 + (((tickAnim - 23) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 3) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 46) {
            xx = 12.75 + (((tickAnim - 26) / 20) * (0-(12.75)));
            yy = 0 + (((tickAnim - 26) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFoot, leftFoot.rotateAngleX + (float) Math.toRadians(xx), leftFoot.rotateAngleY + (float) Math.toRadians(yy), leftFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = -0.375 + (((tickAnim - 0) / 10) * (0-(-0.375)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (1.805-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.475-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 18) / 5) * (0-(0)));
            yy = 1.805 + (((tickAnim - 18) / 5) * (0-(1.805)));
            zz = -0.475 + (((tickAnim - 18) / 5) * (0-(-0.475)));
        }
        else if (tickAnim >= 23 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 23) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 23) * (-0.375-(0)));
            zz = 0 + (((tickAnim - 23) / 23) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftFoot.rotationPointX = this.leftFoot.rotationPointX + (float)(xx);
        this.leftFoot.rotationPointY = this.leftFoot.rotationPointY - (float)(yy);
        this.leftFoot.rotationPointZ = this.leftFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -14 + (((tickAnim - 10) / 8) * (0-(-14)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftToe, leftToe.rotateAngleX + (float) Math.toRadians(xx), leftToe.rotateAngleY + (float) Math.toRadians(yy), leftToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.35-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 10) / 8) * (0-(-0.425)));
            zz = 1.35 + (((tickAnim - 10) / 8) * (0-(1.35)));
        }
        else if (tickAnim >= 18 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 28) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 28) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftToe.rotationPointX = this.leftToe.rotationPointX + (float)(xx);
        this.leftToe.rotationPointY = this.leftToe.rotationPointY - (float)(yy);
        this.leftToe.rotationPointZ = this.leftToe.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -14 + (((tickAnim - 0) / 30) * (8.75-(-14)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 46) {
            xx = 8.75 + (((tickAnim - 30) / 16) * (-14-(8.75)));
            yy = 0 + (((tickAnim - 30) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 16) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg1, rightLeg1.rotateAngleX + (float) Math.toRadians(xx), rightLeg1.rotateAngleY + (float) Math.toRadians(yy), rightLeg1.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = -1.25 + (((tickAnim - 0) / 30) * (11.75-(-1.25)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 11.75 + (((tickAnim - 30) / 8) * (8.16-(11.75)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 8.16 + (((tickAnim - 38) / 8) * (-1.25-(8.16)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightLeg2, rightLeg2.rotateAngleX + (float) Math.toRadians(xx), rightLeg2.rotateAngleY + (float) Math.toRadians(yy), rightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -1.125 + (((tickAnim - 0) / 30) * (-2.525-(-1.125)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -2.525 + (((tickAnim - 30) / 8) * (1.74-(-2.525)));
            zz = 0 + (((tickAnim - 30) / 8) * (-0.925-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 1.74 + (((tickAnim - 38) / 8) * (-1.125-(1.74)));
            zz = -0.925 + (((tickAnim - 38) / 8) * (0-(-0.925)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightLeg2.rotationPointX = this.rightLeg2.rotationPointX + (float)(xx);
        this.rightLeg2.rotationPointY = this.rightLeg2.rotationPointY - (float)(yy);
        this.rightLeg2.rotationPointZ = this.rightLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 12.75 + (((tickAnim - 0) / 30) * (-5.6-(12.75)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -5.6 + (((tickAnim - 30) / 8) * (26.81-(-5.6)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 26.81 + (((tickAnim - 38) / 5) * (0.44-(26.81)));
            yy = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 5) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0.44 + (((tickAnim - 43) / 3) * (12.75-(0.44)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightFoot, rightFoot.rotateAngleX + (float) Math.toRadians(xx), rightFoot.rotateAngleY + (float) Math.toRadians(yy), rightFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 8) * (1.805-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (-0.475-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 38) / 5) * (0-(0)));
            yy = 1.805 + (((tickAnim - 38) / 5) * (0-(1.805)));
            zz = -0.475 + (((tickAnim - 38) / 5) * (0-(-0.475)));
        }
        else if (tickAnim >= 43 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 43) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightFoot.rotationPointX = this.rightFoot.rotationPointX + (float)(xx);
        this.rightFoot.rotationPointY = this.rightFoot.rotationPointY - (float)(yy);
        this.rightFoot.rotationPointZ = this.rightFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (-14-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = -14 + (((tickAnim - 30) / 8) * (0-(-14)));
            yy = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 8) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightToe, rightToe.rotateAngleX + (float) Math.toRadians(xx), rightToe.rotateAngleY + (float) Math.toRadians(yy), rightToe.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 30) * (-0.425-(0)));
            zz = 0 + (((tickAnim - 0) / 30) * (1.35-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 30) / 8) * (0-(0)));
            yy = -0.425 + (((tickAnim - 30) / 8) * (0-(-0.425)));
            zz = 1.35 + (((tickAnim - 30) / 8) * (0-(1.35)));
        }
        else if (tickAnim >= 38 && tickAnim < 46) {
            xx = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightToe.rotationPointX = this.rightToe.rotationPointX + (float)(xx);
        this.rightToe.rotationPointY = this.rightToe.rotationPointY - (float)(yy);
        this.rightToe.rotationPointZ = this.rightToe.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraBarosaurus e = (EntityPrehistoricFloraBarosaurus) entity;
        animator.update(entity);

        animator.setAnimation(e.HURT_ANIMATION); //30 ticks
        animator.startKeyframe(8);
        animator.rotate(this.head, (float) Math.toRadians(-25), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.rotate(this.jaw, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(12);
        animator.resetKeyframe(10);

    }
}
