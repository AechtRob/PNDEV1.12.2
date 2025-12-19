package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraConcavenator;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelConcavenator extends ModelBasePalaeopedia {

    private final AdvancedModelRenderer fossil;
    private final AdvancedModelRenderer hips;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer chest;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer lefthand;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer righthand;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer neck2;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer neck3;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer neck4;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer HEADPART;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer HEADPART2;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer HEADPART3;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer cube_r36;
    private final AdvancedModelRenderer cube_r37;
    private final AdvancedModelRenderer HEADPART5;
    private final AdvancedModelRenderer cube_r38;
    private final AdvancedModelRenderer cube_r39;
    private final AdvancedModelRenderer cube_r40;
    private final AdvancedModelRenderer cube_r41;
    private final AdvancedModelRenderer HEADPART4;
    private final AdvancedModelRenderer cube_r42;
    private final AdvancedModelRenderer HEADPART9;
    private final AdvancedModelRenderer cube_r43;
    private final AdvancedModelRenderer HEADPART10;
    private final AdvancedModelRenderer HEADPART6;
    private final AdvancedModelRenderer cube_r44;
    private final AdvancedModelRenderer HEADPART7;
    private final AdvancedModelRenderer cube_r45;
    private final AdvancedModelRenderer HEADPART8;
    private final AdvancedModelRenderer HEADPART12;
    private final AdvancedModelRenderer cube_r46;
    private final AdvancedModelRenderer cube_r47;
    private final AdvancedModelRenderer cube_r48;
    private final AdvancedModelRenderer cube_r49;
    private final AdvancedModelRenderer eyeright;
    private final AdvancedModelRenderer eyeleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r50;
    private final AdvancedModelRenderer cube_r51;
    private final AdvancedModelRenderer cube_r52;
    private final AdvancedModelRenderer JAWPART;
    private final AdvancedModelRenderer cube_r53;
    private final AdvancedModelRenderer cube_r54;
    private final AdvancedModelRenderer cube_r55;
    private final AdvancedModelRenderer cube_r56;
    private final AdvancedModelRenderer cube_r57;
    private final AdvancedModelRenderer cube_r58;
    private final AdvancedModelRenderer cube_r59;
    private final AdvancedModelRenderer cube_r60;
    private final AdvancedModelRenderer cube_r61;
    private final AdvancedModelRenderer throat;
    private final AdvancedModelRenderer throatpouch;
    private final AdvancedModelRenderer throat2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightfoot;
    private final AdvancedModelRenderer righttoes;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftfoot;
    private final AdvancedModelRenderer lefttoes;
    private ModelAnimator animator;

    public ModelConcavenator() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.fossil = new AdvancedModelRenderer(this);
        this.fossil.setRotationPoint(0.0F, 1.2F, -2.0F);


        this.hips = new AdvancedModelRenderer(this);
        this.hips.setRotationPoint(0.0F, 0.6F, 2.0F);
        this.fossil.addChild(hips);
        this.setRotateAngle(hips, -0.1745F, 0.0F, 0.0F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.4102F, -0.0697F);
        this.hips.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -2.906F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 78, 31, -1.0F, -3.8415F, -3.9005F, 2, 4, 4, -0.003F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -4.8102F, -3.2697F);
        this.hips.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 3.0543F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 74, 8, -1.0F, -3.9611F, -4.1232F, 2, 4, 5, 0.005F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, -2.7F, -5.45F);
        this.hips.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0349F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 24, -4.0F, 0.0F, 0.0F, 8, 10, 9, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -2.4F, 3.3F);
        this.hips.addChild(tail);
        this.setRotateAngle(tail, 0.1309F, 0.0F, 0.0F);
        this.tail.cubeList.add(new ModelBox(tail, 23, 32, -2.5F, -0.2051F, 3.9143F, 5, 5, 12, 0.005F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.6779F, 0.4158F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2094F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 79, 0, -1.0F, -1.2677F, 0.0597F, 2, 3, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.2221F, 4.0158F);
        this.tail.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 59, -3.5F, -0.4467F, -4.7922F, 7, 7, 5, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -2.1051F, 3.9143F);
        this.tail.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0349F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 44, -1.0F, 0.0F, 0.1F, 2, 2, 12, 0.005F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 0.3949F, 15.9143F);
        this.tail.addChild(tail2);
        this.setRotateAngle(tail2, 0.0785F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 33, 12, -2.0F, -0.55F, -1.1F, 4, 3, 12, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.95F, 0.2F);
        this.tail2.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.1396F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 28, -1.0F, -0.1F, 0.0F, 2, 2, 11, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.25F, 11.0F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 48, 42, -1.5F, -0.75F, -0.2F, 3, 3, 10, 0.005F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.35F, 9.9F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, -0.1571F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 62, 19, -1.0F, -0.3465F, -0.2277F, 2, 2, 9, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.0465F, 8.8723F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, -0.2356F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 67, 61, -0.5F, -0.2675F, -0.1872F, 1, 1, 8, 0.005F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.9F, -5.2F);
        this.hips.addChild(body);
        this.setRotateAngle(body, 0.2795F, 0.0F, -0.0038F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -5.7101F, 1.5303F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.7453F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 55, 13, 0.0F, -4.0534F, -5.9501F, 1, 4, 6, -0.003F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -3.4101F, -4.1697F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.8901F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 71, 0.0F, -0.0711F, -0.5755F, 1, 3, 6, 0.007F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -3.5101F, -0.9697F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3185F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 88, -1.0F, -0.0432F, -0.076F, 2, 3, 3, 0.02F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -3.4101F, -4.9697F);
        this.body.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 81, -1.0F, -0.0432F, -0.076F, 2, 3, 4, 0.009F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -1.0101F, -12.9697F);
        this.body.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0524F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 0, -1.0F, -2.0212F, 0.0387F, 2, 3, 8, 0.005F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -0.1101F, 0.0303F);
        this.body.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -4.5F, -0.7122F, -12.9925F, 9, 10, 13, 0.005F, false));

        this.chest = new AdvancedModelRenderer(this);
        this.chest.setRotationPoint(0.0F, -1.2601F, -12.9697F);
        this.body.addChild(chest);
        this.setRotateAngle(chest, 0.1745F, 0.0F, 0.0F);
        this.chest.cubeList.add(new ModelBox(chest, 54, 0, -3.5F, -0.1388F, -4.9085F, 7, 7, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, 0.7948F, -3.3489F);
        this.chest.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1236F, 0.097F, -0.524F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 26, 31, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -1.8388F, 0.1915F);
        this.chest.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0524F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 69, -1.0F, 0.1F, -4.9F, 2, 3, 5, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 6.8612F, -4.9085F);
        this.chest.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.7156F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 65, 44, -3.5F, -3.0F, -0.3F, 7, 3, 4, -0.005F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(3.5F, 5.9112F, -3.6085F);
        this.chest.addChild(leftarm);
        this.setRotateAngle(leftarm, 0.6081F, 0.3468F, -0.0594F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 45, 0, -0.9995F, -0.5691F, -0.9293F, 2, 5, 2, 0.0F, false));
        this.leftarm.cubeList.add(new ModelBox(leftarm, 87, 28, 0.21F, 0.4309F, -0.0293F, 0, 4, 2, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.0005F, 3.5309F, -0.6293F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, -0.8727F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 24, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.01F, false));
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 32, 0, 0.2F, -0.5F, 1.5F, 0, 5, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, 0.5F, 1.7F);
        this.leftarm2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.6109F, 0.2182F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 50, 56, -0.3F, -1.0162F, -0.5438F, 0, 1, 3, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 2.5F, 1.7F);
        this.leftarm2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0873F, 0.2182F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 26, 24, -0.3F, -1.0086F, -0.3695F, 0, 1, 5, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.5F, 3.5F, 1.7F);
        this.leftarm2.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 65, 13, -0.3F, 0.0F, -0.2F, 0, 1, 4, 0.0F, false));

        this.lefthand = new AdvancedModelRenderer(this);
        this.lefthand.setRotationPoint(1.0F, 4.5F, 1.8F);
        this.leftarm2.addChild(lefthand);
        this.setRotateAngle(lefthand, 0.0F, 0.0F, 0.3054F);
        this.lefthand.cubeList.add(new ModelBox(lefthand, 0, 44, -2.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-3.5F, 5.9112F, -3.6085F);
        this.chest.addChild(rightarm);
        this.setRotateAngle(rightarm, 0.6081F, -0.3468F, 0.0594F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 45, 0, -1.0005F, -0.5691F, -0.9293F, 2, 5, 2, 0.0F, true));
        this.rightarm.cubeList.add(new ModelBox(rightarm, 87, 28, -0.21F, 0.4309F, -0.0293F, 0, 4, 2, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.0005F, 3.5309F, -0.6293F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, -0.8727F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 24, -1.0F, -0.5F, -0.5F, 2, 5, 2, 0.01F, true));
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 32, 0, -0.2F, -0.5F, 1.5F, 0, 5, 2, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-0.5F, 0.5F, 1.7F);
        this.rightarm2.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.6109F, -0.2182F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 50, 56, 0.3F, -1.0162F, -0.5438F, 0, 1, 3, 0.0F, true));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-0.5F, 2.5F, 1.7F);
        this.rightarm2.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0873F, -0.2182F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 26, 24, 0.3F, -1.0086F, -0.3695F, 0, 1, 5, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(-0.5F, 3.5F, 1.7F);
        this.rightarm2.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1309F, -0.2182F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 65, 13, 0.3F, 0.0F, -0.2F, 0, 1, 4, 0.0F, true));

        this.righthand = new AdvancedModelRenderer(this);
        this.righthand.setRotationPoint(-1.0F, 4.5F, 1.8F);
        this.rightarm2.addChild(righthand);
        this.setRotateAngle(righthand, 0.0F, 0.0F, -0.3054F);
        this.righthand.cubeList.add(new ModelBox(righthand, 0, 44, 0.0F, 0.0F, -2.5F, 2, 5, 3, 0.0F, true));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 1.1112F, -2.8585F);
        this.chest.addChild(neck);
        this.setRotateAngle(neck, -1.0123F, 0.0F, 0.0F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 1.4717F, -1.4322F);
        this.neck.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3142F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 68, -1.5F, -3.1294F, -3.942F, 3, 3, 6, 0.005F, false));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 50, 56, -2.5F, -1.8295F, -3.942F, 5, 5, 7, 0.005F, false));

        this.neck2 = new AdvancedModelRenderer(this);
        this.neck2.setRotationPoint(0.0F, 2.2217F, -4.9322F);
        this.neck.addChild(neck2);
        this.setRotateAngle(neck2, -0.0698F, 0.0F, 0.0F);


        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -0.4337F, -0.9802F);
        this.neck2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.1833F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 50, -1.0F, 3.0F, -2.0F, 2, 1, 4, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 76, 18, -1.5F, -2.0F, -2.0F, 3, 5, 4, 0.0F, false));

        this.neck3 = new AdvancedModelRenderer(this);
        this.neck3.setRotationPoint(0.0F, -0.6376F, -2.774F);
        this.neck2.addChild(neck3);
        this.setRotateAngle(neck3, 0.0873F, 0.0F, 0.0F);


        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.4167F, -0.1716F);
        this.neck3.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.2182F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 62, 31, -1.0F, 4.0F, -3.0F, 2, 2, 3, 0.02F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.0F, -1.0166F, -3.1716F);
        this.neck3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 67, 81, -1.5F, -0.0412F, 0.0155F, 3, 5, 3, 0.02F, false));

        this.neck4 = new AdvancedModelRenderer(this);
        this.neck4.setRotationPoint(0.0F, 0.0833F, -2.9216F);
        this.neck3.addChild(neck4);
        this.setRotateAngle(neck4, 0.4363F, 0.0F, 0.0F);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 5.1784F, -1.977F);
        this.neck4.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.0175F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 46, 34, -1.0F, -1.1354F, 0.0136F, 2, 1, 3, 0.01F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.8216F, -2.777F);
        this.neck4.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.1396F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 79, -1.5F, 0.1175F, -0.0292F, 3, 5, 3, 0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 1.4863F, -2.3551F);
        this.neck4.addChild(head);
        this.setRotateAngle(head, 0.3054F, 0.0F, 0.0F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -1.8167F, -0.0191F);
        this.head.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.1658F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 10, -1.5F, -0.3F, -0.525F, 3, 1, 1, -0.005F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(0.0F, 1.3235F, -2.7709F);
        this.head.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.7505F, 0.0F, 0.0F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 32, 68, -1.0F, -2.0144F, 0.0139F, 2, 2, 1, 0.0F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(0.0F, 1.3235F, -0.8709F);
        this.head.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0873F, 0.0F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 35, 85, -1.5F, -1.9488F, -1.9789F, 3, 2, 3, 0.0F, false));

        this.HEADPART = new AdvancedModelRenderer(this);
        this.HEADPART.setRotationPoint(0.5F, -2.5265F, -1.9709F);
        this.head.addChild(HEADPART);
        this.setRotateAngle(HEADPART, 0.1833F, 0.0F, 0.0F);
        this.HEADPART.cubeList.add(new ModelBox(HEADPART, 49, 69, -1.5F, 0.55F, -2.2F, 2, 2, 2, -0.016F, false));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(0.0F, 0.6F, -0.7F);
        this.HEADPART.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.1396F, 0.0F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 46, 28, -2.0F, -0.1273F, 0.0169F, 3, 3, 2, -0.01F, false));

        this.HEADPART2 = new AdvancedModelRenderer(this);
        this.HEADPART2.setRotationPoint(0.0F, 0.0F, -3.95F);
        this.HEADPART.addChild(HEADPART2);
        this.setRotateAngle(HEADPART2, 0.2618F, 0.0F, 0.0F);


        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(0.0F, 0.7F, -0.1F);
        this.HEADPART2.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.192F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 59, -1.5F, -0.0496F, -0.0175F, 2, 2, 2, -0.02F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, 0.9F, -2.0F);
        this.HEADPART2.addChild(cube_r34);
        this.setRotateAngle(cube_r34, 0.1047F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 84, 8, -1.0F, -0.0499F, -0.007F, 1, 2, 2, -0.02F, false));

        this.HEADPART3 = new AdvancedModelRenderer(this);
        this.HEADPART3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.HEADPART2.addChild(HEADPART3);
        this.setRotateAngle(HEADPART3, 0.3665F, 0.0F, 0.0F);


        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(-1.0F, 0.6F, -0.1F);
        this.HEADPART3.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.192F, 0.0F, 0.0F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 66, 24, -0.3F, 0.3957F, -0.0544F, 1, 2, 1, -0.032F, true));
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 66, 24, 0.3F, 0.3957F, -0.0544F, 1, 2, 1, -0.03F, false));

        this.cube_r36 = new AdvancedModelRenderer(this);
        this.cube_r36.setRotationPoint(-1.0F, 0.9F, -0.8F);
        this.HEADPART3.addChild(cube_r36);
        this.setRotateAngle(cube_r36, -0.192F, 0.0F, 0.0F);
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 44, -0.2F, -0.0165F, -0.0597F, 1, 2, 1, -0.03F, true));
        this.cube_r36.cubeList.add(new ModelBox(cube_r36, 17, 44, 0.2F, -0.0165F, -0.0597F, 1, 2, 1, -0.032F, false));

        this.cube_r37 = new AdvancedModelRenderer(this);
        this.cube_r37.setRotationPoint(-1.0F, 0.9F, -1.7F);
        this.HEADPART3.addChild(cube_r37);
        this.setRotateAngle(cube_r37, -0.0349F, 0.0F, 0.0F);
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 15, 72, -0.2F, -0.0704F, -0.0353F, 1, 1, 1, -0.036F, true));
        this.cube_r37.cubeList.add(new ModelBox(cube_r37, 15, 72, 0.2F, -0.0704F, -0.0353F, 1, 1, 1, -0.03F, false));

        this.HEADPART5 = new AdvancedModelRenderer(this);
        this.HEADPART5.setRotationPoint(0.5F, 2.9235F, -9.9209F);
        this.head.addChild(HEADPART5);
        this.setRotateAngle(HEADPART5, 0.0436F, 0.0F, 0.0F);


        this.cube_r38 = new AdvancedModelRenderer(this);
        this.cube_r38.setRotationPoint(-0.5F, -0.55F, 3.55F);
        this.HEADPART5.addChild(cube_r38);
        this.setRotateAngle(cube_r38, 0.1047F, 0.0F, 0.0F);
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 13, 82, -1.2F, -1.0004F, -0.9843F, 1, 1, 1, -0.01F, true));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 13, 82, 0.2F, -1.0004F, -0.9843F, 1, 1, 1, -0.01F, false));
        this.cube_r38.cubeList.add(new ModelBox(cube_r38, 13, 82, -0.4F, -1.0004F, -0.9843F, 1, 1, 1, -0.02F, false));

        this.cube_r39 = new AdvancedModelRenderer(this);
        this.cube_r39.setRotationPoint(-0.5F, -0.0882F, 2.9675F);
        this.HEADPART5.addChild(cube_r39);
        this.setRotateAngle(cube_r39, 0.192F, 0.0F, 0.0F);
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, -0.9F, -0.7F, -0.3F, 0, 1, 1, 0.0F, true));
        this.cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 0, 0.9F, -0.7F, -0.3F, 0, 1, 1, 0.0F, false));

        this.cube_r40 = new AdvancedModelRenderer(this);
        this.cube_r40.setRotationPoint(-0.5F, -0.461F, 1.4891F);
        this.HEADPART5.addChild(cube_r40);
        this.setRotateAngle(cube_r40, 0.0349F, 0.0F, 0.0F);
        this.cube_r40.cubeList.add(new ModelBox(cube_r40, 54, 82, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

        this.cube_r41 = new AdvancedModelRenderer(this);
        this.cube_r41.setRotationPoint(-0.5F, -1.05F, 1.85F);
        this.HEADPART5.addChild(cube_r41);
        this.setRotateAngle(cube_r41, -0.0698F, 0.0F, 0.0F);
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 87, 16, -0.7F, -0.5F, -1.0F, 1, 1, 2, -0.005F, true));
        this.cube_r41.cubeList.add(new ModelBox(cube_r41, 87, 16, -0.3F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

        this.HEADPART4 = new AdvancedModelRenderer(this);
        this.HEADPART4.setRotationPoint(-1.3124F, -2.212F, 1.6097F);
        this.HEADPART5.addChild(HEADPART4);
        this.setRotateAngle(HEADPART4, 0.5677F, -0.0021F, -0.198F);


        this.cube_r42 = new AdvancedModelRenderer(this);
        this.cube_r42.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(cube_r42);
        this.setRotateAngle(cube_r42, 0.0F, 0.0F, 0.0349F);
        this.cube_r42.cubeList.add(new ModelBox(cube_r42, 86, 50, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, true));

        this.HEADPART9 = new AdvancedModelRenderer(this);
        this.HEADPART9.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART4.addChild(HEADPART9);
        this.setRotateAngle(HEADPART9, -0.1745F, 0.0F, 0.0F);


        this.cube_r43 = new AdvancedModelRenderer(this);
        this.cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HEADPART9.addChild(cube_r43);
        this.setRotateAngle(cube_r43, 0.0F, 0.0F, 0.0349F);
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 85, 0.0F, 1.0F, -0.95F, 0, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 85, 0.0F, 1.0F, -0.95F, 0, 1, 1, 0.0F, true));
        this.cube_r43.cubeList.add(new ModelBox(cube_r43, 56, 85, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, true));

        this.HEADPART10 = new AdvancedModelRenderer(this);
        this.HEADPART10.setRotationPoint(0.5F, 1.1222F, 3.3192F);
        this.HEADPART9.addChild(HEADPART10);
        this.setRotateAngle(HEADPART10, 0.7854F, 0.0F, 0.0F);
        this.HEADPART10.cubeList.add(new ModelBox(HEADPART10, 0, 59, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, true));

        this.HEADPART6 = new AdvancedModelRenderer(this);
        this.HEADPART6.setRotationPoint(0.3124F, -2.212F, 1.6097F);
        this.HEADPART5.addChild(HEADPART6);
        this.setRotateAngle(HEADPART6, 0.5677F, 0.0021F, 0.198F);


        this.cube_r44 = new AdvancedModelRenderer(this);
        this.cube_r44.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(cube_r44);
        this.setRotateAngle(cube_r44, 0.0F, 0.0F, -0.0349F);
        this.cube_r44.cubeList.add(new ModelBox(cube_r44, 86, 50, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

        this.HEADPART7 = new AdvancedModelRenderer(this);
        this.HEADPART7.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.HEADPART6.addChild(HEADPART7);
        this.setRotateAngle(HEADPART7, -0.1745F, 0.0F, 0.0F);


        this.cube_r45 = new AdvancedModelRenderer(this);
        this.cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HEADPART7.addChild(cube_r45);
        this.setRotateAngle(cube_r45, 0.0F, 0.0F, -0.0349F);
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 62, 85, 0.0F, 1.0F, -0.95F, 0, 1, 1, 0.0F, false));
        this.cube_r45.cubeList.add(new ModelBox(cube_r45, 56, 85, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.01F, false));

        this.HEADPART8 = new AdvancedModelRenderer(this);
        this.HEADPART8.setRotationPoint(-0.5F, 1.1222F, 3.3192F);
        this.HEADPART7.addChild(HEADPART8);
        this.setRotateAngle(HEADPART8, 0.7854F, 0.0F, 0.0F);
        this.HEADPART8.cubeList.add(new ModelBox(HEADPART8, 0, 59, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

        this.HEADPART12 = new AdvancedModelRenderer(this);
        this.HEADPART12.setRotationPoint(0.0F, -0.05F, 4.55F);
        this.HEADPART5.addChild(HEADPART12);
        this.setRotateAngle(HEADPART12, 0.1309F, 0.0F, 0.0F);


        this.cube_r46 = new AdvancedModelRenderer(this);
        this.cube_r46.setRotationPoint(0.0F, 0.45F, -0.05F);
        this.HEADPART12.addChild(cube_r46);
        this.setRotateAngle(cube_r46, 0.2182F, 0.0F, 0.0F);
        this.cube_r46.cubeList.add(new ModelBox(cube_r46, 78, 66, -1.5F, -1.6F, 1.4F, 2, 1, 1, 0.0F, false));

        this.cube_r47 = new AdvancedModelRenderer(this);
        this.cube_r47.setRotationPoint(0.0F, 0.45F, -0.05F);
        this.HEADPART12.addChild(cube_r47);
        this.setRotateAngle(cube_r47, 0.0436F, 0.0F, 0.0F);
        this.cube_r47.cubeList.add(new ModelBox(cube_r47, 10, 79, -1.5F, -1.6F, -0.3F, 2, 1, 1, 0.0F, false));

        this.cube_r48 = new AdvancedModelRenderer(this);
        this.cube_r48.setRotationPoint(-0.5F, -1.8F, 5.2F);
        this.HEADPART12.addChild(cube_r48);
        this.setRotateAngle(cube_r48, -0.1745F, 0.0F, 0.0F);
        this.cube_r48.cubeList.add(new ModelBox(cube_r48, 83, 68, -1.5F, -1.8F, -2.0F, 3, 3, 3, 0.02F, false));

        this.cube_r49 = new AdvancedModelRenderer(this);
        this.cube_r49.setRotationPoint(-0.5F, -0.9F, 3.0F);
        this.HEADPART12.addChild(cube_r49);
        this.setRotateAngle(cube_r49, 0.0698F, 0.0F, 0.0F);
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 46, 80, -0.3F, -2.0F, -4.0F, 1, 2, 5, -0.005F, false));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 46, 80, -1.2F, -2.0F, -4.0F, 1, 2, 5, 0.0F, true));
        this.cube_r49.cubeList.add(new ModelBox(cube_r49, 46, 80, 0.2F, -2.0F, -4.0F, 1, 2, 5, 0.0F, false));

        this.eyeright = new AdvancedModelRenderer(this);
        this.eyeright.setRotationPoint(-1.76F, -3.0695F, 3.9225F);
        this.HEADPART12.addChild(eyeright);
        this.setRotateAngle(eyeright, -0.192F, 0.0F, 0.0F);
        this.eyeright.cubeList.add(new ModelBox(eyeright, 70, 72, -0.3F, -0.2F, -0.675F, 1, 1, 2, 0.0F, true));

        this.eyeleft = new AdvancedModelRenderer(this);
        this.eyeleft.setRotationPoint(0.76F, -3.0695F, 3.9225F);
        this.HEADPART12.addChild(eyeleft);
        this.setRotateAngle(eyeleft, -0.192F, 0.0F, 0.0F);
        this.eyeleft.cubeList.add(new ModelBox(eyeleft, 70, 72, -0.7F, -0.2F, -0.675F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 0.9735F, 0.7291F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, 0.1309F, 0.0F, 0.0F);


        this.cube_r50 = new AdvancedModelRenderer(this);
        this.cube_r50.setRotationPoint(0.5F, -0.4413F, -3.0619F);
        this.jaw.addChild(cube_r50);
        this.setRotateAngle(cube_r50, -0.4363F, 0.0F, 0.0F);
        this.cube_r50.cubeList.add(new ModelBox(cube_r50, 84, 41, -2.0F, -1.9529F, 0.0411F, 3, 2, 3, -0.03F, false));

        this.cube_r51 = new AdvancedModelRenderer(this);
        this.cube_r51.setRotationPoint(0.5F, -0.5413F, -3.4619F);
        this.jaw.addChild(cube_r51);
        this.setRotateAngle(cube_r51, -0.9774F, 0.0F, 0.0F);
        this.cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 53, -1.5F, -0.9314F, -0.0541F, 2, 1, 1, -0.01F, false));

        this.cube_r52 = new AdvancedModelRenderer(this);
        this.cube_r52.setRotationPoint(0.5F, -0.0413F, -1.1619F);
        this.jaw.addChild(cube_r52);
        this.setRotateAngle(cube_r52, -0.1833F, 0.0F, 0.0F);
        this.cube_r52.cubeList.add(new ModelBox(cube_r52, 36, 78, -2.0F, 0.0F, -2.4F, 3, 2, 4, -0.01F, false));

        this.JAWPART = new AdvancedModelRenderer(this);
        this.JAWPART.setRotationPoint(0.5F, -0.4413F, -4.0619F);
        this.jaw.addChild(JAWPART);
        this.setRotateAngle(JAWPART, -0.0436F, 0.0F, 0.0F);
        this.JAWPART.cubeList.add(new ModelBox(JAWPART, 70, 31, -1.5F, 0.1886F, -2.1995F, 2, 1, 1, 0.0F, false));

        this.cube_r53 = new AdvancedModelRenderer(this);
        this.cube_r53.setRotationPoint(0.0F, 1.7F, -3.8F);
        this.JAWPART.addChild(cube_r53);
        this.setRotateAngle(cube_r53, -0.1658F, 0.0F, 0.0F);
        this.cube_r53.cubeList.add(new ModelBox(cube_r53, 65, 34, -1.5F, -1.0163F, -0.1797F, 2, 1, 8, -0.03F, false));

        this.cube_r54 = new AdvancedModelRenderer(this);
        this.cube_r54.setRotationPoint(-1.0F, 1.8F, -0.4F);
        this.JAWPART.addChild(cube_r54);
        this.setRotateAngle(cube_r54, -0.0436F, 0.0F, 0.0F);
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 78, 59, -0.7F, -0.9679F, -3.7559F, 2, 1, 5, -0.019F, true));
        this.cube_r54.cubeList.add(new ModelBox(cube_r54, 78, 59, -0.3F, -0.9679F, -3.7559F, 2, 1, 5, -0.019F, false));

        this.cube_r55 = new AdvancedModelRenderer(this);
        this.cube_r55.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.JAWPART.addChild(cube_r55);
        this.setRotateAngle(cube_r55, 0.192F, 0.0F, 0.0F);
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 22, 85, -1.3F, 0.0F, -2.8F, 2, 1, 4, -0.02F, false));
        this.cube_r55.cubeList.add(new ModelBox(cube_r55, 22, 85, -1.7F, 0.0F, -2.8F, 2, 1, 4, -0.025F, true));

        this.cube_r56 = new AdvancedModelRenderer(this);
        this.cube_r56.setRotationPoint(0.0F, 1.8F, -4.8F);
        this.JAWPART.addChild(cube_r56);
        this.setRotateAngle(cube_r56, -0.0873F, 0.0F, 0.0F);
        this.cube_r56.cubeList.add(new ModelBox(cube_r56, 78, 59, -1.0F, -0.9964F, -1.0187F, 1, 1, 1, -0.02F, false));

        this.cube_r57 = new AdvancedModelRenderer(this);
        this.cube_r57.setRotationPoint(-1.0F, 0.4F, -5.05F);
        this.JAWPART.addChild(cube_r57);
        this.setRotateAngle(cube_r57, 0.1745F, 0.0F, 0.0F);
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 77, 81, 0.125F, -0.2F, -0.75F, 0, 1, 1, 0.0F, true));
        this.cube_r57.cubeList.add(new ModelBox(cube_r57, 77, 81, 0.875F, -0.2F, -0.75F, 0, 1, 1, 0.0F, false));

        this.cube_r58 = new AdvancedModelRenderer(this);
        this.cube_r58.setRotationPoint(-1.0F, 0.4F, -6.15F);
        this.JAWPART.addChild(cube_r58);
        this.setRotateAngle(cube_r58, -0.0873F, 0.0F, 0.0F);
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 65, 71, -0.1F, -0.4F, 1.95F, 0, 1, 1, 0.0F, true));
        this.cube_r58.cubeList.add(new ModelBox(cube_r58, 65, 71, 1.1F, -0.4F, 1.95F, 0, 1, 1, 0.0F, false));

        this.cube_r59 = new AdvancedModelRenderer(this);
        this.cube_r59.setRotationPoint(-0.5F, 0.9968F, -4.8119F);
        this.JAWPART.addChild(cube_r59);
        this.setRotateAngle(cube_r59, 0.0349F, 0.0F, 0.0F);
        this.cube_r59.cubeList.add(new ModelBox(cube_r59, 74, 0, -0.5F, -0.3F, -1.0F, 1, 1, 2, -0.01F, false));

        this.cube_r60 = new AdvancedModelRenderer(this);
        this.cube_r60.setRotationPoint(-0.7F, 1.5F, -2.9F);
        this.JAWPART.addChild(cube_r60);
        this.setRotateAngle(cube_r60, 0.1047F, 0.0F, 0.0F);
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 37, 28, -0.5F, -0.916F, -2.0165F, 1, 1, 2, -0.02F, true));
        this.cube_r60.cubeList.add(new ModelBox(cube_r60, 37, 28, -0.1F, -0.916F, -2.0165F, 1, 1, 2, -0.023F, false));

        this.cube_r61 = new AdvancedModelRenderer(this);
        this.cube_r61.setRotationPoint(-0.7F, 0.5F, -2.7F);
        this.JAWPART.addChild(cube_r61);
        this.setRotateAngle(cube_r61, 0.1396F, 0.0F, 0.0F);
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 26, 50, -0.5F, 0.0F, -1.9F, 1, 1, 2, -0.013F, true));
        this.cube_r61.cubeList.add(new ModelBox(cube_r61, 26, 50, -0.1F, 0.0F, -1.9F, 1, 1, 2, -0.016F, false));

        this.throat = new AdvancedModelRenderer(this);
        this.throat.setRotationPoint(0.5F, 2.5587F, -4.2619F);
        this.jaw.addChild(throat);
        this.setRotateAngle(throat, -0.0873F, 0.0F, 0.0F);


        this.throatpouch = new AdvancedModelRenderer(this);
        this.throatpouch.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.throat.addChild(throatpouch);
        this.setRotateAngle(throatpouch, -0.2618F, 0.0F, 0.0F);


        this.throat2 = new AdvancedModelRenderer(this);
        this.throat2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.throat.addChild(throat2);
        this.setRotateAngle(throat2, -0.3491F, 0.0F, 0.0F);


        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-4.0F, 0.0F, -0.1F);
        this.hips.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.288F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 29, 50, -2.0F, -1.9252F, -2.7449F, 4, 11, 6, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(0.0F, 9.0748F, -2.4949F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 0.9163F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 21, 68, -1.5F, -0.1882F, -0.1602F, 3, 12, 4, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 11.8118F, 3.6398F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.733F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 0, 0, -1.5F, -0.0795F, -2.8485F, 3, 6, 3, -0.004F, true));

        this.rightfoot = new AdvancedModelRenderer(this);
        this.rightfoot.setRotationPoint(0.0F, 5.8113F, -0.2031F);
        this.rightleg3.addChild(rightfoot);
        this.setRotateAngle(rightfoot, 0.2836F, 0.0F, 0.0F);
        this.rightfoot.cubeList.add(new ModelBox(rightfoot, 71, 52, -2.5F, -1.2453F, -3.5536F, 5, 2, 4, 0.0F, true));

        this.righttoes = new AdvancedModelRenderer(this);
        this.righttoes.setRotationPoint(0.0F, -0.2453F, -2.7536F);
        this.rightfoot.addChild(righttoes);
        this.righttoes.cubeList.add(new ModelBox(righttoes, 0, 72, -2.5F, -1.0F, -3.8F, 5, 2, 4, 0.01F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(4.0F, 0.0F, -0.1F);
        this.hips.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.288F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 29, 50, -2.0F, -1.9252F, -2.7449F, 4, 11, 6, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.0F, 9.0748F, -2.4949F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 0.9163F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 21, 68, -1.5F, -0.1882F, -0.1602F, 3, 12, 4, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 11.8118F, 3.6398F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.733F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 0, 0, -1.5F, -0.0795F, -2.8485F, 3, 6, 3, -0.004F, false));

        this.leftfoot = new AdvancedModelRenderer(this);
        this.leftfoot.setRotationPoint(0.0F, 5.8113F, -0.2031F);
        this.leftleg3.addChild(leftfoot);
        this.setRotateAngle(leftfoot, 0.2836F, 0.0F, 0.0F);
        this.leftfoot.cubeList.add(new ModelBox(leftfoot, 71, 52, -2.5F, -1.2453F, -3.5536F, 5, 2, 4, 0.0F, false));

        this.lefttoes = new AdvancedModelRenderer(this);
        this.lefttoes.setRotationPoint(0.0F, -0.2453F, -2.7536F);
        this.leftfoot.addChild(lefttoes);
        this.lefttoes.cubeList.add(new ModelBox(lefttoes, 0, 72, -2.5F, -1.0F, -3.8F, 5, 2, 4, 0.01F, false));

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
        this.hips.offsetY = -0.11F;
        this.hips.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.hips.offsetY = 0.6F;
        this.hips.offsetX = 0.1F;
        this.hips.offsetZ = 2.0F;
        this.hips.rotateAngleY = (float)Math.toRadians(240);
        this.hips.rotateAngleX = (float)Math.toRadians(-0);
        this.hips.rotateAngleZ = (float)Math.toRadians(3);
        this.hips.scaleChildren = true;
        float scaler = 0.45F;
        this.hips.setScale(scaler, scaler, scaler);
        //Start of pose:
        
        //End of pose, now render the model:
        this.hips.render(f);
        //Reset rotations, positions and sizing:
        this.hips.setScale(1.0F, 1.0F, 1.0F);
        this.hips.scaleChildren = false;
        resetToDefaultPose();
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraConcavenator EntityMegalosaurus = (EntityPrehistoricFloraConcavenator) e;
//        this.hips.offsetZ = -0.5F;

        AdvancedModelRenderer[] Tail = {this.tail, this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.neck2, this.neck3, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.lefthand};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.righthand};

        EntityMegalosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityMegalosaurus.getAnimation() == EntityMegalosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityMegalosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityMegalosaurus.getIsMoving()) {
                    this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                    this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);

                    this.chainWaveExtended(ArmL, 0.175F, 0.03F, 0.1F, 3F, f2, 1F);
                    this.chainWaveExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);
                    this.chainFlapExtended(ArmL, 0.175F, -0.03F, 0.1F, 3F, f2, 1F);
                    this.chainFlapExtended(ArmR, 0.175F, -0.03F, -0.1F, 0f, f2, 1F);

                    this.walk(this.leftarm, 0.175F, 0.10F, true, 3F, 0.05F, f2, 1F);
                    this.walk(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);
                    this.flap(this.leftarm, 0.175F, -0.10F, true, 3F, 0.05F, f2, 1F);
                    this.flap(this.rightarm, 0.175F, -0.10F, true, 0F, 0.05F, f2, 1F);

                    return;
                }

                if (EntityMegalosaurus.getIsFast()) { //Running


                } else { //Walking

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
    }
    



    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraConcavenator ee = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);

                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            //moving in water
            //
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The display/roar
            animRoar(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.SCRATCH_ANIMATION) {
            animRelax(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.NOISE_ANIMATION) {
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        
    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (1.25-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 1.25 + (((tickAnim - 4) / 4) * (11-(1.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 11 + (((tickAnim - 8) / 2) * (0-(11)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0.325-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0.325 + (((tickAnim - 8) / 7) * (0-(0.325)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.75 + (((tickAnim - 8) / 2) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (0-(-25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-7.75-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.75 + (((tickAnim - 8) / 2) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (-25-(0)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25 + (((tickAnim - 8) / 2) * (0-(-25)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 9.5 + (((tickAnim - 3) / 5) * (17.31909-(9.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (-2.60982-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (-3.03236-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 17.31909 + (((tickAnim - 8) / 2) * (13-(17.31909)));
            yy = -2.60982 + (((tickAnim - 8) / 2) * (0-(-2.60982)));
            zz = -3.03236 + (((tickAnim - 8) / 2) * (0-(-3.03236)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 13 + (((tickAnim - 10) / 5) * (0-(13)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-21-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = -21 + (((tickAnim - 3) / 7) * (-10.25-(-21)));
            yy = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 7) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -10.25 + (((tickAnim - 10) / 5) * (0-(-10.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.95-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0.95 + (((tickAnim - 3) / 12) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.5 + (((tickAnim - 3) / 5) * (-2-(3.5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -2 + (((tickAnim - 8) / 2) * (11.5-(-2)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 11.5 + (((tickAnim - 10) / 5) * (0-(11.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(0);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(0);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (-14-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -14 + (((tickAnim - 8) / 2) * (2.25-(-14)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2.25 + (((tickAnim - 10) / 5) * (0-(2.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.2-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0.2 + (((tickAnim - 3) / 12) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5 + (((tickAnim - 3) / 5) * (-7.49562-(5)));
            yy = 0 + (((tickAnim - 3) / 5) * (5.68805-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (5.28895-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -7.49562 + (((tickAnim - 8) / 2) * (0-(-7.49562)));
            yy = 5.68805 + (((tickAnim - 8) / 2) * (0-(5.68805)));
            zz = 5.28895 + (((tickAnim - 8) / 2) * (0-(5.28895)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 5.5 + (((tickAnim - 4) / 4) * (42.75-(5.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 42.75 + (((tickAnim - 8) / 2) * (0-(42.75)));
            yy = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (23-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 23 + (((tickAnim - 17) / 18) * (-23.75-(23)));
            yy = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -23.75 + (((tickAnim - 35) / 15) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (17.25-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 35) {
            xx = 17.25 + (((tickAnim - 17) / 18) * (-9.5-(17.25)));
            yy = 0 + (((tickAnim - 17) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 18) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 35) / 15) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (-41-(0)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = -41 + (((tickAnim - 27) / 8) * (7-(-41)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 7 + (((tickAnim - 35) / 15) * (0-(7)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (41-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 41 + (((tickAnim - 8) / 9) * (51.5-(41)));
            yy = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 9) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 51.5 + (((tickAnim - 17) / 10) * (85.89-(51.5)));
            yy = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 10) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 85.89 + (((tickAnim - 27) / 8) * (48-(85.89)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 48 + (((tickAnim - 35) / 15) * (0-(48)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (1.625-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.6-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 8) / 9) * (0-(0)));
            yy = 1.625 + (((tickAnim - 8) / 9) * (2.35-(1.625)));
            zz = -0.6 + (((tickAnim - 8) / 9) * (-0.475-(-0.6)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            yy = 2.35 + (((tickAnim - 17) / 5) * (4.345-(2.35)));
            zz = -0.475 + (((tickAnim - 17) / 5) * (-0.76-(-0.475)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            yy = 4.345 + (((tickAnim - 22) / 5) * (2.895-(4.345)));
            zz = -0.76 + (((tickAnim - 22) / 5) * (-1.035-(-0.76)));
        }
        else if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            yy = 2.895 + (((tickAnim - 27) / 8) * (0.975-(2.895)));
            zz = -1.035 + (((tickAnim - 27) / 8) * (0-(-1.035)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.975 + (((tickAnim - 35) / 15) * (0-(0.975)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-61.25-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = -61.25 + (((tickAnim - 8) / 7) * (27.5-(-61.25)));
            yy = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 7) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 27.5 + (((tickAnim - 15) / 15) * (0-(27.5)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.45-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.24-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (0-(0)));
            yy = -0.45 + (((tickAnim - 8) / 7) * (0-(-0.45)));
            zz = -0.24 + (((tickAnim - 8) / 7) * (-0.475-(-0.24)));
        }
        else if (tickAnim >= 15 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 15) * (0-(0)));
            zz = -0.475 + (((tickAnim - 15) / 15) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);

    }
    public void animRoar(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 60;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (2.75-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 2.75 + (((tickAnim - 25) / 10) * (2.75-(2.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 2.75 + (((tickAnim - 35) / 25) * (0-(2.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (4.75-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            yy = 4.75 + (((tickAnim - 20) / 40) * (0-(4.75)));
            zz = 0 + (((tickAnim - 20) / 40) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (14-(0)));
            zz = 0 + (((tickAnim - 0) / 23) * (0-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 23) / 37) * (0-(0)));
            yy = 14 + (((tickAnim - 23) / 37) * (0-(14)));
            zz = 0 + (((tickAnim - 23) / 37) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 0) / 29) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 29) * (15.26-(0)));
            zz = 0 + (((tickAnim - 0) / 29) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 15.26 + (((tickAnim - 29) / 31) * (0-(15.26)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-6.12-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 10) / 19) * (0-(0)));
            yy = -6.12 + (((tickAnim - 10) / 19) * (17.45-(-6.12)));
            zz = 0 + (((tickAnim - 10) / 19) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 29) / 31) * (0-(0)));
            yy = 17.45 + (((tickAnim - 29) / 31) * (0-(17.45)));
            zz = 0 + (((tickAnim - 29) / 31) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-18.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 29) {
            xx = 0 + (((tickAnim - 10) / 19) * (0-(0)));
            yy = -18.75 + (((tickAnim - 10) / 19) * (26.05-(-18.75)));
            zz = 0 + (((tickAnim - 10) / 19) * (0-(0)));
        }
        else if (tickAnim >= 29 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 29) / 14) * (0-(0)));
            yy = 26.05 + (((tickAnim - 29) / 14) * (22-(26.05)));
            zz = 0 + (((tickAnim - 29) / 14) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 43) / 17) * (0-(0)));
            yy = 22 + (((tickAnim - 43) / 17) * (0-(22)));
            zz = 0 + (((tickAnim - 43) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 20) / 15) * (14.5-(8.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 14.5 + (((tickAnim - 35) / 25) * (0-(14.5)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.375-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0.375 + (((tickAnim - 20) / 15) * (0.43-(0.375)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0.43 + (((tickAnim - 35) / 25) * (0-(0.43)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 6.25 + (((tickAnim - 20) / 15) * (-10-(6.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -10 + (((tickAnim - 35) / 25) * (0-(-10)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0.2-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 40) * (0-(0)));
            zz = 0.2 + (((tickAnim - 20) / 40) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.78758-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (-30.17371-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.78758 + (((tickAnim - 20) / 15) * (-6.78758-(-6.78758)));
            yy = 23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 20) / 15) * (23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3-(23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
            zz = -30.17371 + (((tickAnim - 20) / 15) * (-30.17371-(-30.17371)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -6.78758 + (((tickAnim - 35) / 25) * (0-(-6.78758)));
            yy = 23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3 + (((tickAnim - 35) / 25) * (0-(23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*3)));
            zz = -30.17371 + (((tickAnim - 35) / 25) * (0-(-30.17371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 20) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 20) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 35) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 35) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.78758-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (-23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (30.17371-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.78758 + (((tickAnim - 20) / 15) * (-6.78758-(-6.78758)));
            yy = -23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3 + (((tickAnim - 20) / 15) * (-23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3-(-23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3)));
            zz = 30.17371 + (((tickAnim - 20) / 15) * (30.17371-(30.17371)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -6.78758 + (((tickAnim - 35) / 25) * (0-(-6.78758)));
            yy = -23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3 + (((tickAnim - 35) / 25) * (0-(-23.5339948683+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-3)));
            zz = 30.17371 + (((tickAnim - 35) / 25) * (0-(30.17371)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 20) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6 + (((tickAnim - 20) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6 + (((tickAnim - 35) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*6)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6 + (((tickAnim - 35) / 25) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-80))*-6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 20) / 15) * (18-(9.25)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 18 + (((tickAnim - 35) / 5) * (13.53-(18)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 13.53 + (((tickAnim - 40) / 5) * (27.05-(13.53)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 27.05 + (((tickAnim - 45) / 8) * (-1.47-(27.05)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -1.47 + (((tickAnim - 53) / 7) * (0-(-1.47)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 20) / 15) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (-18.12-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -18.12 + (((tickAnim - 40) / 5) * (4.75-(-18.12)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = 4.75 + (((tickAnim - 45) / 8) * (-12.87-(4.75)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -12.87 + (((tickAnim - 53) / 7) * (0-(-12.87)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.45-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0.45 + (((tickAnim - 40) / 20) * (0-(0.45)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck2.rotationPointX = this.neck2.rotationPointX + (float)(xx);
        this.neck2.rotationPointY = this.neck2.rotationPointY - (float)(yy);
        this.neck2.rotationPointZ = this.neck2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -6.75 + (((tickAnim - 20) / 15) * (-6.75-(-6.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -6.75 + (((tickAnim - 35) / 5) * (-8.65-(-6.75)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 53) {
            xx = -8.65 + (((tickAnim - 40) / 13) * (11.76-(-8.65)));
            yy = 0 + (((tickAnim - 40) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 13) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 11.76 + (((tickAnim - 53) / 7) * (0-(11.76)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 40) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 40) * (0.15-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0.15 + (((tickAnim - 40) / 20) * (0-(0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -7 + (((tickAnim - 20) / 15) * (-7-(-7)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7 + (((tickAnim - 35) / 5) * (-2.97-(-7)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = -2.97 + (((tickAnim - 40) / 5) * (-17.95-(-2.97)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 53) {
            xx = -17.95 + (((tickAnim - 45) / 8) * (-0.22-(-17.95)));
            yy = 0 + (((tickAnim - 45) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 8) * (0-(0)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -0.22 + (((tickAnim - 53) / 7) * (0-(-0.22)));
            yy = 0 + (((tickAnim - 53) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 53) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (-7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = -7.5 + (((tickAnim - 20) / 15) * (-7.5-(-7.5)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = -7.5 + (((tickAnim - 35) / 5) * (4.25-(-7.5)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 60) {
            xx = 4.25 + (((tickAnim - 40) / 20) * (0-(4.25)));
            yy = 0 + (((tickAnim - 40) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (28.75-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 35) {
            xx = 28.75 + (((tickAnim - 20) / 15) * (27.25-(28.75)));
            yy = 0 + (((tickAnim - 20) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 15) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 27.25 + (((tickAnim - 35) / 5) * (39.63-(27.25)));
            yy = 0 + (((tickAnim - 35) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 5) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 45) {
            xx = 39.63 + (((tickAnim - 40) / 5) * (0-(39.63)));
            yy = 0 + (((tickAnim - 40) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 5) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 45) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 25.75 + (((tickAnim - 25) / 10) * (25.75-(25.75)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 25.75 + (((tickAnim - 35) / 13) * (-16.23-(25.75)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -16.23 + (((tickAnim - 48) / 12) * (0-(-16.23)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (29.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 29.5 + (((tickAnim - 13) / 12) * (-13.5-(29.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -13.5 + (((tickAnim - 25) / 10) * (-13.5-(-13.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = -13.5 + (((tickAnim - 35) / 13) * (39.45-(-13.5)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 39.45 + (((tickAnim - 48) / 12) * (0-(39.45)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (-29.25-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = -29.25 + (((tickAnim - 13) / 12) * (0-(-29.25)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (-39.75-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -39.75 + (((tickAnim - 48) / 12) * (0-(-39.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (43.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 43.5 + (((tickAnim - 13) / 12) * (-11.5-(43.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -11.5 + (((tickAnim - 25) / 10) * (-11.5-(-11.5)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = -11.5 + (((tickAnim - 35) / 13) * (70.13-(-11.5)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 70.13 + (((tickAnim - 48) / 12) * (0-(70.13)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (1.15-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.2-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 1.15 + (((tickAnim - 13) / 12) * (0.25-(1.15)));
            zz = -0.2 + (((tickAnim - 13) / 12) * (0-(-0.2)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0.25 + (((tickAnim - 25) / 10) * (0.25-(0.25)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            yy = 0.25 + (((tickAnim - 35) / 13) * (2.16-(0.25)));
            zz = 0 + (((tickAnim - 35) / 13) * (-0.4-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 2.16 + (((tickAnim - 48) / 12) * (0-(2.16)));
            zz = -0.4 + (((tickAnim - 48) / 12) * (0-(-0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (30.5-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 30.5 + (((tickAnim - 13) / 12) * (0-(30.5)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 12) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (37.75-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (0-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 37.75 + (((tickAnim - 48) / 12) * (0-(37.75)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 48) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.45-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 12) * (0-(0)));
            zz = -0.45 + (((tickAnim - 13) / 12) * (0-(-0.45)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 48) {
            xx = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 13) * (-0.35-(0)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 48) / 12) * (0-(0)));
            zz = -0.35 + (((tickAnim - 48) / 12) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -8 + (((tickAnim - 25) / 10) * (-8-(-8)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -8 + (((tickAnim - 35) / 25) * (0-(-8)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -8.25 + (((tickAnim - 25) / 10) * (-8.25-(-8.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -8.25 + (((tickAnim - 35) / 25) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = -9.25 + (((tickAnim - 25) / 10) * (-9.25-(-9.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = -9.25 + (((tickAnim - 35) / 25) * (0-(-9.25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (26.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 35) {
            xx = 26.25 + (((tickAnim - 25) / 10) * (26.25-(26.25)));
            yy = 0 + (((tickAnim - 25) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 10) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 60) {
            xx = 26.25 + (((tickAnim - 35) / 25) * (0-(26.25)));
            yy = 0 + (((tickAnim - 35) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-10-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -10 + (((tickAnim - 18) / 15) * (-10-(-10)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -10 + (((tickAnim - 33) / 17) * (0-(-10)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(xx), hips.rotateAngleY + (float) Math.toRadians(yy), hips.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-8.6-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (7.775-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -8.6 + (((tickAnim - 18) / 15) * (-8.6-(-8.6)));
            zz = 7.775 + (((tickAnim - 18) / 15) * (7.775-(7.775)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -8.6 + (((tickAnim - 33) / 17) * (0-(-8.6)));
            zz = 7.775 + (((tickAnim - 33) / 17) * (0-(7.775)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(xx);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(yy);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -3 + (((tickAnim - 18) / 15) * (-3-(-3)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 33) / 17) * (0-(-3)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(xx), tail.rotateAngleY + (float) Math.toRadians(yy), tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-6.99555-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.08942-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.03105-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = -6.99555 + (((tickAnim - 10) / 8) * (-5.24222-(-6.99555)));
            yy = -0.08942 + (((tickAnim - 10) / 8) * (-0.15649-(-0.08942)));
            zz = 0.03105 + (((tickAnim - 10) / 8) * (0.05434-(0.03105)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -5.24222 + (((tickAnim - 18) / 15) * (-5.24222-(-5.24222)));
            yy = -0.15649 + (((tickAnim - 18) / 15) * (-0.15649-(-0.15649)));
            zz = 0.05434 + (((tickAnim - 18) / 15) * (0.05434-(0.05434)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -5.24222 + (((tickAnim - 33) / 17) * (0-(-5.24222)));
            yy = -0.15649 + (((tickAnim - 33) / 17) * (0-(-0.15649)));
            zz = 0.05434 + (((tickAnim - 33) / 17) * (0-(0.05434)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (21-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 21 + (((tickAnim - 18) / 15) * (21-(21)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 21 + (((tickAnim - 33) / 5) * (0-(21)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (17.5-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 17.5 + (((tickAnim - 18) / 15) * (17.5-(17.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 38) {
            xx = 17.5 + (((tickAnim - 33) / 5) * (0-(17.5)));
            yy = 0 + (((tickAnim - 33) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 5) * (0-(0)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 38) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (14-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 14 + (((tickAnim - 18) / 15) * (14-(14)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 14 + (((tickAnim - 33) / 17) * (0-(14)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 5 + (((tickAnim - 18) / 15) * (5-(5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 5 + (((tickAnim - 33) / 17) * (0-(5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -25.75 + (((tickAnim - 18) / 15) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 33) / 17) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 32.75 + (((tickAnim - 18) / 15) * (32.75-(32.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 32.75 + (((tickAnim - 33) / 17) * (0-(32.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-68.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -68.5 + (((tickAnim - 18) / 15) * (-68.5-(-68.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -68.5 + (((tickAnim - 33) / 17) * (0-(-68.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -1.675 + (((tickAnim - 18) / 15) * (-1.675-(-1.675)));
            zz = -1.2 + (((tickAnim - 18) / 15) * (-1.2-(-1.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -1.675 + (((tickAnim - 33) / 17) * (0-(-1.675)));
            zz = -1.2 + (((tickAnim - 33) / 17) * (0-(-1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (72.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 72.75 + (((tickAnim - 18) / 15) * (72.75-(72.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 72.75 + (((tickAnim - 33) / 17) * (0-(72.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.05 + (((tickAnim - 18) / 15) * (1.05-(1.05)));
            zz = -0.5 + (((tickAnim - 18) / 15) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.05 + (((tickAnim - 33) / 17) * (0-(1.05)));
            zz = -0.5 + (((tickAnim - 33) / 17) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-25.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -25.75 + (((tickAnim - 18) / 15) * (-25.75-(-25.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -25.75 + (((tickAnim - 33) / 17) * (0-(-25.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (32.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 32.75 + (((tickAnim - 18) / 15) * (32.75-(32.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 32.75 + (((tickAnim - 33) / 17) * (0-(32.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (-68.5-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = -68.5 + (((tickAnim - 18) / 15) * (-68.5-(-68.5)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = -68.5 + (((tickAnim - 33) / 17) * (0-(-68.5)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (-1.675-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-1.2-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = -1.675 + (((tickAnim - 18) / 15) * (-1.675-(-1.675)));
            zz = -1.2 + (((tickAnim - 18) / 15) * (-1.2-(-1.2)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = -1.675 + (((tickAnim - 33) / 17) * (0-(-1.675)));
            zz = -1.2 + (((tickAnim - 33) / 17) * (0-(-1.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (72.75-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 72.75 + (((tickAnim - 18) / 15) * (72.75-(72.75)));
            yy = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 15) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 72.75 + (((tickAnim - 33) / 17) * (0-(72.75)));
            yy = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (1.05-(0)));
            zz = 0 + (((tickAnim - 0) / 18) * (-0.5-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 18) / 15) * (0-(0)));
            yy = 1.05 + (((tickAnim - 18) / 15) * (1.05-(1.05)));
            zz = -0.5 + (((tickAnim - 18) / 15) * (-0.5-(-0.5)));
        }
        else if (tickAnim >= 33 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 33) / 17) * (0-(0)));
            yy = 1.05 + (((tickAnim - 33) / 17) * (0-(1.05)));
            zz = -0.5 + (((tickAnim - 33) / 17) * (0-(-0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);

    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 9 + (((tickAnim - 10) / 10) * (0-(9)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.275-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.275 + (((tickAnim - 10) / 10) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 11.25 + (((tickAnim - 10) / 10) * (0-(11.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.4-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.4 + (((tickAnim - 10) / 10) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.chest.rotationPointX = this.chest.rotationPointX + (float)(xx);
        this.chest.rotationPointY = this.chest.rotationPointY - (float)(yy);
        this.chest.rotationPointZ = this.chest.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (27.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 27.75 + (((tickAnim - 10) / 10) * (0-(27.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.55-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0.55 + (((tickAnim - 10) / 10) * (0-(0.55)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 19.25 + (((tickAnim - 10) / 10) * (0-(19.25)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 20 + (((tickAnim - 5) / 15) * (0-(20)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.275-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 15) * (0-(0)));
            zz = 0.275 + (((tickAnim - 5) / 15) * (0-(0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 12.25 + (((tickAnim - 5) / 5) * (0-(12.25)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0.405-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0.405 + (((tickAnim - 5) / 5) * (0.25-(0.405)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0.25 + (((tickAnim - 10) / 10) * (0-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 28.5 + (((tickAnim - 5) / 5) * (0-(28.5)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 28;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (2-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 2 + (((tickAnim - 16) / 12) * (0-(2)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 5 + (((tickAnim - 16) / 12) * (0-(5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(xx), chest.rotateAngleY + (float) Math.toRadians(yy), chest.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (18.35586-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (-5.40222-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 18.35586 + (((tickAnim - 16) / 12) * (0-(18.35586)));
            yy = 6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5 + (((tickAnim - 16) / 12) * (0-(6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*5)));
            zz = -5.40222 + (((tickAnim - 16) / 12) * (0-(-5.40222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -34.25 + (((tickAnim - 16) / 12) * (0-(-34.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5 + (((tickAnim - 16) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*5)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.95-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 16) / 12) * (0-(0.675)));
            zz = 0.95 + (((tickAnim - 16) / 12) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftarm2.rotationPointX = this.leftarm2.rotationPointX + (float)(xx);
        this.leftarm2.rotationPointY = this.leftarm2.rotationPointY - (float)(yy);
        this.leftarm2.rotationPointZ = this.leftarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (18.35586-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (-6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (5.40222-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 18.35586 + (((tickAnim - 16) / 12) * (0-(18.35586)));
            yy = -6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5 + (((tickAnim - 16) / 12) * (0-(-6.9058134987+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000))*-5)));
            zz = 5.40222 + (((tickAnim - 16) / 12) * (0-(5.40222)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-34.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -34.25 + (((tickAnim - 16) / 12) * (0-(-34.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-5 + (((tickAnim - 16) / 12) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-5)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0.675-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0.95-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            yy = 0.675 + (((tickAnim - 16) / 12) * (0-(0.675)));
            zz = 0.95 + (((tickAnim - 16) / 12) * (0-(0.95)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(xx);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(yy);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -3.5 + (((tickAnim - 16) / 12) * (0-(-3.5)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-12-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -12 + (((tickAnim - 16) / 12) * (0-(-12)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = -6.75 + (((tickAnim - 16) / 12) * (0-(-6.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 28) {
            xx = 6.75 + (((tickAnim - 16) / 12) * (0-(6.75)));
            yy = 0 + (((tickAnim - 16) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 12) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 0 + (((tickAnim - 16) / 5) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = -6.25 + (((tickAnim - 21) / 7) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(HEADPART12, HEADPART12.rotateAngleX + (float) Math.toRadians(0), HEADPART12.rotateAngleY + (float) Math.toRadians(0), HEADPART12.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 21) {
            xx = 11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1 + (((tickAnim - 16) / 5) * (11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1-(11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1)));
            yy = 0 + (((tickAnim - 16) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 5) * (0-(0)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1 + (((tickAnim - 21) / 7) * (0-(11.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1000-100))*-1)));
            yy = 0 + (((tickAnim - 21) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 21) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animRelax(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 15) / 10) * (5.75-(1)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 25) / 25) * (0-(5.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -3.25 + (((tickAnim - 15) / 10) * (-9.5-(-3.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -9.5 + (((tickAnim - 25) / 25) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(xx), neck2.rotateAngleY + (float) Math.toRadians(yy), neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = -4.25 + (((tickAnim - 15) / 10) * (-11.75-(-4.25)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 25) / 25) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(xx), neck3.rotateAngleY + (float) Math.toRadians(yy), neck3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.375-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0.375 + (((tickAnim - 25) / 25) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck3.rotationPointX = this.neck3.rotationPointX + (float)(xx);
        this.neck3.rotationPointY = this.neck3.rotationPointY - (float)(yy);
        this.neck3.rotationPointZ = this.neck3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 25) {
            xx = 6.75 + (((tickAnim - 15) / 10) * (18.75-(6.75)));
            yy = 0 + (((tickAnim - 15) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 10) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 18.75 + (((tickAnim - 25) / 25) * (0-(18.75)));
            yy = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 25) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(xx), neck4.rotateAngleY + (float) Math.toRadians(yy), neck4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.4-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 25) / 25) * (0-(0)));
            yy = 0.175 + (((tickAnim - 25) / 25) * (0-(0.175)));
            zz = 0.4 + (((tickAnim - 25) / 25) * (0-(0.4)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck4.rotationPointX = this.neck4.rotationPointX + (float)(xx);
        this.neck4.rotationPointY = this.neck4.rotationPointY - (float)(yy);
        this.neck4.rotationPointZ = this.neck4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 0) / 16) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 16) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 25) {
            xx = -6.25 + (((tickAnim - 16) / 9) * (-13.68888-(-6.25)));
            yy = 0 + (((tickAnim - 16) / 9) * (-0.45998-(0)));
            zz = 0 + (((tickAnim - 16) / 9) * (-0.80891-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = -13.68888 + (((tickAnim - 25) / 25) * (0-(-13.68888)));
            yy = -0.45998 + (((tickAnim - 25) / 25) * (0-(-0.45998)));
            zz = -0.80891 + (((tickAnim - 25) / 25) * (0-(-0.80891)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (40.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 32) {
            xx = 40.75 + (((tickAnim - 25) / 7) * (0-(40.75)));
            yy = 0 + (((tickAnim - 25) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 7) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 32) / 11) * (5.75-(0)));
            yy = 0 + (((tickAnim - 32) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 32) / 11) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 5.75 + (((tickAnim - 43) / 7) * (0-(5.75)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 25) / 25) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 25) / 25) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 25) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeright.setScale((float)xx, (float)yy, (float)zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 1 + (((tickAnim - 0) / 25) * (1-(1)));
            yy = 1 + (((tickAnim - 0) / 25) * (0.0225-(1)));
            zz = 1 + (((tickAnim - 0) / 25) * (1-(1)));
        }
        else if (tickAnim >= 25 && tickAnim < 50) {
            xx = 1 + (((tickAnim - 25) / 25) * (1-(1)));
            yy = 0.0225 + (((tickAnim - 25) / 25) * (1-(0.0225)));
            zz = 1 + (((tickAnim - 25) / 25) * (1-(1)));
        }
        else {
            xx = 1;
            yy = 1;
            zz = 1;
        }
        this.eyeleft.setScale((float)xx, (float)yy, (float)zz);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 30;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 17) {
            xx = -28.92545 + (((tickAnim - 0) / 17) * (25.91871-(-28.92545)));
            yy = 2.46649 + (((tickAnim - 0) / 17) * (-8.3864-(2.46649)));
            zz = 3.46213 + (((tickAnim - 0) / 17) * (0.39577-(3.46213)));
        }
        else if (tickAnim >= 17 && tickAnim < 23) {
            xx = 25.91871 + (((tickAnim - 17) / 6) * (0.799-(25.91871)));
            yy = -8.3864 + (((tickAnim - 17) / 6) * (-18.2969+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15-(-8.3864)));
            zz = 0.39577 + (((tickAnim - 17) / 6) * (12.5306+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20-(0.39577)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0.799 + (((tickAnim - 23) / 7) * (-28.92545-(0.799)));
            yy = -18.2969+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15 + (((tickAnim - 23) / 7) * (2.46649-(-18.2969+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*15)));
            zz = 12.5306+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20 + (((tickAnim - 23) / 7) * (3.46213-(12.5306+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100))*-20)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 14.25 + (((tickAnim - 0) / 17) * (0-(14.25)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 17) / 5) * (-44.155-(0)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 27) {
            xx = -44.155 + (((tickAnim - 22) / 5) * (-47.85-(-44.155)));
            yy = 0 + (((tickAnim - 22) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 5) * (0-(0)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = -47.85 + (((tickAnim - 27) / 3) * (14.25-(-47.85)));
            yy = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 0) / 17) * (0-(-0.175)));
            zz = -0.35 + (((tickAnim - 0) / 17) * (0-(-0.35)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 17) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 17) / 13) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 15.6231 + (((tickAnim - 0) / 6) * (-5.27177-(15.6231)));
            yy = 0.51625 + (((tickAnim - 0) / 6) * (0.45475-(0.51625)));
            zz = -8.20533 + (((tickAnim - 0) / 6) * (-5.48123-(-8.20533)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = -5.27177 + (((tickAnim - 6) / 6) * (54.36-(-5.27177)));
            yy = 0.45475 + (((tickAnim - 6) / 6) * (0-(0.45475)));
            zz = -5.48123 + (((tickAnim - 6) / 6) * (0-(-5.48123)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 54.36 + (((tickAnim - 12) / 5) * (48.25-(54.36)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 48.25 + (((tickAnim - 17) / 2) * (80.68579-(48.25)));
            yy = 0 + (((tickAnim - 17) / 2) * (-0.20778-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0.43059-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 27) {
            xx = 80.68579 + (((tickAnim - 19) / 8) * (85.59791-(80.68579)));
            yy = -0.20778 + (((tickAnim - 19) / 8) * (-0.76188-(-0.20778)));
            zz = 0.43059 + (((tickAnim - 19) / 8) * (1.57883-(0.43059)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 85.59791 + (((tickAnim - 27) / 3) * (15.6231-(85.59791)));
            yy = -0.76188 + (((tickAnim - 27) / 3) * (0.51625-(-0.76188)));
            zz = 1.57883 + (((tickAnim - 27) / 3) * (-8.20533-(1.57883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.25 + (((tickAnim - 0) / 3) * (0.875-(0.25)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            yy = 0.875 + (((tickAnim - 3) / 3) * (-0.1-(0.875)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = -0.1 + (((tickAnim - 6) / 2) * (0.9-(-0.1)));
            zz = 0 + (((tickAnim - 6) / 2) * (-0.12-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.9 + (((tickAnim - 8) / 4) * (2.295-(0.9)));
            zz = -0.12 + (((tickAnim - 8) / 4) * (-0.25-(-0.12)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            yy = 2.295 + (((tickAnim - 12) / 5) * (3.45-(2.295)));
            zz = -0.25 + (((tickAnim - 12) / 5) * (-0.45-(-0.25)));
        }
        else if (tickAnim >= 17 && tickAnim < 27) {
            xx = 0 + (((tickAnim - 17) / 10) * (0-(0)));
            yy = 3.45 + (((tickAnim - 17) / 10) * (1.895-(3.45)));
            zz = -0.45 + (((tickAnim - 17) / 10) * (-1.115-(-0.45)));
        }
        else if (tickAnim >= 27 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 27) / 3) * (0-(0)));
            yy = 1.895 + (((tickAnim - 27) / 3) * (0.25-(1.895)));
            zz = -1.115 + (((tickAnim - 27) / 3) * (0-(-1.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-20))*1), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*0.2), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-5));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*1);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*0.5);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-50))*2), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240))*2), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-100))*3), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*4), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-150))*4), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-100))*6), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-200))*5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-150))*8), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-250))*6), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-200))*10), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-120))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-90))*1.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-50))*-0.2), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-140))*-1.5), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-160))*5));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-180))*4), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240-220))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-230))*4), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-350))*4), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 22) {
            xx = 11.75 + (((tickAnim - 17) / 5) * (-6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50-(11.75)));
            yy = 0 + (((tickAnim - 17) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 5) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50 + (((tickAnim - 22) / 8) * (0-(-6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50)));
            yy = 0 + (((tickAnim - 22) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 22) / 8) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 6) / 6) * (-74.55-(0)));
            yy = 0 + (((tickAnim - 6) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 6) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 17) {
            xx = -74.55 + (((tickAnim - 12) / 5) * (29.25-(-74.55)));
            yy = 0 + (((tickAnim - 12) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 5) * (0-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 19) {
            xx = 29.25 + (((tickAnim - 17) / 2) * (19.65-(29.25)));
            yy = 0 + (((tickAnim - 17) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 17) / 2) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = 19.65 + (((tickAnim - 19) / 11) * (0-(19.65)));
            yy = 0 + (((tickAnim - 19) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 17) {
            xx = 0 + (((tickAnim - 0) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 17) * (-0.05-(0)));
            zz = 0 + (((tickAnim - 0) / 17) * (-0.475-(0)));
        }
        else if (tickAnim >= 17 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 17) / 13) * (0-(0)));
            yy = -0.05 + (((tickAnim - 17) / 13) * (0-(-0.05)));
            zz = -0.475 + (((tickAnim - 17) / 13) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4 + (((tickAnim - 0) / 19) * (-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4-(-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4)));
            yy = 4.70841 + (((tickAnim - 0) / 19) * (9.15708-(4.70841)));
            zz = -7.32199 + (((tickAnim - 0) / 19) * (-17.36315-(-7.32199)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4 + (((tickAnim - 19) / 11) * (-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4-(-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4)));
            yy = 9.15708 + (((tickAnim - 19) / 11) * (4.70841-(9.15708)));
            zz = -17.36315 + (((tickAnim - 19) / 11) * (-7.32199-(-17.36315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 19) {
            xx = -2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4 + (((tickAnim - 0) / 19) * (-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4-(-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4)));
            yy = -4.70841 + (((tickAnim - 0) / 19) * (-9.15708-(-4.70841)));
            zz = 7.32199 + (((tickAnim - 0) / 19) * (17.36315-(7.32199)));
        }
        else if (tickAnim >= 19 && tickAnim < 30) {
            xx = -7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4 + (((tickAnim - 19) / 11) * (-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4-(-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*240/0.5-160))*4)));
            yy = -9.15708 + (((tickAnim - 19) / 11) * (-4.70841-(-9.15708)));
            zz = 17.36315 + (((tickAnim - 19) / 11) * (7.32199-(17.36315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*240/0.5-280))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 25.91871 + (((tickAnim - 0) / 6) * (0.52593-(25.91871)));
            yy = 8.3864 + (((tickAnim - 0) / 6) * (0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15-(8.3864)));
            zz = -0.39577 + (((tickAnim - 0) / 6) * (4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5-(-0.39577)));
        }
        else if (tickAnim >= 6 && tickAnim < 13) {
            xx = 0.52593 + (((tickAnim - 6) / 7) * (-28.92545-(0.52593)));
            yy = 0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15 + (((tickAnim - 6) / 7) * (-2.46649-(0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15)));
            zz = 4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5 + (((tickAnim - 6) / 7) * (-3.46213-(4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = -28.92545 + (((tickAnim - 13) / 17) * (25.91871-(-28.92545)));
            yy = -2.46649 + (((tickAnim - 13) / 17) * (8.3864-(-2.46649)));
            zz = -3.46213 + (((tickAnim - 13) / 17) * (-0.39577-(-3.46213)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 11.75 + (((tickAnim - 0) / 5) * (29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50-(11.75)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 13) {
            xx = 29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50 + (((tickAnim - 5) / 8) * (0-(29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50)));
            yy = 0 + (((tickAnim - 5) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 8) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (11.75-(0)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-44.155-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -44.155 + (((tickAnim - 5) / 5) * (-47.85-(-44.155)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -47.85 + (((tickAnim - 10) / 3) * (14.25-(-47.85)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 14.25 + (((tickAnim - 13) / 17) * (0-(14.25)));
            yy = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 17) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 0) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 13) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 13) * (-0.35-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 13) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 13) / 17) * (0-(-0.175)));
            zz = -0.35 + (((tickAnim - 13) / 17) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 48.25 + (((tickAnim - 0) / 3) * (80.68579-(48.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.20778-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0.43059-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 80.68579 + (((tickAnim - 3) / 7) * (85.59791-(80.68579)));
            yy = -0.20778 + (((tickAnim - 3) / 7) * (-0.76188-(-0.20778)));
            zz = 0.43059 + (((tickAnim - 3) / 7) * (1.57883-(0.43059)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 85.59791 + (((tickAnim - 10) / 3) * (17.37655-(85.59791)));
            yy = -0.76188 + (((tickAnim - 10) / 3) * (0.14385-(-0.76188)));
            zz = 1.57883 + (((tickAnim - 10) / 3) * (7.14383-(1.57883)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 17.37655 + (((tickAnim - 13) / 6) * (-5.2904-(17.37655)));
            yy = 0.14385 + (((tickAnim - 13) / 6) * (-0.78776-(0.14385)));
            zz = 7.14383 + (((tickAnim - 13) / 6) * (7.19935-(7.14383)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = -5.2904 + (((tickAnim - 19) / 6) * (54.36-(-5.2904)));
            yy = -0.78776 + (((tickAnim - 19) / 6) * (0-(-0.78776)));
            zz = 7.19935 + (((tickAnim - 19) / 6) * (0-(7.19935)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 54.36 + (((tickAnim - 25) / 5) * (48.25-(54.36)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 3.45 + (((tickAnim - 0) / 10) * (1.895-(3.45)));
            zz = -0.45 + (((tickAnim - 0) / 10) * (-1.115-(-0.45)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            yy = 1.895 + (((tickAnim - 10) / 3) * (-0.05-(1.895)));
            zz = -1.115 + (((tickAnim - 10) / 3) * (0-(-1.115)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            yy = -0.05 + (((tickAnim - 13) / 3) * (1.25-(-0.05)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 16) / 3) * (0-(0)));
            yy = 1.25 + (((tickAnim - 16) / 3) * (0.35-(1.25)));
            zz = 0 + (((tickAnim - 16) / 3) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 19) / 3) * (0-(0)));
            yy = 0.35 + (((tickAnim - 19) / 3) * (0.9-(0.35)));
            zz = 0 + (((tickAnim - 19) / 3) * (-0.12-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 22) / 3) * (0-(0)));
            yy = 0.9 + (((tickAnim - 22) / 3) * (1.75-(0.9)));
            zz = -0.12 + (((tickAnim - 22) / 3) * (0-(-0.12)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            yy = 1.75 + (((tickAnim - 25) / 5) * (3.45-(1.75)));
            zz = 0 + (((tickAnim - 25) / 5) * (-0.45-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 29.25 + (((tickAnim - 0) / 3) * (19.65-(29.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 13) {
            xx = 19.65 + (((tickAnim - 3) / 10) * (0-(19.65)));
            yy = 0 + (((tickAnim - 3) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 10) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 19) {
            xx = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 13) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 6) * (0-(0)));
        }
        else if (tickAnim >= 19 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 19) / 6) * (-74.55-(0)));
            yy = 0 + (((tickAnim - 19) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 19) / 6) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -74.55 + (((tickAnim - 25) / 5) * (29.25-(-74.55)));
            yy = 0 + (((tickAnim - 25) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 0) / 30) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 30) * (-0.05-(-0.05)));
            zz = -0.475 + (((tickAnim - 0) / 30) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraConcavenator entity = (EntityPrehistoricFloraConcavenator) entitylivingbaseIn;
        int animCycle = 17;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -31.92545 + (((tickAnim - 0) / 10) * (41.66871-(-31.92545)));
            yy = -2.46649 + (((tickAnim - 0) / 10) * (-8.3864-(-2.46649)));
            zz = -3.46213 + (((tickAnim - 0) / 10) * (0.39577-(-3.46213)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 41.66871 + (((tickAnim - 10) / 3) * (0.52593-(41.66871)));
            yy = -8.3864 + (((tickAnim - 10) / 3) * (-0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15-(-8.3864)));
            zz = 0.39577 + (((tickAnim - 10) / 3) * (-4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5-(0.39577)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 0.52593 + (((tickAnim - 13) / 3) * (-31.1949-(0.52593)));
            yy = -0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15 + (((tickAnim - 13) / 3) * (-0.77053-(-0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15)));
            zz = -4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5 + (((tickAnim - 13) / 3) * (0.22383-(-4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -31.1949 + (((tickAnim - 16) / 2) * (-31.92545-(-31.1949)));
            yy = -0.77053 + (((tickAnim - 16) / 2) * (-2.46649-(-0.77053)));
            zz = 0.22383 + (((tickAnim - 16) / 2) * (-3.46213-(0.22383)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 9.25 + (((tickAnim - 0) / 10) * (0-(9.25)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 10) / 3) * (-44.155-(0)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = -44.155 + (((tickAnim - 13) / 3) * (-47.85-(-44.155)));
            yy = 0 + (((tickAnim - 13) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 3) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = -47.85 + (((tickAnim - 16) / 2) * (9.25-(-47.85)));
            yy = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.775 + (((tickAnim - 0) / 3) * (0.12-(0.775)));
            zz = -0.35 + (((tickAnim - 0) / 3) * (-0.23-(-0.35)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 3) / 7) * (0-(0)));
            yy = 0.12 + (((tickAnim - 3) / 7) * (0-(0.12)));
            zz = -0.23 + (((tickAnim - 3) / 7) * (0-(-0.23)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 8) * (0.775-(0)));
            zz = 0 + (((tickAnim - 10) / 8) * (-0.35-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 54.53125 + (((tickAnim - 0) / 2) * (23.81078-(54.53125)));
            yy = -1.63259 + (((tickAnim - 0) / 2) * (4.55816-(-1.63259)));
            zz = 3.38322 + (((tickAnim - 0) / 2) * (-3.46133-(3.38322)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 23.81078 + (((tickAnim - 2) / 1) * (6.03575-(23.81078)));
            yy = 4.55816 + (((tickAnim - 2) / 1) * (5.44519-(4.55816)));
            zz = -3.46133 + (((tickAnim - 2) / 1) * (-2.41095-(-3.46133)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 6.03575 + (((tickAnim - 3) / 4) * (54.36-(6.03575)));
            yy = 5.44519 + (((tickAnim - 3) / 4) * (0-(5.44519)));
            zz = -2.41095 + (((tickAnim - 3) / 4) * (0-(-2.41095)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 54.36 + (((tickAnim - 7) / 3) * (48.25-(54.36)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 48.25 + (((tickAnim - 10) / 2) * (80.68579-(48.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (-0.20778-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0.43059-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 16) {
            xx = 80.68579 + (((tickAnim - 12) / 4) * (85.59791-(80.68579)));
            yy = -0.20778 + (((tickAnim - 12) / 4) * (-0.76188-(-0.20778)));
            zz = 0.43059 + (((tickAnim - 12) / 4) * (1.57883-(0.43059)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 85.59791 + (((tickAnim - 16) / 2) * (54.53125-(85.59791)));
            yy = -0.76188 + (((tickAnim - 16) / 2) * (-1.63259-(-0.76188)));
            zz = 1.57883 + (((tickAnim - 16) / 2) * (3.38322-(1.57883)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftfoot, leftfoot.rotateAngleX + (float) Math.toRadians(xx), leftfoot.rotateAngleY + (float) Math.toRadians(yy), leftfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 1.275 + (((tickAnim - 0) / 2) * (0.425-(1.275)));
            zz = -0.675 + (((tickAnim - 0) / 2) * (0-(-0.675)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 0.425 + (((tickAnim - 2) / 1) * (-0.775-(0.425)));
            zz = 0 + (((tickAnim - 2) / 1) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = -0.775 + (((tickAnim - 3) / 2) * (0.1-(-0.775)));
            zz = 0 + (((tickAnim - 3) / 2) * (-0.12-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.1 + (((tickAnim - 5) / 2) * (1.845-(0.1)));
            zz = -0.12 + (((tickAnim - 5) / 2) * (-0.25-(-0.12)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            yy = 1.845 + (((tickAnim - 7) / 1) * (3.06-(1.845)));
            zz = -0.25 + (((tickAnim - 7) / 1) * (-0.3-(-0.25)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 3.06 + (((tickAnim - 8) / 0) * (3.91-(3.06)));
            zz = -0.3 + (((tickAnim - 8) / 0) * (-0.35-(-0.3)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 8) / 2) * (0-(0)));
            yy = 3.91 + (((tickAnim - 8) / 2) * (2.9-(3.91)));
            zz = -0.35 + (((tickAnim - 8) / 2) * (-0.45-(-0.35)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = 0 + (((tickAnim - 10) / 6) * (0-(0)));
            yy = 2.9 + (((tickAnim - 10) / 6) * (1.895-(2.9)));
            zz = -0.45 + (((tickAnim - 10) / 6) * (-1.115-(-0.45)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 16) / 2) * (0-(0)));
            yy = 1.895 + (((tickAnim - 16) / 2) * (1.275-(1.895)));
            zz = -1.115 + (((tickAnim - 16) / 2) * (-0.675-(-1.115)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftfoot.rotationPointX = this.leftfoot.rotationPointX + (float)(xx);
        this.leftfoot.rotationPointY = this.leftfoot.rotationPointY - (float)(yy);
        this.leftfoot.rotationPointZ = this.leftfoot.rotationPointZ + (float)(zz);



        this.setRotateAngle(hips, hips.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-50))*4), hips.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-50))*0.5), hips.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-6));
        this.hips.rotationPointX = this.hips.rotationPointX + (float)(0);
        this.hips.rotationPointY = this.hips.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-90))*2.5);
        this.hips.rotationPointZ = this.hips.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-150))*2);


        this.setRotateAngle(tail, tail.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-100))*-5), tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412))*4), tail.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-3));


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-100))*8), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-50))*8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-2));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-150))*12), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-100))*12), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-2));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-200))*16), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-150))*16), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-2));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-250))*20), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-200))*20), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-120))*-1));


        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410/0.5-90))*2.5), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*410-50))*-0.5), body.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(chest, chest.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-140))*-4), chest.rotateAngleY + (float) Math.toRadians(0), chest.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-160))*8));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(14.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-180))*8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412-220))*-2));


        this.setRotateAngle(neck2, neck2.rotateAngleX + (float) Math.toRadians(-3+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-230))*8), neck2.rotateAngleY + (float) Math.toRadians(0), neck2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck3, neck3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-280))*-4), neck3.rotateAngleY + (float) Math.toRadians(0), neck3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(neck4, neck4.rotateAngleX + (float) Math.toRadians(-5.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-350))*8), neck4.rotateAngleY + (float) Math.toRadians(0), neck4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(0), head.rotateAngleY + (float) Math.toRadians(0), head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -16.75 + (((tickAnim - 0) / 10) * (11.75-(-16.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 11.75 + (((tickAnim - 10) / 3) * (-6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50-(11.75)));
            yy = 0 + (((tickAnim - 10) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 3) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50 + (((tickAnim - 13) / 5) * (-16.75-(-6.905+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*50)));
            yy = 0 + (((tickAnim - 13) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (-74.55-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -74.55 + (((tickAnim - 7) / 3) * (29.25-(-74.55)));
            yy = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 3) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 29.25 + (((tickAnim - 10) / 2) * (19.65-(29.25)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 19.65 + (((tickAnim - 12) / 6) * (0-(19.65)));
            yy = 0 + (((tickAnim - 12) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(lefttoes, lefttoes.rotateAngleX + (float) Math.toRadians(xx), lefttoes.rotateAngleY + (float) Math.toRadians(yy), lefttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (-0.43-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0.055-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 7) / 3) * (0-(0)));
            yy = -0.43 + (((tickAnim - 7) / 3) * (-0.05-(-0.43)));
            zz = 0.055 + (((tickAnim - 7) / 3) * (-0.475-(0.055)));
        }
        else if (tickAnim >= 10 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 10) / 8) * (0-(0)));
            yy = -0.05 + (((tickAnim - 10) / 8) * (0-(-0.05)));
            zz = -0.475 + (((tickAnim - 10) / 8) * (0-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.lefttoes.rotationPointX = this.lefttoes.rotationPointX + (float)(xx);
        this.lefttoes.rotationPointY = this.lefttoes.rotationPointY - (float)(yy);
        this.lefttoes.rotationPointZ = this.lefttoes.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4 + (((tickAnim - 0) / 12) * (-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4-(-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4)));
            yy = 4.70841 + (((tickAnim - 0) / 12) * (9.15708-(4.70841)));
            zz = -7.32199 + (((tickAnim - 0) / 12) * (-17.36315-(-7.32199)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = -7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4 + (((tickAnim - 12) / 6) * (-2.7752+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4-(-7.3157+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4)));
            yy = 9.15708 + (((tickAnim - 12) / 6) * (4.70841-(9.15708)));
            zz = -17.36315 + (((tickAnim - 12) / 6) * (-7.32199-(-17.36315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-280))*5), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 8.7586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4 + (((tickAnim - 0) / 12) * (12.1843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4-(8.7586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4)));
            yy = -7.30288 + (((tickAnim - 0) / 12) * (-9.15708-(-7.30288)));
            zz = 12.39579 + (((tickAnim - 0) / 12) * (17.36315-(12.39579)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 12.1843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4 + (((tickAnim - 12) / 6) * (8.7586+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4-(12.1843+Math.sin((Math.PI/180)*(((double)tickAnim/20)*412/0.5-160))*4)));
            yy = -9.15708 + (((tickAnim - 12) / 6) * (-7.30288-(-9.15708)));
            zz = 17.36315 + (((tickAnim - 12) / 6) * (12.39579-(17.36315)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(-28.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*412/0.5-280))*5), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));
        this.rightarm2.rotationPointX = this.rightarm2.rotationPointX + (float)(0);
        this.rightarm2.rotationPointY = this.rightarm2.rotationPointY - (float)(0.275);
        this.rightarm2.rotationPointZ = this.rightarm2.rotationPointZ + (float)(0.7);



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 41.66871 + (((tickAnim - 0) / 3) * (0.52593-(41.66871)));
            yy = 8.3864 + (((tickAnim - 0) / 3) * (0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15-(8.3864)));
            zz = -0.39577 + (((tickAnim - 0) / 3) * (4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5-(-0.39577)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = 0.52593 + (((tickAnim - 3) / 3) * (-31.1949-(0.52593)));
            yy = 0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15 + (((tickAnim - 3) / 3) * (0.77053-(0.2913+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-50))*-15)));
            zz = 4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5 + (((tickAnim - 3) / 3) * (-0.22383-(4.5609+Math.sin((Math.PI/180)*(((double)tickAnim/20)*100-30))*-5)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -31.1949 + (((tickAnim - 6) / 2) * (-31.92545-(-31.1949)));
            yy = 0.77053 + (((tickAnim - 6) / 2) * (-2.46649-(0.77053)));
            zz = -0.22383 + (((tickAnim - 6) / 2) * (-3.46213-(-0.22383)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -31.92545 + (((tickAnim - 8) / 10) * (41.66871-(-31.92545)));
            yy = -2.46649 + (((tickAnim - 8) / 10) * (8.3864-(-2.46649)));
            zz = -3.46213 + (((tickAnim - 8) / 10) * (-0.39577-(-3.46213)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 18 + (((tickAnim - 0) / 3) * (29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50-(18)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50 + (((tickAnim - 3) / 5) * (-16.75-(29.595+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-30))*-50)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -16.75 + (((tickAnim - 8) / 10) * (18-(-16.75)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (-44.155-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 6) {
            xx = -44.155 + (((tickAnim - 3) / 3) * (-47.85-(-44.155)));
            yy = 0 + (((tickAnim - 3) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 3) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = -47.85 + (((tickAnim - 6) / 2) * (14.25-(-47.85)));
            yy = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 2) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 14.25 + (((tickAnim - 8) / 10) * (0-(14.25)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = -0.175 + (((tickAnim - 8) / 10) * (0-(-0.175)));
            zz = -0.35 + (((tickAnim - 8) / 10) * (0-(-0.35)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 48.25 + (((tickAnim - 0) / 2) * (80.68579-(48.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (-0.20778-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0.43059-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 6) {
            xx = 80.68579 + (((tickAnim - 2) / 4) * (85.59791-(80.68579)));
            yy = -0.20778 + (((tickAnim - 2) / 4) * (-0.76188-(-0.20778)));
            zz = 0.43059 + (((tickAnim - 2) / 4) * (1.57883-(0.43059)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 85.59791 + (((tickAnim - 6) / 2) * (54.53125-(85.59791)));
            yy = -0.76188 + (((tickAnim - 6) / 2) * (-1.63259-(-0.76188)));
            zz = 1.57883 + (((tickAnim - 6) / 2) * (3.38322-(1.57883)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 54.53125 + (((tickAnim - 8) / 1) * (22.71767-(54.53125)));
            yy = -1.63259 + (((tickAnim - 8) / 1) * (-3.22514-(-1.63259)));
            zz = 3.38322 + (((tickAnim - 8) / 1) * (7.94068-(3.38322)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 22.71767 + (((tickAnim - 9) / 3) * (14.72823-(22.71767)));
            yy = -3.22514 + (((tickAnim - 9) / 3) * (-0.45475-(-3.22514)));
            zz = 7.94068 + (((tickAnim - 9) / 3) * (5.48123-(7.94068)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 14.72823 + (((tickAnim - 12) / 3) * (54.36-(14.72823)));
            yy = -0.45475 + (((tickAnim - 12) / 3) * (0-(-0.45475)));
            zz = 5.48123 + (((tickAnim - 12) / 3) * (0-(5.48123)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 54.36 + (((tickAnim - 15) / 3) * (48.25-(54.36)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightfoot, rightfoot.rotateAngleX + (float) Math.toRadians(xx), rightfoot.rotateAngleY + (float) Math.toRadians(yy), rightfoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 1.45 + (((tickAnim - 0) / 6) * (1.895-(1.45)));
            zz = -0.45 + (((tickAnim - 0) / 6) * (-1.115-(-0.45)));
        }
        else if (tickAnim >= 6 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 6) / 2) * (0-(0)));
            yy = 1.895 + (((tickAnim - 6) / 2) * (1.275-(1.895)));
            zz = -1.115 + (((tickAnim - 6) / 2) * (-0.675-(-1.115)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.275 + (((tickAnim - 8) / 1) * (2.475-(1.275)));
            zz = -0.675 + (((tickAnim - 8) / 1) * (0-(-0.675)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 2.475 + (((tickAnim - 9) / 1) * (3.04-(2.475)));
            zz = 0 + (((tickAnim - 9) / 1) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 3.04 + (((tickAnim - 10) / 2) * (0.95-(3.04)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 12) / 1) * (0-(0)));
            yy = 0.95 + (((tickAnim - 12) / 1) * (1.025-(0.95)));
            zz = 0 + (((tickAnim - 12) / 1) * (-0.12-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 13) / 2) * (0-(0)));
            yy = 1.025 + (((tickAnim - 13) / 2) * (3.345-(1.025)));
            zz = -0.12 + (((tickAnim - 13) / 2) * (-0.25-(-0.12)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 3.345 + (((tickAnim - 15) / 3) * (1.45-(3.345)));
            zz = -0.25 + (((tickAnim - 15) / 3) * (-0.45-(-0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightfoot.rotationPointX = this.rightfoot.rotationPointX + (float)(xx);
        this.rightfoot.rotationPointY = this.rightfoot.rotationPointY - (float)(yy);
        this.rightfoot.rotationPointZ = this.rightfoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 29.25 + (((tickAnim - 0) / 2) * (19.65-(29.25)));
            yy = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (0-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 8) {
            xx = 19.65 + (((tickAnim - 2) / 6) * (0-(19.65)));
            yy = 0 + (((tickAnim - 2) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 2) / 6) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 9) / 3) * (-23-(0)));
            yy = 0 + (((tickAnim - 9) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 9) / 3) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -23 + (((tickAnim - 12) / 3) * (0-(-23)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (29.25-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(righttoes, righttoes.rotateAngleX + (float) Math.toRadians(xx), righttoes.rotateAngleY + (float) Math.toRadians(yy), righttoes.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = -0.05 + (((tickAnim - 0) / 18) * (-0.05-(-0.05)));
            zz = -0.475 + (((tickAnim - 0) / 18) * (-0.475-(-0.475)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.righttoes.rotationPointX = this.righttoes.rotationPointX + (float)(xx);
        this.righttoes.rotationPointY = this.righttoes.rotationPointY - (float)(yy);
        this.righttoes.rotationPointZ = this.righttoes.rotationPointZ + (float)(zz);

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraConcavenator e = (EntityPrehistoricFloraConcavenator) entity;
        animator.update(entity);

    }
}
