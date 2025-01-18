package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraPsittacosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPsittacosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer quill;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer quill2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer rightleg4;
    private final AdvancedModelRenderer upperbody2;
    private final AdvancedModelRenderer upperbody;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer leftside;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer rightside;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;
    private final AdvancedModelRenderer cube_r33;
    private final AdvancedModelRenderer cube_r34;
    private final AdvancedModelRenderer cube_r35;
    private final AdvancedModelRenderer leftarm;
    private final AdvancedModelRenderer leftarm2;
    private final AdvancedModelRenderer leftarm3;
    private final AdvancedModelRenderer rightarm;
    private final AdvancedModelRenderer rightarm2;
    private final AdvancedModelRenderer rightarm3;

    private ModelAnimator animator;

    public ModelPsittacosaurus() {
        this.textureWidth = 75;
        this.textureHeight = 75;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.2055F, 11.2659F, 1.6424F);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.5F, -4.1996F, 3.6298F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 11, -3.5F, 0.0F, -6.75F, 6, 9, 7, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -4.0364F, 3.0028F);
        this.body.addChild(tail2);
        this.setRotateAngle(tail2, -0.1745F, 0.0F, 0.0F);
        this.tail2.cubeList.add(new ModelBox(tail2, 0, 35, -2.0F, -0.0872F, -0.5038F, 4, 6, 6, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0311F, 5.088F);
        this.tail2.addChild(tail3);
        this.setRotateAngle(tail3, -0.1309F, 0.0F, 0.0F);
        this.tail3.cubeList.add(new ModelBox(tail3, 31, 0, -1.5F, 0.0F, 0.0F, 3, 4, 6, -0.001F, false));

        this.quill = new AdvancedModelRenderer(this);
        this.quill.setRotationPoint(0.0F, -0.0217F, 3.0458F);
        this.tail3.addChild(quill);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.5F, 0.0F, -3.0F);
        this.quill.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3927F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 46, 43, -0.5F, -9.9783F, -0.0458F, 0, 10, 6, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.1F, 0.0F, -3.0F);
        this.quill.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 43, -0.5F, -9.9783F, -0.0458F, 0, 10, 6, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 46, 43, 0.3F, -9.9783F, -0.0458F, 0, 10, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.5F, 0.0F, -3.0F);
        this.quill.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 42, -0.5F, -7.9783F, -0.0458F, 2, 8, 6, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.tail3.addChild(tail4);
        this.setRotateAngle(tail4, 0.1309F, 0.0F, 0.0F);
        this.tail4.cubeList.add(new ModelBox(tail4, 47, 6, -1.0F, 0.1305F, -0.0086F, 2, 3, 5, 0.0F, false));

        this.quill2 = new AdvancedModelRenderer(this);
        this.quill2.setRotationPoint(0.0F, 0.1305F, -0.0086F);
        this.tail4.addChild(quill2);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.9F, -0.0217F, 0.0458F);
        this.quill2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 33, 0.975F, -6.9783F, -0.0458F, 0, 7, 8, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 35, 33, 0.775F, -6.9783F, -0.0458F, 0, 7, 8, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.0217F, 0.0458F);
        this.quill2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 48, 0.0F, -6.9783F, -0.0458F, 1, 7, 5, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, 0.4791F, 4.1998F);
        this.tail4.addChild(tail5);
        this.setRotateAngle(tail5, 0.1309F, 0.0F, 0.0F);
        this.tail5.cubeList.add(new ModelBox(tail5, 37, 55, -0.5F, 0.0F, 0.0F, 1, 2, 5, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.1767F, 4.3308F);
        this.tail5.addChild(tail6);
        this.setRotateAngle(tail6, 0.2618F, 0.0F, 0.0F);
        this.tail6.cubeList.add(new ModelBox(tail6, 54, 55, -0.5F, 0.0F, 0.0F, 1, 1, 5, -0.002F, false));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(3.25F, -2.3997F, -2.3234F);
        this.body.addChild(leftleg);
        this.setRotateAngle(leftleg, -0.48F, 0.0F, 0.0F);
        this.leftleg.cubeList.add(new ModelBox(leftleg, 44, 28, -1.0F, -0.4435F, -2.2309F, 3, 7, 5, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.5F, 6.3506F, -2.0704F);
        this.leftleg.addChild(leftleg2);
        this.setRotateAngle(leftleg2, 1.0472F, 0.0F, 0.0F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 54, 15, -1.0F, 0.0565F, 0.0191F, 2, 8, 3, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.0F, 7.5543F, 1.6329F);
        this.leftleg2.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.6109F, 0.0F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 19, 58, -1.0F, -0.3685F, -1.0059F, 2, 5, 2, 0.01F, false));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0F, 3.9767F, -0.5285F);
        this.leftleg3.addChild(leftleg4);
        this.setRotateAngle(leftleg4, 0.0436F, 0.0F, 0.0F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, 53, 41, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-3.25F, -2.3997F, -2.3234F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, -0.48F, 0.0F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 44, 28, -2.0F, -0.4435F, -2.2309F, 3, 7, 5, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.5F, 6.3506F, -2.0704F);
        this.rightleg.addChild(rightleg2);
        this.setRotateAngle(rightleg2, 1.0472F, 0.0F, 0.0F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 54, 15, -1.0F, 0.0565F, 0.0191F, 2, 8, 3, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(0.0F, 7.5543F, 1.6329F);
        this.rightleg2.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.6109F, 0.0F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 19, 58, -1.0F, -0.3685F, -1.0059F, 2, 5, 2, 0.01F, true));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(0.0F, 3.9767F, -0.5285F);
        this.rightleg3.addChild(rightleg4);
        this.setRotateAngle(rightleg4, 0.0436F, 0.0F, 0.0F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, 53, 41, -1.5F, 0.0F, -3.0F, 3, 1, 4, 0.0F, true));

        this.upperbody2 = new AdvancedModelRenderer(this);
        this.upperbody2.setRotationPoint(0.0F, -4.8962F, 0.5796F);
        this.body.addChild(upperbody2);
        this.upperbody2.cubeList.add(new ModelBox(upperbody2, 0, 0, -4.0F, 0.0973F, -10.1287F, 8, 10, 7, 0.0F, false));

        this.upperbody = new AdvancedModelRenderer(this);
        this.upperbody.setRotationPoint(0.0F, 0.3753F, -10.0319F);
        this.upperbody2.addChild(upperbody);
        this.setRotateAngle(upperbody, -0.1309F, 0.0F, 0.0F);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -0.191F, 0.0724F);
        this.upperbody.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 18, -4.0F, -0.066F, -7.046F, 6, 9, 7, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(0.0F, 2.1006F, -3.3364F);
        this.upperbody.addChild(neck);
        this.setRotateAngle(neck, -0.3054F, 0.0F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 20, 28, -2.0F, 0.0F, -7.0F, 4, 5, 7, -0.01F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.neck.addChild(head);
        this.setRotateAngle(head, 0.5236F, 0.0F, 0.0F);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.0F, 2.5091F, 1.6288F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 1.5446F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 59, 4, -3.0F, -5.0F, 0.0F, 4, 3, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.5F, 2.5091F, -0.3712F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.5446F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 28, 61, -2.0F, -5.0F, 0.0F, 3, 2, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, 2.4341F, -0.3712F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.0218F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 18, -0.15F, -0.5F, -5.0F, 0, 1, 3, 0.0F, true));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 18, 1.15F, -0.5F, -5.0F, 0, 1, 3, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.5F, 1.4513F, -7.6238F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 2.8798F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 47, 15, -2.0F, -1.0F, -1.0F, 3, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 1.4513F, -7.3238F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 1.6144F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 41, -2.0F, -0.275F, -1.0F, 3, 3, 1, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 1.4763F, -7.3488F);
        this.head.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 1.1781F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 37, 49, -1.0F, -0.25F, -0.175F, 2, 2, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -0.8236F, -4.9213F);
        this.head.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 62, -1.0F, 0.0F, -2.0F, 2, 2, 2, 0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.2F, 0.0542F, -3.4924F);
        this.head.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0983F, -0.478F, 0.0453F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 35, -0.95F, -0.5F, -0.05F, 1, 1, 1, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(1.2F, 0.0542F, -3.4924F);
        this.head.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0983F, 0.478F, -0.0453F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 35, -0.05F, -0.5F, -0.05F, 1, 1, 1, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.5F, -0.6493F, -2.9289F);
        this.head.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.0873F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 61, 33, -2.0F, 0.0F, -2.0F, 3, 2, 2, -0.001F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.head.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2182F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 44, 0, -3.0F, 0.0F, -3.0F, 5, 2, 3, 0.0F, false));

        this.leftside = new AdvancedModelRenderer(this);
        this.leftside.setRotationPoint(1.067F, 2.4501F, -2.1468F);
        this.head.addChild(leftside);
        this.setRotateAngle(leftside, 0.0F, 0.0F, 0.1745F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(2.518F, -0.0638F, 0.1246F);
        this.leftside.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -1.3228F, -0.9836F, 2.863F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 36, 28, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(2.3269F, -0.9248F, -0.2808F);
        this.leftside.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 1.5429F, 0.3489F, 0.165F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 59, 52, -1.0965F, -0.0875F, -0.5F, 3, 1, 1, 0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.3269F, -0.9248F, -0.2808F);
        this.leftside.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 1.5413F, -0.4798F, 0.1882F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 57, -1.5767F, -0.4812F, -0.5F, 2, 1, 1, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.083F, -1.1465F, -3.0215F);
        this.leftside.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 1.5278F, -0.9159F, 0.0341F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 59, 47, 0.0F, 0.0F, -1.0F, 4, 2, 2, -0.001F, false));

        this.rightside = new AdvancedModelRenderer(this);
        this.rightside.setRotationPoint(-1.067F, 2.4501F, -2.1468F);
        this.head.addChild(rightside);
        this.setRotateAngle(rightside, 0.0F, 0.0F, -0.1745F);


        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-2.518F, -0.0638F, 0.1246F);
        this.rightside.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -1.3228F, 0.9836F, -2.863F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 36, 28, -4.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(-2.3269F, -0.9248F, -0.2808F);
        this.rightside.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 1.5429F, -0.3489F, -0.165F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 59, 52, -1.9035F, -0.0875F, -0.5F, 3, 1, 1, 0.001F, true));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-2.3269F, -0.9248F, -0.2808F);
        this.rightside.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 1.5413F, 0.4798F, -0.1882F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 14, 57, -0.4233F, -0.4812F, -0.5F, 2, 1, 1, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-0.083F, -1.1465F, -3.0215F);
        this.rightside.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 1.5278F, 0.9159F, -0.0341F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 59, 47, -4.0F, 0.0F, -1.0F, 4, 2, 2, -0.001F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, 2.5352F, -0.3677F);
        this.head.addChild(jaw);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.5F, 0.796F, -6.7737F);
        this.jaw.addChild(cube_r27);
        this.setRotateAngle(cube_r27, -0.4974F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 55, 62, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.051F, 0.2465F);
        this.jaw.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0218F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 62, 14, -1.0F, -0.025F, -7.0F, 2, 1, 2, 0.0F, false));

        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(-0.75F, -0.101F, -0.0035F);
        this.jaw.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0218F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 48, 0.0F, -0.5F, -5.0F, 0, 1, 3, 0.0F, true));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 62, 10, -0.25F, 1.0F, -5.0F, 2, 1, 2, 0.002F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 48, 1.5F, -0.5F, -5.0F, 0, 1, 3, 0.0F, false));
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 61, 0, -0.75F, 0.0F, -5.0F, 3, 1, 2, 0.0F, false));

        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.425F, 1.8026F, -3.2964F);
        this.jaw.addChild(cube_r30);
        this.setRotateAngle(cube_r30, -0.0198F, 0.0092F, 0.4362F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 48, 61, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, true));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.025F, -1.1108F, -0.7311F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, -0.0223F, -0.2181F, 0.0048F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 8, 56, 0.175F, -0.9F, -4.875F, 0, 2, 5, 0.0F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.025F, -1.1108F, -0.7311F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, -0.0223F, 0.2181F, -0.0048F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 8, 56, -0.175F, -0.9F, -4.875F, 0, 2, 5, 0.0F, false));

        this.cube_r33 = new AdvancedModelRenderer(this);
        this.cube_r33.setRotationPoint(-0.5F, -1.051F, 2.7465F);
        this.jaw.addChild(cube_r33);
        this.setRotateAngle(cube_r33, -0.0218F, 0.0F, 0.0F);
        this.cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 0, -1.0F, -1.0F, -5.0F, 3, 2, 3, -0.001F, false));

        this.cube_r34 = new AdvancedModelRenderer(this);
        this.cube_r34.setRotationPoint(0.0F, -0.051F, 1.9965F);
        this.jaw.addChild(cube_r34);
        this.setRotateAngle(cube_r34, -0.0218F, 0.0F, 0.0F);
        this.cube_r34.cubeList.add(new ModelBox(cube_r34, 56, 27, -2.0F, 0.0F, -5.0F, 4, 2, 3, 0.0F, false));

        this.cube_r35 = new AdvancedModelRenderer(this);
        this.cube_r35.setRotationPoint(1.425F, 1.8026F, -3.2964F);
        this.jaw.addChild(cube_r35);
        this.setRotateAngle(cube_r35, -0.0198F, -0.0092F, -0.4362F);
        this.cube_r35.cubeList.add(new ModelBox(cube_r35, 48, 61, -0.5F, -1.5F, -1.0F, 1, 2, 2, 0.0F, false));

        this.leftarm = new AdvancedModelRenderer(this);
        this.leftarm.setRotationPoint(2.7447F, 6.2473F, -3.73F);
        this.upperbody.addChild(leftarm);
        this.setRotateAngle(leftarm, -0.9764F, 0.4755F, -0.0678F);
        this.leftarm.cubeList.add(new ModelBox(leftarm, 27, 52, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));

        this.leftarm2 = new AdvancedModelRenderer(this);
        this.leftarm2.setRotationPoint(0.25F, 1.25F, 4.75F);
        this.leftarm.addChild(leftarm2);
        this.setRotateAngle(leftarm2, 0.1309F, 0.0F, 0.0F);
        this.leftarm2.cubeList.add(new ModelBox(leftarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 4, 2, -0.01F, false));

        this.leftarm3 = new AdvancedModelRenderer(this);
        this.leftarm3.setRotationPoint(0.1076F, 3.2825F, 0.0F);
        this.leftarm2.addChild(leftarm3);
        this.setRotateAngle(leftarm3, 0.0F, 0.0F, 0.4363F);
        this.leftarm3.cubeList.add(new ModelBox(leftarm3, 0, 18, -1.0F, -0.9F, -1.0F, 1, 2, 2, 0.0F, false));

        this.rightarm = new AdvancedModelRenderer(this);
        this.rightarm.setRotationPoint(-2.7447F, 6.2473F, -3.73F);
        this.upperbody.addChild(rightarm);
        this.setRotateAngle(rightarm, -0.9764F, -0.4755F, 0.0678F);
        this.rightarm.cubeList.add(new ModelBox(rightarm, 27, 52, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, true));

        this.rightarm2 = new AdvancedModelRenderer(this);
        this.rightarm2.setRotationPoint(-0.25F, 1.25F, 4.75F);
        this.rightarm.addChild(rightarm2);
        this.setRotateAngle(rightarm2, 0.1309F, 0.0F, 0.0F);
        this.rightarm2.cubeList.add(new ModelBox(rightarm2, 0, 0, -0.5F, -1.5F, -1.0F, 1, 4, 2, -0.01F, true));

        this.rightarm3 = new AdvancedModelRenderer(this);
        this.rightarm3.setRotationPoint(-0.1076F, 3.2825F, 0.0F);
        this.rightarm2.addChild(rightarm3);
        this.setRotateAngle(rightarm3, 0.0F, 0.0F, -0.4363F);
        this.rightarm3.cubeList.add(new ModelBox(rightarm3, 0, 18, 0.0F, -0.9F, -1.0F, 1, 2, 2, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.body.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.body.offsetY = -2.0F;
        this.body.offsetX = -1.338F;
        this.body.rotateAngleY = (float)Math.toRadians(200);
        this.body.rotateAngleX = (float)Math.toRadians(8);
        this.body.rotateAngleZ = (float)Math.toRadians(-8);
        this.body.scaleChildren = true;
        float scaler = 1.63F;
        this.body.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.body.render(f);
        //Reset rotations, positions and sizing:
        this.body.setScale(1.0F, 1.0F, 1.0F);
        this.body.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticFloor(float f) {
        this.body.rotateAngleY = (float) Math.toRadians(90);
        this.body.offsetY = -0.054F;
        this.body.render(0.01F);
        resetToDefaultPose();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraPsittacosaurus EntityPsittacosaurus = (EntityPrehistoricFloraPsittacosaurus) e;

        this.faceTarget(f3, f4, 8, neck);
        this.faceTarget(f3, f4, 8, head);

        AdvancedModelRenderer[] Tail = {this.tail2, this.tail3, this.tail4};
        AdvancedModelRenderer[] Neck = {this.neck, this.head};
        AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        EntityPsittacosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (EntityPsittacosaurus.getAnimation() == EntityPsittacosaurus.LAY_ANIMATION) {
            //this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            //this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!EntityPsittacosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !EntityPsittacosaurus.getIsMoving()) {
                    if (EntityPsittacosaurus.getAnimation() != EntityPsittacosaurus.EAT_ANIMATION
                        && EntityPsittacosaurus.getAnimation() != EntityPsittacosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

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

                if (EntityPsittacosaurus.getIsFast()) { //Running


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
        EntityPrehistoricFloraPsittacosaurus ee = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;

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
            else {
                //moving in water
                //
            }
        }
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
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.STAND_ANIMATION) { //The noise anim
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.GRAPPLE_ANIMATION) { //The noise anim
            animDisplay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animDisplay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 42;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (19-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 19 + (((tickAnim - 10) / 15) * (21.25-(19)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 21.25 + (((tickAnim - 25) / 12) * (-10.75-(21.25)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -10.75 + (((tickAnim - 37) / 6) * (0-(-10.75)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.9-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            yy = 0.9 + (((tickAnim - 10) / 15) * (0.9-(0.9)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = 0.9 + (((tickAnim - 25) / 12) * (-0.35-(0.9)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = -0.35 + (((tickAnim - 37) / 6) * (0-(-0.35)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
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
            xx = 0 + (((tickAnim - 0) / 10) * (18.32995-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-7.91668-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.1553-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 18.32995 + (((tickAnim - 10) / 4) * (18.32995-(18.32995)));
            yy = -7.91668 + (((tickAnim - 10) / 4) * (7.9167-(-7.91668)));
            zz = -1.1553 + (((tickAnim - 10) / 4) * (-1.1553-(-1.1553)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 18.32995 + (((tickAnim - 14) / 4) * (18.32995-(18.32995)));
            yy = 7.9167 + (((tickAnim - 14) / 4) * (-7.91668-(7.9167)));
            zz = -1.1553 + (((tickAnim - 14) / 4) * (-1.1553-(-1.1553)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 18.32995 + (((tickAnim - 18) / 5) * (18.32995-(18.32995)));
            yy = -7.91668 + (((tickAnim - 18) / 5) * (7.9167-(-7.91668)));
            zz = -1.1553 + (((tickAnim - 18) / 5) * (-1.1553-(-1.1553)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 18.32995 + (((tickAnim - 23) / 4) * (18.32995-(18.32995)));
            yy = 7.9167 + (((tickAnim - 23) / 4) * (-7.91668-(7.9167)));
            zz = -1.1553 + (((tickAnim - 23) / 4) * (-1.1553-(-1.1553)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 18.32995 + (((tickAnim - 27) / 4) * (4.82409-(18.32995)));
            yy = -7.91668 + (((tickAnim - 27) / 4) * (-9.90016-(-7.91668)));
            zz = -1.1553 + (((tickAnim - 27) / 4) * (-0.77265-(-1.1553)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 4.82409 + (((tickAnim - 31) / 6) * (0-(4.82409)));
            yy = -9.90016 + (((tickAnim - 31) / 6) * (0-(-9.90016)));
            zz = -0.77265 + (((tickAnim - 31) / 6) * (0-(-0.77265)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (6.4155-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-3.0363-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (1.1267-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 6.4155 + (((tickAnim - 5) / 5) * (12.80256-(6.4155)));
            yy = -3.0363 + (((tickAnim - 5) / 5) * (19.42281-(-3.0363)));
            zz = 1.1267 + (((tickAnim - 5) / 5) * (1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5-(1.1267)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 12.80256 + (((tickAnim - 10) / 4) * (12.80256-(12.80256)));
            yy = 19.42281 + (((tickAnim - 10) / 4) * (-19.4228-(19.42281)));
            zz = 1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5 + (((tickAnim - 10) / 4) * (1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5-(1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 12.80256 + (((tickAnim - 14) / 4) * (12.80256-(12.80256)));
            yy = -19.4228 + (((tickAnim - 14) / 4) * (19.42281-(-19.4228)));
            zz = 1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5 + (((tickAnim - 14) / 4) * (1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5-(1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 12.80256 + (((tickAnim - 18) / 5) * (12.80256-(12.80256)));
            yy = 19.42281 + (((tickAnim - 18) / 5) * (-19.4228-(19.42281)));
            zz = 1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5 + (((tickAnim - 18) / 5) * (1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5-(1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5)));
        }
        else if (tickAnim >= 23 && tickAnim < 27) {
            xx = 12.80256 + (((tickAnim - 23) / 4) * (12.80256-(12.80256)));
            yy = -19.4228 + (((tickAnim - 23) / 4) * (19.42281-(-19.4228)));
            zz = 1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5 + (((tickAnim - 23) / 4) * (1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5-(1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 12.80256 + (((tickAnim - 27) / 4) * (1.72536-(12.80256)));
            yy = 19.42281 + (((tickAnim - 27) / 4) * (12.2272-(19.42281)));
            zz = 1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5 + (((tickAnim - 27) / 4) * (1.05788-(1.7678+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1320))*5)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 1.72536 + (((tickAnim - 31) / 6) * (0-(1.72536)));
            yy = 12.2272 + (((tickAnim - 31) / 6) * (0-(12.2272)));
            zz = 1.05788 + (((tickAnim - 31) / 6) * (0-(1.05788)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.12576-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-2.45091-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.01649-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 5.12576 + (((tickAnim - 5) / 5) * (10.35101-(5.12576)));
            yy = -2.45091 + (((tickAnim - 5) / 5) * (11.19896-(-2.45091)));
            zz = -0.01649 + (((tickAnim - 5) / 5) * (3.57901-(-0.01649)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 10.35101 + (((tickAnim - 10) / 2) * (11.17141-(10.35101)));
            yy = 11.19896 + (((tickAnim - 10) / 2) * (6.18955-(11.19896)));
            zz = 3.57901 + (((tickAnim - 10) / 2) * (4.71851-(3.57901)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 11.17141 + (((tickAnim - 12) / 2) * (10.35101-(11.17141)));
            yy = 6.18955 + (((tickAnim - 12) / 2) * (-11.199-(6.18955)));
            zz = 4.71851 + (((tickAnim - 12) / 2) * (3.57901-(4.71851)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 10.35101 + (((tickAnim - 14) / 3) * (10.45304-(10.35101)));
            yy = -11.199 + (((tickAnim - 14) / 3) * (-7.33841-(-11.199)));
            zz = 3.57901 + (((tickAnim - 14) / 3) * (0.5304-(3.57901)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 10.45304 + (((tickAnim - 17) / 1) * (10.35101-(10.45304)));
            yy = -7.33841 + (((tickAnim - 17) / 1) * (11.19896-(-7.33841)));
            zz = 0.5304 + (((tickAnim - 17) / 1) * (3.57901-(0.5304)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10.35101 + (((tickAnim - 18) / 2) * (11.17141-(10.35101)));
            yy = 11.19896 + (((tickAnim - 18) / 2) * (6.18955-(11.19896)));
            zz = 3.57901 + (((tickAnim - 18) / 2) * (4.71851-(3.57901)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 11.17141 + (((tickAnim - 20) / 3) * (10.35101-(11.17141)));
            yy = 6.18955 + (((tickAnim - 20) / 3) * (-11.199-(6.18955)));
            zz = 4.71851 + (((tickAnim - 20) / 3) * (3.57901-(4.71851)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 10.35101 + (((tickAnim - 23) / 2) * (10.45304-(10.35101)));
            yy = -11.199 + (((tickAnim - 23) / 2) * (-7.33841-(-11.199)));
            zz = 3.57901 + (((tickAnim - 23) / 2) * (0.5304-(3.57901)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 10.45304 + (((tickAnim - 25) / 2) * (10.35101-(10.45304)));
            yy = -7.33841 + (((tickAnim - 25) / 2) * (11.19896-(-7.33841)));
            zz = 0.5304 + (((tickAnim - 25) / 2) * (3.57901-(0.5304)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 10.35101 + (((tickAnim - 27) / 4) * (6.53532-(10.35101)));
            yy = 11.19896 + (((tickAnim - 27) / 4) * (14.14136-(11.19896)));
            zz = 3.57901 + (((tickAnim - 27) / 4) * (3.90444-(3.57901)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 6.53532 + (((tickAnim - 31) / 6) * (-6.25-(6.53532)));
            yy = 14.14136 + (((tickAnim - 31) / 6) * (0-(14.14136)));
            zz = 3.90444 + (((tickAnim - 31) / 6) * (0-(3.90444)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -6.25 + (((tickAnim - 37) / 6) * (0-(-6.25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (9.46981-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-20.94329-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-8.01732-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 9.46981 + (((tickAnim - 5) / 5) * (17.28512-(9.46981)));
            yy = -20.94329 + (((tickAnim - 5) / 5) * (-22.71133-(-20.94329)));
            zz = -8.01732 + (((tickAnim - 5) / 5) * (-10.10828-(-8.01732)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 17.28512 + (((tickAnim - 10) / 2) * (19.43911-(17.28512)));
            yy = -22.71133 + (((tickAnim - 10) / 2) * (16.08362-(-22.71133)));
            zz = -10.10828 + (((tickAnim - 10) / 2) * (0.71314-(-10.10828)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 19.43911 + (((tickAnim - 12) / 2) * (17.28512-(19.43911)));
            yy = 16.08362 + (((tickAnim - 12) / 2) * (22.7113-(16.08362)));
            zz = 0.71314 + (((tickAnim - 12) / 2) * (-10.10828-(0.71314)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 17.28512 + (((tickAnim - 14) / 3) * (17.44325-(17.28512)));
            yy = 22.7113 + (((tickAnim - 14) / 3) * (-9.62625-(22.7113)));
            zz = -10.10828 + (((tickAnim - 14) / 3) * (-12.63763-(-10.10828)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 17.44325 + (((tickAnim - 17) / 1) * (17.28512-(17.44325)));
            yy = -9.62625 + (((tickAnim - 17) / 1) * (-22.71133-(-9.62625)));
            zz = -12.63763 + (((tickAnim - 17) / 1) * (-10.10828-(-12.63763)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 17.28512 + (((tickAnim - 18) / 2) * (19.43911-(17.28512)));
            yy = -22.71133 + (((tickAnim - 18) / 2) * (16.08362-(-22.71133)));
            zz = -10.10828 + (((tickAnim - 18) / 2) * (0.71314-(-10.10828)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 19.43911 + (((tickAnim - 20) / 3) * (17.28512-(19.43911)));
            yy = 16.08362 + (((tickAnim - 20) / 3) * (22.7113-(16.08362)));
            zz = 0.71314 + (((tickAnim - 20) / 3) * (-10.10828-(0.71314)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 17.28512 + (((tickAnim - 23) / 2) * (17.44325-(17.28512)));
            yy = 22.7113 + (((tickAnim - 23) / 2) * (-9.62625-(22.7113)));
            zz = -10.10828 + (((tickAnim - 23) / 2) * (-12.63763-(-10.10828)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 17.44325 + (((tickAnim - 25) / 2) * (17.28512-(17.44325)));
            yy = -9.62625 + (((tickAnim - 25) / 2) * (-22.71133-(-9.62625)));
            zz = -12.63763 + (((tickAnim - 25) / 2) * (-10.10828-(-12.63763)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 17.28512 + (((tickAnim - 27) / 4) * (9.92374-(17.28512)));
            yy = -22.71133 + (((tickAnim - 27) / 4) * (6.11063-(-22.71133)));
            zz = -10.10828 + (((tickAnim - 27) / 4) * (0.66321-(-10.10828)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 9.92374 + (((tickAnim - 31) / 6) * (-13-(9.92374)));
            yy = 6.11063 + (((tickAnim - 31) / 6) * (0-(6.11063)));
            zz = 0.66321 + (((tickAnim - 31) / 6) * (0-(0.66321)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -13 + (((tickAnim - 37) / 6) * (0-(-13)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (10.1808-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-26.35643-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-13.46872-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.1808 + (((tickAnim - 5) / 5) * (15.71373-(10.1808)));
            yy = -26.35643 + (((tickAnim - 5) / 5) * (-22.07132-(-26.35643)));
            zz = -13.46872 + (((tickAnim - 5) / 5) * (-12.58393-(-13.46872)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 15.71373 + (((tickAnim - 10) / 2) * (19.18715-(15.71373)));
            yy = -22.07132 + (((tickAnim - 10) / 2) * (21.27026-(-22.07132)));
            zz = -12.58393 + (((tickAnim - 10) / 2) * (4.7202-(-12.58393)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 19.18715 + (((tickAnim - 12) / 2) * (15.71373-(19.18715)));
            yy = 21.27026 + (((tickAnim - 12) / 2) * (22.0713-(21.27026)));
            zz = 4.7202 + (((tickAnim - 12) / 2) * (-12.58393-(4.7202)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = 15.71373 + (((tickAnim - 14) / 3) * (16.36764-(15.71373)));
            yy = 22.0713 + (((tickAnim - 14) / 3) * (-13.58712-(22.0713)));
            zz = -12.58393 + (((tickAnim - 14) / 3) * (-18.3653-(-12.58393)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 16.36764 + (((tickAnim - 17) / 1) * (15.71373-(16.36764)));
            yy = -13.58712 + (((tickAnim - 17) / 1) * (-22.07132-(-13.58712)));
            zz = -18.3653 + (((tickAnim - 17) / 1) * (-12.58393-(-18.3653)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 15.71373 + (((tickAnim - 18) / 2) * (19.18715-(15.71373)));
            yy = -22.07132 + (((tickAnim - 18) / 2) * (21.27026-(-22.07132)));
            zz = -12.58393 + (((tickAnim - 18) / 2) * (4.7202-(-12.58393)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 19.18715 + (((tickAnim - 20) / 3) * (15.71373-(19.18715)));
            yy = 21.27026 + (((tickAnim - 20) / 3) * (22.0713-(21.27026)));
            zz = 4.7202 + (((tickAnim - 20) / 3) * (-12.58393-(4.7202)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 15.71373 + (((tickAnim - 23) / 2) * (16.36764-(15.71373)));
            yy = 22.0713 + (((tickAnim - 23) / 2) * (-13.58712-(22.0713)));
            zz = -12.58393 + (((tickAnim - 23) / 2) * (-18.3653-(-12.58393)));
        }
        else if (tickAnim >= 25 && tickAnim < 27) {
            xx = 16.36764 + (((tickAnim - 25) / 2) * (15.71373-(16.36764)));
            yy = -13.58712 + (((tickAnim - 25) / 2) * (-22.07132-(-13.58712)));
            zz = -18.3653 + (((tickAnim - 25) / 2) * (-12.58393-(-18.3653)));
        }
        else if (tickAnim >= 27 && tickAnim < 31) {
            xx = 15.71373 + (((tickAnim - 27) / 4) * (9.25079-(15.71373)));
            yy = -22.07132 + (((tickAnim - 27) / 4) * (12.13288-(-22.07132)));
            zz = -12.58393 + (((tickAnim - 27) / 4) * (4.46341-(-12.58393)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 9.25079 + (((tickAnim - 31) / 6) * (-21.75-(9.25079)));
            yy = 12.13288 + (((tickAnim - 31) / 6) * (0-(12.13288)));
            zz = 4.46341 + (((tickAnim - 31) / 6) * (0-(4.46341)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -21.75 + (((tickAnim - 37) / 6) * (0-(-21.75)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 10) / 15) * (-17-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -17 + (((tickAnim - 25) / 12) * (8.5-(-17)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 8.5 + (((tickAnim - 37) / 6) * (0-(8.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-1.16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -1.16 + (((tickAnim - 25) / 12) * (6-(-1.16)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 6 + (((tickAnim - 37) / 6) * (0-(6)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -13.5 + (((tickAnim - 10) / 15) * (-17-(-13.5)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -17 + (((tickAnim - 25) / 12) * (8.5-(-17)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 8.5 + (((tickAnim - 37) / 6) * (0-(8.5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 10) / 15) * (-3-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = -3 + (((tickAnim - 25) / 18) * (0-(-3)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 0) / 37) * (6-(0)));
            yy = 0 + (((tickAnim - 0) / 37) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 37) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 6 + (((tickAnim - 37) / 6) * (0-(6)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (2.75849-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.49481-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0.21635-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 2.75849 + (((tickAnim - 10) / 5) * (2.75849-(2.75849)));
            yy = 4.49481 + (((tickAnim - 10) / 5) * (-4.4948-(4.49481)));
            zz = 0.21635 + (((tickAnim - 10) / 5) * (0.21635-(0.21635)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 2.75849 + (((tickAnim - 15) / 5) * (2.75849-(2.75849)));
            yy = -4.4948 + (((tickAnim - 15) / 5) * (4.49481-(-4.4948)));
            zz = 0.21635 + (((tickAnim - 15) / 5) * (0.21635-(0.21635)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 2.75849 + (((tickAnim - 20) / 5) * (2.75849-(2.75849)));
            yy = 4.49481 + (((tickAnim - 20) / 5) * (-4.4948-(4.49481)));
            zz = 0.21635 + (((tickAnim - 20) / 5) * (0.21635-(0.21635)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 2.75849 + (((tickAnim - 25) / 12) * (-5-(2.75849)));
            yy = -4.4948 + (((tickAnim - 25) / 12) * (0-(-4.4948)));
            zz = 0.21635 + (((tickAnim - 25) / 12) * (0-(0.21635)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -5 + (((tickAnim - 37) / 6) * (0-(-5)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-4.04594-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (5.87945-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-1.19882-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -4.04594 + (((tickAnim - 10) / 5) * (-4.04594-(-4.04594)));
            yy = 5.87945 + (((tickAnim - 10) / 5) * (-5.8794-(5.87945)));
            zz = -1.19882 + (((tickAnim - 10) / 5) * (-1.19882-(-1.19882)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = -4.04594 + (((tickAnim - 15) / 5) * (-4.04594-(-4.04594)));
            yy = -5.8794 + (((tickAnim - 15) / 5) * (5.87945-(-5.8794)));
            zz = -1.19882 + (((tickAnim - 15) / 5) * (-1.19882-(-1.19882)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = -4.04594 + (((tickAnim - 20) / 5) * (-4.04594-(-4.04594)));
            yy = 5.87945 + (((tickAnim - 20) / 5) * (-5.8794-(5.87945)));
            zz = -1.19882 + (((tickAnim - 20) / 5) * (-1.19882-(-1.19882)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -4.04594 + (((tickAnim - 25) / 12) * (-4-(-4.04594)));
            yy = -5.8794 + (((tickAnim - 25) / 12) * (0-(-5.8794)));
            zz = -1.19882 + (((tickAnim - 25) / 12) * (0-(-1.19882)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = -4 + (((tickAnim - 37) / 6) * (0-(-4)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (11.65086-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (3.3283-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-2.58702-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 11.65086 + (((tickAnim - 5) / 5) * (24.14763-(11.65086)));
            yy = 3.3283 + (((tickAnim - 5) / 5) * (-19.8761-(3.3283)));
            zz = -2.58702 + (((tickAnim - 5) / 5) * (-2.26912-(-2.58702)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 24.14763 + (((tickAnim - 10) / 3) * (25.54595-(24.14763)));
            yy = -19.8761 + (((tickAnim - 10) / 3) * (-7.3066-(-19.8761)));
            zz = -2.26912 + (((tickAnim - 10) / 3) * (-2.69416-(-2.26912)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 25.54595 + (((tickAnim - 13) / 2) * (23.92613-(25.54595)));
            yy = -7.3066 + (((tickAnim - 13) / 2) * (13.4183-(-7.3066)));
            zz = -2.69416 + (((tickAnim - 13) / 2) * (-1.49718-(-2.69416)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 23.92613 + (((tickAnim - 15) / 3) * (23.90498-(23.92613)));
            yy = 13.4183 + (((tickAnim - 15) / 3) * (9.05975-(13.4183)));
            zz = -1.49718 + (((tickAnim - 15) / 3) * (-0.36736-(-1.49718)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 23.90498 + (((tickAnim - 18) / 2) * (23.84086-(23.90498)));
            yy = 9.05975 + (((tickAnim - 18) / 2) * (-9.69149-(9.05975)));
            zz = -0.36736 + (((tickAnim - 18) / 2) * (-1.07169-(-0.36736)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = 23.84086 + (((tickAnim - 20) / 3) * (25.46262-(23.84086)));
            yy = -9.69149 + (((tickAnim - 20) / 3) * (-8.62268-(-9.69149)));
            zz = -1.07169 + (((tickAnim - 20) / 3) * (-2.83502-(-1.07169)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = 25.46262 + (((tickAnim - 23) / 2) * (23.7633-(25.46262)));
            yy = -8.62268 + (((tickAnim - 23) / 2) * (3.72772-(-8.62268)));
            zz = -2.83502 + (((tickAnim - 23) / 2) * (-2.58553-(-2.83502)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = 23.7633 + (((tickAnim - 25) / 5) * (13.78878-(23.7633)));
            yy = 3.72772 + (((tickAnim - 25) / 5) * (12.78963-(3.72772)));
            zz = -2.58553 + (((tickAnim - 25) / 5) * (-2.13418-(-2.58553)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 13.78878 + (((tickAnim - 30) / 7) * (0-(13.78878)));
            yy = 12.78963 + (((tickAnim - 30) / 7) * (0-(12.78963)));
            zz = -2.13418 + (((tickAnim - 30) / 7) * (0-(-2.13418)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-15.94082-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (4.38206-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (3.84065-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -15.94082 + (((tickAnim - 5) / 3) * (-25.25897-(-15.94082)));
            yy = 4.38206 + (((tickAnim - 5) / 3) * (-16.42472-(4.38206)));
            zz = 3.84065 + (((tickAnim - 5) / 3) * (2.23877-(3.84065)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -25.25897 + (((tickAnim - 8) / 2) * (-38.09951-(-25.25897)));
            yy = -16.42472 + (((tickAnim - 8) / 2) * (-16.84007-(-16.42472)));
            zz = 2.23877 + (((tickAnim - 8) / 2) * (2.36086-(2.23877)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -38.09951 + (((tickAnim - 10) / 3) * (-41.61511-(-38.09951)));
            yy = -16.84007 + (((tickAnim - 10) / 3) * (-19.9071-(-16.84007)));
            zz = 2.36086 + (((tickAnim - 10) / 3) * (-2.99442-(2.36086)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = -41.61511 + (((tickAnim - 13) / 2) * (-37.79577-(-41.61511)));
            yy = -19.9071 + (((tickAnim - 13) / 2) * (-6.19265-(-19.9071)));
            zz = -2.99442 + (((tickAnim - 13) / 2) * (5.56783-(-2.99442)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -37.79577 + (((tickAnim - 15) / 3) * (-38.32496-(-37.79577)));
            yy = -6.19265 + (((tickAnim - 15) / 3) * (26.6411-(-6.19265)));
            zz = 5.56783 + (((tickAnim - 15) / 3) * (6.21402-(5.56783)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -38.32496 + (((tickAnim - 18) / 2) * (-37.75357-(-38.32496)));
            yy = 26.6411 + (((tickAnim - 18) / 2) * (-1.73401-(26.6411)));
            zz = 6.21402 + (((tickAnim - 18) / 2) * (0.23606-(6.21402)));
        }
        else if (tickAnim >= 20 && tickAnim < 23) {
            xx = -37.75357 + (((tickAnim - 20) / 3) * (-41.73279-(-37.75357)));
            yy = -1.73401 + (((tickAnim - 20) / 3) * (-26.7651-(-1.73401)));
            zz = 0.23606 + (((tickAnim - 20) / 3) * (0.11016-(0.23606)));
        }
        else if (tickAnim >= 23 && tickAnim < 25) {
            xx = -41.73279 + (((tickAnim - 23) / 2) * (-37.75262-(-41.73279)));
            yy = -26.7651 + (((tickAnim - 23) / 2) * (1.48633-(-26.7651)));
            zz = 0.11016 + (((tickAnim - 23) / 2) * (4.51939-(0.11016)));
        }
        else if (tickAnim >= 25 && tickAnim < 30) {
            xx = -37.75262 + (((tickAnim - 25) / 5) * (-21.539-(-37.75262)));
            yy = 1.48633 + (((tickAnim - 25) / 5) * (18.19361-(1.48633)));
            zz = 4.51939 + (((tickAnim - 25) / 5) * (5.22636-(4.51939)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -21.539 + (((tickAnim - 30) / 7) * (0-(-21.539)));
            yy = 18.19361 + (((tickAnim - 30) / 7) * (0-(18.19361)));
            zz = 5.22636 + (((tickAnim - 30) / 7) * (0-(5.22636)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.275-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (1.3-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 10) / 5) * (-0.275-(-0.275)));
            zz = 1.3 + (((tickAnim - 10) / 5) * (1.3-(1.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 15) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 15) / 5) * (-0.275-(-0.275)));
            zz = 1.3 + (((tickAnim - 15) / 5) * (1.3-(1.3)));
        }
        else if (tickAnim >= 20 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 20) / 5) * (0-(0)));
            yy = -0.275 + (((tickAnim - 20) / 5) * (-0.275-(-0.275)));
            zz = 1.3 + (((tickAnim - 20) / 5) * (1.3-(1.3)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 25) / 12) * (0-(-0.275)));
            zz = 1.3 + (((tickAnim - 25) / 12) * (0-(1.3)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 27 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 27) / 8) * (19.75-(0)));
            yy = 0 + (((tickAnim - 27) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 27) / 8) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 37) {
            xx = 19.75 + (((tickAnim - 35) / 2) * (0-(19.75)));
            yy = 0 + (((tickAnim - 35) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-20-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-22-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 37) {
            xx = -20 + (((tickAnim - 10) / 27) * (13.75-(-20)));
            yy = 0 + (((tickAnim - 10) / 27) * (0-(0)));
            zz = -22 + (((tickAnim - 10) / 27) * (0-(-22)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 13.75 + (((tickAnim - 37) / 6) * (0-(13.75)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 37) {
            xx = -16.75 + (((tickAnim - 25) / 12) * (0-(-16.75)));
            yy = 0 + (((tickAnim - 25) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 12) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(xx), leftarm2.rotateAngleY + (float) Math.toRadians(yy), leftarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-15.383-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (23.32355-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (8.67215-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 37) {
            xx = -15.383 + (((tickAnim - 10) / 27) * (25-(-15.383)));
            yy = 23.32355 + (((tickAnim - 10) / 27) * (0-(23.32355)));
            zz = 8.67215 + (((tickAnim - 10) / 27) * (0-(8.67215)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 25 + (((tickAnim - 37) / 6) * (0-(25)));
            yy = 0 + (((tickAnim - 37) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-26.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = -26.5 + (((tickAnim - 25) / 18) * (0-(-26.5)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(xx), rightarm2.rotateAngleY + (float) Math.toRadians(yy), rightarm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 25) {
            xx = -5.25 + (((tickAnim - 10) / 15) * (-3-(-5.25)));
            yy = 0 + (((tickAnim - 10) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 15) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 43) {
            xx = -3 + (((tickAnim - 25) / 18) * (0-(-3)));
            yy = 0 + (((tickAnim - 25) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 18) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 11.25 + (((tickAnim - 7) / 7) * (0-(11.25)));
            yy = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.775-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 7) / 7) * (0-(0)));
            yy = 0.775 + (((tickAnim - 7) / 7) * (0-(0.775)));
            zz = 0 + (((tickAnim - 7) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody2.rotationPointX = this.upperbody2.rotationPointX + (float)(xx);
        this.upperbody2.rotationPointY = this.upperbody2.rotationPointY - (float)(yy);
        this.upperbody2.rotationPointZ = this.upperbody2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (7.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 20) {
            xx = 7.5 + (((tickAnim - 7) / 13) * (0-(7.5)));
            yy = 0 + (((tickAnim - 7) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 13) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 13.75 + (((tickAnim - 7) / 1) * (17.53-(13.75)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 17.53 + (((tickAnim - 8) / 6) * (0-(17.53)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (26.06-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 26.06 + (((tickAnim - 3) / 4) * (11.5-(26.06)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 11.5 + (((tickAnim - 7) / 1) * (-4.69-(11.5)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -4.69 + (((tickAnim - 8) / 4) * (3.28-(-4.69)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 3.28 + (((tickAnim - 12) / 2) * (-10-(3.28)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = -10 + (((tickAnim - 14) / 4) * (0-(-10)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.175-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 3) / 17) * (0-(0)));
            yy = -0.175 + (((tickAnim - 3) / 17) * (0-(-0.175)));
            zz = -0.15 + (((tickAnim - 3) / 17) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (28-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 28 + (((tickAnim - 7) / 1) * (0-(28)));
            yy = 0 + (((tickAnim - 7) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 1) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (15.75-(0)));
            yy = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 18) {
            xx = 15.75 + (((tickAnim - 14) / 4) * (0-(15.75)));
            yy = 0 + (((tickAnim - 14) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 4) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));

    }
    public void animGraze(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 120;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = 1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-5 + (((tickAnim - 25) / 17) * (7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3-(1.275+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-90))*-5)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3 + (((tickAnim - 42) / 18) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-120))*-5-(7.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*3)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-120))*-5 + (((tickAnim - 60) / 14) * (-4-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-120))*-5)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -4 + (((tickAnim - 74) / 14) * (0.75-(-4)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = 0.75 + (((tickAnim - 88) / 11) * (2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-3-(0.75)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = 2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-3 + (((tickAnim - 99) / 21) * (0-(2.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*-3)));
            yy = 0 + (((tickAnim - 99) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = -5.25 + (((tickAnim - 25) / 17) * (1.25-(-5.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = 1.25 + (((tickAnim - 42) / 18) * (7.43633-(1.25)));
            yy = 0 + (((tickAnim - 42) / 18) * (-0.55624-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0.66573-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = 7.43633 + (((tickAnim - 60) / 14) * (-0.56367-(7.43633)));
            yy = -0.55624 + (((tickAnim - 60) / 14) * (-0.55624-(-0.55624)));
            zz = 0.66573 + (((tickAnim - 60) / 14) * (0.66573-(0.66573)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -0.56367 + (((tickAnim - 74) / 14) * (-5.43242-(-0.56367)));
            yy = -0.55624 + (((tickAnim - 74) / 14) * (-0.55624-(-0.55624)));
            zz = 0.66573 + (((tickAnim - 74) / 14) * (0.66573-(0.66573)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = -5.43242 + (((tickAnim - 88) / 11) * (-2.3574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15-(-5.43242)));
            yy = -0.55624 + (((tickAnim - 88) / 11) * (-0.55624-(-0.55624)));
            zz = 0.66573 + (((tickAnim - 88) / 11) * (0.66573-(0.66573)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = -2.3574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15 + (((tickAnim - 99) / 21) * (0-(-2.3574+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*15)));
            yy = -0.55624 + (((tickAnim - 99) / 21) * (0-(-0.55624)));
            zz = 0.66573 + (((tickAnim - 99) / 21) * (0-(0.66573)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = -6.25 + (((tickAnim - 25) / 17) * (-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*5-(-6.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 88) {
            xx = -6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*5 + (((tickAnim - 42) / 46) * (-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10-(-6.35+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+50))*5)));
            yy = 0 + (((tickAnim - 42) / 46) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 46) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 120) {
            xx = -2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10 + (((tickAnim - 88) / 32) * (0-(-2.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*10)));
            yy = 0 + (((tickAnim - 88) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 32) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = -15.25 + (((tickAnim - 25) / 17) * (-12.5-(-15.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -12.5 + (((tickAnim - 42) / 18) * (-1.75-(-12.5)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -1.75 + (((tickAnim - 60) / 14) * (-10.25-(-1.75)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -10.25 + (((tickAnim - 74) / 14) * (-14.25-(-10.25)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = -14.25 + (((tickAnim - 88) / 11) * (-14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5-(-14.25)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = -14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5 + (((tickAnim - 99) / 21) * (0-(-14.15+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*5)));
            yy = 0 + (((tickAnim - 99) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-25.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 42) {
            xx = -25.25 + (((tickAnim - 25) / 17) * (-19-(-25.25)));
            yy = 0 + (((tickAnim - 25) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 17) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 60) {
            xx = -19 + (((tickAnim - 42) / 18) * (-6.5-(-19)));
            yy = 0 + (((tickAnim - 42) / 18) * (0-(0)));
            zz = 0 + (((tickAnim - 42) / 18) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 74) {
            xx = -6.5 + (((tickAnim - 60) / 14) * (-15.75-(-6.5)));
            yy = 0 + (((tickAnim - 60) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 14) * (0-(0)));
        }
        else if (tickAnim >= 74 && tickAnim < 88) {
            xx = -15.75 + (((tickAnim - 74) / 14) * (-20.75-(-15.75)));
            yy = 0 + (((tickAnim - 74) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 74) / 14) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 99) {
            xx = -20.75 + (((tickAnim - 88) / 11) * (-35.75-(-20.75)));
            yy = 0 + (((tickAnim - 88) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 11) * (0-(0)));
        }
        else if (tickAnim >= 99 && tickAnim < 120) {
            xx = -35.75 + (((tickAnim - 99) / 21) * (0-(-35.75)));
            yy = 0 + (((tickAnim - 99) / 21) * (0-(0)));
            zz = 0 + (((tickAnim - 99) / 21) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -9.5 + (((tickAnim - 25) / 75) * (-9.5-(-9.5)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -9.5 + (((tickAnim - 100) / 20) * (0-(-9.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-23.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -23.75 + (((tickAnim - 25) / 75) * (-23.75-(-23.75)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = -23.75 + (((tickAnim - 100) / 20) * (0-(-23.75)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = -0.175 + (((tickAnim - 25) / 75) * (-0.175-(-0.175)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (-57.63-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = -57.63 + (((tickAnim - 8) / 10) * (-57.63-(-57.63)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = -57.63 + (((tickAnim - 18) / 7) * (-4.25-(-57.63)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = -4.25 + (((tickAnim - 25) / 75) * (-4.25-(-4.25)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = -4.25 + (((tickAnim - 100) / 10) * (-55.02-(-4.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = -55.02 + (((tickAnim - 110) / 5) * (-60.16-(-55.02)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = -60.16 + (((tickAnim - 115) / 5) * (0-(-60.16)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (99.67-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 99.67 + (((tickAnim - 8) / 10) * (99.67-(99.67)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 99.67 + (((tickAnim - 18) / 7) * (37.25-(99.67)));
            yy = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 37.25 + (((tickAnim - 25) / 75) * (37.25-(37.25)));
            yy = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 75) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 110) {
            xx = 37.25 + (((tickAnim - 100) / 10) * (101-(37.25)));
            yy = 0 + (((tickAnim - 100) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 10) * (0-(0)));
        }
        else if (tickAnim >= 110 && tickAnim < 115) {
            xx = 101 + (((tickAnim - 110) / 5) * (93.73-(101)));
            yy = 0 + (((tickAnim - 110) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 110) / 5) * (0-(0)));
        }
        else if (tickAnim >= 115 && tickAnim < 120) {
            xx = 93.73 + (((tickAnim - 115) / 5) * (0-(93.73)));
            yy = 0 + (((tickAnim - 115) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 115) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 10) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 18) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 7) * (0.325-(0)));
            zz = 0 + (((tickAnim - 18) / 7) * (0.55-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 25) / 75) * (0-(0)));
            yy = 0.325 + (((tickAnim - 25) / 75) * (0.325-(0.325)));
            zz = 0.55 + (((tickAnim - 25) / 75) * (0.55-(0.55)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            yy = 0.325 + (((tickAnim - 100) / 20) * (0-(0.325)));
            zz = 0.55 + (((tickAnim - 100) / 20) * (0-(0.55)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 3.25 + (((tickAnim - 25) / 11) * (2.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-2-(3.25)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 50) {
            xx = 2.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-2 + (((tickAnim - 36) / 14) * (1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1-(2.775+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150+90))*-2)));
            yy = 0 + (((tickAnim - 36) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 14) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1 + (((tickAnim - 50) / 16) * (2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))-(1.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*1)));
            yy = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)) + (((tickAnim - 66) / 14) * (1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3-(2.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150)))));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3 + (((tickAnim - 80) / 13) * (1.5-(1.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*3)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 1.5 + (((tickAnim - 93) / 7) * (0.5-(1.5)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 0.5 + (((tickAnim - 100) / 20) * (0-(0.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (6.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 6.75 + (((tickAnim - 25) / 11) * (8.5-(6.75)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 8.5 + (((tickAnim - 36) / 4) * (6.25-(8.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 6.25 + (((tickAnim - 40) / 10) * (5.25-(6.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 66) {
            xx = 5.25 + (((tickAnim - 50) / 16) * (7.25-(5.25)));
            yy = 0 + (((tickAnim - 50) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 16) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 80) {
            xx = 7.25 + (((tickAnim - 66) / 14) * (3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5-(7.25)));
            yy = 0 + (((tickAnim - 66) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 14) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5 + (((tickAnim - 80) / 13) * (2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*5-(3.3+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-50))*5)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 120) {
            xx = 2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*5 + (((tickAnim - 93) / 27) * (0-(2.475+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150-20))*5)));
            yy = 0 + (((tickAnim - 93) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (25.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 25.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10 + (((tickAnim - 25) / 11) * (47-(25.625+Math.sin((Math.PI/180)*(((double)tickAnim/20)*150))*-10)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 47 + (((tickAnim - 36) / 4) * (45.5-(47)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 45.5 + (((tickAnim - 40) / 10) * (39-(45.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 39 + (((tickAnim - 50) / 10) * (32-(39)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 32 + (((tickAnim - 60) / 6) * (36.75-(32)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 36.75 + (((tickAnim - 66) / 5) * (33.5-(36.75)));
            yy = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 33.5 + (((tickAnim - 71) / 9) * (42.75-(33.5)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 42.75 + (((tickAnim - 80) / 13) * (48.5-(42.75)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 48.5 + (((tickAnim - 93) / 7) * (42.25-(48.5)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 42.25 + (((tickAnim - 100) / 20) * (0-(42.25)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-2.415-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = -2.415 + (((tickAnim - 25) / 11) * (-2.925-(-2.415)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = -2.925 + (((tickAnim - 36) / 4) * (-3.01-(-2.925)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = -3.01 + (((tickAnim - 40) / 10) * (-3.025-(-3.01)));
        }
        else if (tickAnim >= 50 && tickAnim < 53) {
            xx = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 50) / 3) * (0-(0)));
            zz = -3.025 + (((tickAnim - 50) / 3) * (-3.025-(-3.025)));
        }
        else if (tickAnim >= 53 && tickAnim < 80) {
            xx = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 53) / 27) * (0-(0)));
            zz = -3.025 + (((tickAnim - 53) / 27) * (-3.175-(-3.025)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = -3.175 + (((tickAnim - 80) / 13) * (-3.155-(-3.175)));
        }
        else if (tickAnim >= 93 && tickAnim < 120) {
            xx = 0 + (((tickAnim - 93) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 93) / 27) * (0-(0)));
            zz = -3.155 + (((tickAnim - 93) / 27) * (0-(-3.155)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.neck.rotationPointX = this.neck.rotationPointX + (float)(xx);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(yy);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (9-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 36) {
            xx = 9 + (((tickAnim - 25) / 11) * (-6.5-(9)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = -6.5 + (((tickAnim - 36) / 4) * (9.75-(-6.5)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 40) / 10) * (6.75-(9.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 6.75 + (((tickAnim - 50) / 10) * (12.25-(6.75)));
            yy = 0 + (((tickAnim - 50) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 50) / 10) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 66) {
            xx = 12.25 + (((tickAnim - 60) / 6) * (3-(12.25)));
            yy = 0 + (((tickAnim - 60) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 6) * (0-(0)));
        }
        else if (tickAnim >= 66 && tickAnim < 71) {
            xx = 3 + (((tickAnim - 66) / 5) * (5.75-(3)));
            yy = 0 + (((tickAnim - 66) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 66) / 5) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 80) {
            xx = 5.75 + (((tickAnim - 71) / 9) * (7.25-(5.75)));
            yy = 0 + (((tickAnim - 71) / 9) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 9) * (0-(0)));
        }
        else if (tickAnim >= 80 && tickAnim < 93) {
            xx = 7.25 + (((tickAnim - 80) / 13) * (9.5-(7.25)));
            yy = 0 + (((tickAnim - 80) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 80) / 13) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 100) {
            xx = 9.5 + (((tickAnim - 93) / 7) * (2.5-(9.5)));
            yy = 0 + (((tickAnim - 93) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 7) * (0-(0)));
        }
        else if (tickAnim >= 100 && tickAnim < 120) {
            xx = 2.5 + (((tickAnim - 100) / 20) * (0-(2.5)));
            yy = 0 + (((tickAnim - 100) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 100) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (-0.125-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 25 && tickAnim < 36) {
            xx = 0 + (((tickAnim - 25) / 11) * (16.25-(0)));
            yy = 0 + (((tickAnim - 25) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 11) * (0-(0)));
        }
        else if (tickAnim >= 36 && tickAnim < 40) {
            xx = 16.25 + (((tickAnim - 36) / 4) * (0-(16.25)));
            yy = 0 + (((tickAnim - 36) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 36) / 4) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 55) {
            xx = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 15) * (0-(0)));
        }
        else if (tickAnim >= 55 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 55) / 5) * (9.5-(0)));
            yy = 0 + (((tickAnim - 55) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 55) / 5) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 67) {
            xx = 9.5 + (((tickAnim - 60) / 7) * (0-(9.5)));
            yy = 0 + (((tickAnim - 60) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 60) / 7) * (0-(0)));
        }
        else if (tickAnim >= 67 && tickAnim < 68) {
            xx = 0 + (((tickAnim - 67) / 1) * (4.5-(0)));
            yy = 0 + (((tickAnim - 67) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 67) / 1) * (0-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 71) {
            xx = 4.5 + (((tickAnim - 68) / 3) * (0-(4.5)));
            yy = 0 + (((tickAnim - 68) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 68) / 3) * (0-(0)));
        }
        else if (tickAnim >= 71 && tickAnim < 88) {
            xx = 0 + (((tickAnim - 71) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 71) / 17) * (0-(0)));
            zz = 0 + (((tickAnim - 71) / 17) * (0-(0)));
        }
        else if (tickAnim >= 88 && tickAnim < 91) {
            xx = 0 + (((tickAnim - 88) / 3) * (10-(0)));
            yy = 0 + (((tickAnim - 88) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 88) / 3) * (0-(0)));
        }
        else if (tickAnim >= 91 && tickAnim < 93) {
            xx = 10 + (((tickAnim - 91) / 2) * (0-(10)));
            yy = 0 + (((tickAnim - 91) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 91) / 2) * (0-(0)));
        }
        else if (tickAnim >= 93 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 93) / 1) * (3.75-(0)));
            yy = 0 + (((tickAnim - 93) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 93) / 1) * (0-(0)));
        }
        else if (tickAnim >= 94 && tickAnim < 96) {
            xx = 3.75 + (((tickAnim - 94) / 2) * (0-(3.75)));
            yy = 0 + (((tickAnim - 94) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 94) / 2) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 40;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-1.75-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -1.75 + (((tickAnim - 5) / 27) * (-4.5-(-1.75)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*2)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -4.5 + (((tickAnim - 32) / 8) * (0-(-4.5)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*950))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-0.225-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = -0.225 + (((tickAnim - 5) / 27) * (0.2-(-0.225)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0.2 + (((tickAnim - 32) / 8) * (0-(0.2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -3.5 + (((tickAnim - 5) / 27) * (11.75-(-3.5)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3 + (((tickAnim - 5) / 27) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7 + (((tickAnim - 5) / 27) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*7)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 11.75 + (((tickAnim - 32) / 8) * (0-(11.75)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3 + (((tickAnim - 32) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220+30))*3)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 5.25 + (((tickAnim - 5) / 12) * (7.5-(5.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*7)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = 7.5 + (((tickAnim - 17) / 15) * (14.75-(7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5 + (((tickAnim - 17) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*-5)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13 + (((tickAnim - 17) / 15) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*13)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 14.75 + (((tickAnim - 32) / 8) * (0-(14.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5 + (((tickAnim - 32) / 8) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 17) {
            xx = 4.25 + (((tickAnim - 5) / 12) * (-7.5-(4.25)));
            yy = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12 + (((tickAnim - 5) / 12) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*12)));
        }
        else if (tickAnim >= 17 && tickAnim < 32) {
            xx = -7.5 + (((tickAnim - 17) / 15) * (-11.25-(-7.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7 + (((tickAnim - 17) / 15) * (0-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-40))*7)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18 + (((tickAnim - 17) / 15) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-140))*18)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -11.25 + (((tickAnim - 32) / 8) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.00043-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.09968-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.48996-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.00043 + (((tickAnim - 3) / 2) * (2-(1.00043)));
            yy = -0.09968 + (((tickAnim - 3) / 2) * (0-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 3) / 2) * (0-(-0.48996)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2 + (((tickAnim - 5) / 3) * (2.37946-(2)));
            yy = 0 + (((tickAnim - 5) / 3) * (-0.2816-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (-1.60048-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.37946 + (((tickAnim - 8) / 2) * (1.00043-(2.37946)));
            yy = -0.2816 + (((tickAnim - 8) / 2) * (-0.09968-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 8) / 2) * (-0.48996-(-1.60048)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 1.00043 + (((tickAnim - 10) / 3) * (2.37946-(1.00043)));
            yy = -0.09968 + (((tickAnim - 10) / 3) * (-0.2816-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 10) / 3) * (-1.60048-(-0.48996)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.37946 + (((tickAnim - 13) / 3) * (1.00043-(2.37946)));
            yy = -0.2816 + (((tickAnim - 13) / 3) * (-0.09968-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 13) / 3) * (-0.48996-(-1.60048)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 1.00043 + (((tickAnim - 16) / 2) * (2.37946-(1.00043)));
            yy = -0.09968 + (((tickAnim - 16) / 2) * (-0.2816-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 16) / 2) * (-1.60048-(-0.48996)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2.37946 + (((tickAnim - 18) / 4) * (1.00043-(2.37946)));
            yy = -0.2816 + (((tickAnim - 18) / 4) * (-0.09968-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 18) / 4) * (-0.48996-(-1.60048)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 1.00043 + (((tickAnim - 22) / 2) * (2.37946-(1.00043)));
            yy = -0.09968 + (((tickAnim - 22) / 2) * (-0.2816-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 22) / 2) * (-1.60048-(-0.48996)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.37946 + (((tickAnim - 24) / 4) * (1.00043-(2.37946)));
            yy = -0.2816 + (((tickAnim - 24) / 4) * (-0.09968-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 24) / 4) * (-0.48996-(-1.60048)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 1.00043 + (((tickAnim - 28) / 3) * (2.37946-(1.00043)));
            yy = -0.09968 + (((tickAnim - 28) / 3) * (-0.2816-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 28) / 3) * (-1.15048-(-0.48996)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 2.37946 + (((tickAnim - 31) / 4) * (1.00043-(2.37946)));
            yy = -0.2816 + (((tickAnim - 31) / 4) * (-0.09968-(-0.2816)));
            zz = -1.15048 + (((tickAnim - 31) / 4) * (-0.48996-(-1.15048)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 1.00043 + (((tickAnim - 35) / 5) * (0-(1.00043)));
            yy = -0.09968 + (((tickAnim - 35) / 5) * (0-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 35) / 5) * (0-(-0.48996)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (1.00043-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (-0.09968-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-0.48996-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 1.00043 + (((tickAnim - 3) / 2) * (2.00088-(1.00043)));
            yy = -0.09968 + (((tickAnim - 3) / 2) * (0.13667-(-0.09968)));
            zz = -0.48996 + (((tickAnim - 3) / 2) * (0.73744-(-0.48996)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 2.00088 + (((tickAnim - 5) / 3) * (2.37946-(2.00088)));
            yy = 0.13667 + (((tickAnim - 5) / 3) * (-0.2816-(0.13667)));
            zz = 0.73744 + (((tickAnim - 5) / 3) * (-1.60048-(0.73744)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 2.37946 + (((tickAnim - 8) / 2) * (2.00088-(2.37946)));
            yy = -0.2816 + (((tickAnim - 8) / 2) * (0.13667-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 8) / 2) * (0.73744-(-1.60048)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 2.00088 + (((tickAnim - 10) / 3) * (2.37946-(2.00088)));
            yy = 0.13667 + (((tickAnim - 10) / 3) * (-0.2816-(0.13667)));
            zz = 0.73744 + (((tickAnim - 10) / 3) * (-1.60048-(0.73744)));
        }
        else if (tickAnim >= 13 && tickAnim < 16) {
            xx = 2.37946 + (((tickAnim - 13) / 3) * (2.00088-(2.37946)));
            yy = -0.2816 + (((tickAnim - 13) / 3) * (0.13667-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 13) / 3) * (0.73744-(-1.60048)));
        }
        else if (tickAnim >= 16 && tickAnim < 18) {
            xx = 2.00088 + (((tickAnim - 16) / 2) * (2.37946-(2.00088)));
            yy = 0.13667 + (((tickAnim - 16) / 2) * (-0.2816-(0.13667)));
            zz = 0.73744 + (((tickAnim - 16) / 2) * (-1.60048-(0.73744)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 2.37946 + (((tickAnim - 18) / 4) * (2.00088-(2.37946)));
            yy = -0.2816 + (((tickAnim - 18) / 4) * (0.13667-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 18) / 4) * (0.73744-(-1.60048)));
        }
        else if (tickAnim >= 22 && tickAnim < 24) {
            xx = 2.00088 + (((tickAnim - 22) / 2) * (2.37946-(2.00088)));
            yy = 0.13667 + (((tickAnim - 22) / 2) * (-0.2816-(0.13667)));
            zz = 0.73744 + (((tickAnim - 22) / 2) * (-1.60048-(0.73744)));
        }
        else if (tickAnim >= 24 && tickAnim < 28) {
            xx = 2.37946 + (((tickAnim - 24) / 4) * (2.00088-(2.37946)));
            yy = -0.2816 + (((tickAnim - 24) / 4) * (0.13667-(-0.2816)));
            zz = -1.60048 + (((tickAnim - 24) / 4) * (0.73744-(-1.60048)));
        }
        else if (tickAnim >= 28 && tickAnim < 31) {
            xx = 2.00088 + (((tickAnim - 28) / 3) * (2.37946-(2.00088)));
            yy = 0.13667 + (((tickAnim - 28) / 3) * (-0.2816-(0.13667)));
            zz = 0.73744 + (((tickAnim - 28) / 3) * (-1.15048-(0.73744)));
        }
        else if (tickAnim >= 31 && tickAnim < 35) {
            xx = 2.37946 + (((tickAnim - 31) / 4) * (2.00088-(2.37946)));
            yy = -0.2816 + (((tickAnim - 31) / 4) * (0.13667-(-0.2816)));
            zz = -1.15048 + (((tickAnim - 31) / 4) * (0.73744-(-1.15048)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 2.00088 + (((tickAnim - 35) / 5) * (0-(2.00088)));
            yy = 0.13667 + (((tickAnim - 35) / 5) * (0-(0.13667)));
            zz = 0.73744 + (((tickAnim - 35) / 5) * (0-(0.73744)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (4.25-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 4.25 + (((tickAnim - 5) / 27) * (-8.75-(4.25)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-20))*3)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -8.75 + (((tickAnim - 32) / 8) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-13.775-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = -13.775 + (((tickAnim - 5) / 27) * (10.75-(-13.775)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-50))*6)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 10.75 + (((tickAnim - 32) / 8) * (0-(10.75)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (14.5-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 14.5 + (((tickAnim - 5) / 27) * (-20.25-(14.5)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8 + (((tickAnim - 5) / 27) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220-90))*8)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = -20.25 + (((tickAnim - 32) / 8) * (0-(-20.25)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5 + (((tickAnim - 32) / 8) * (0-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*1220))*0.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 32) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 32) * (0.6-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 32) / 8) * (0-(0)));
            zz = 0.6 + (((tickAnim - 32) / 8) * (0-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (3.75-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 3.75 + (((tickAnim - 3) / 2) * (0-(3.75)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 5) / 27) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 27) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.45425-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-9.1539-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (15.02728-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 12.45425 + (((tickAnim - 5) / 30) * (34.04873-(12.45425)));
            yy = -9.1539 + (((tickAnim - 5) / 30) * (-6.46631-(-9.1539)));
            zz = 15.02728 + (((tickAnim - 5) / 30) * (11.44898-(15.02728)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 34.04873 + (((tickAnim - 35) / 5) * (0-(34.04873)));
            yy = -6.46631 + (((tickAnim - 35) / 5) * (0-(-6.46631)));
            zz = 11.44898 + (((tickAnim - 35) / 5) * (0-(11.44898)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (12.45425-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (-9.1539-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (-15.0273-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 35) {
            xx = 12.45425 + (((tickAnim - 5) / 30) * (34.04873-(12.45425)));
            yy = -9.1539 + (((tickAnim - 5) / 30) * (6.4663-(-9.1539)));
            zz = -15.0273 + (((tickAnim - 5) / 30) * (-11.449-(-15.0273)));
        }
        else if (tickAnim >= 35 && tickAnim < 40) {
            xx = 34.04873 + (((tickAnim - 35) / 5) * (0-(34.04873)));
            yy = 6.4663 + (((tickAnim - 35) / 5) * (0-(6.4663)));
            zz = -11.449 + (((tickAnim - 35) / 5) * (0-(-11.449)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));
    }
    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -5.25 + (((tickAnim - 7) / 6) * (-3.75-(-5.25)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -3.75 + (((tickAnim - 13) / 7) * (0-(-3.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (-0.3-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            yy = -0.3 + (((tickAnim - 7) / 6) * (-0.3-(-0.3)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            yy = -0.3 + (((tickAnim - 13) / 7) * (0-(-0.3)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody2.rotationPointX = this.upperbody2.rotationPointX + (float)(xx);
        this.upperbody2.rotationPointY = this.upperbody2.rotationPointY - (float)(yy);
        this.upperbody2.rotationPointZ = this.upperbody2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -3 + (((tickAnim - 7) / 6) * (-7.75-(-3)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = -7.75 + (((tickAnim - 13) / 7) * (0-(-7.75)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));

        this.upperbody.rotationPointX = this.upperbody.rotationPointX + (float)(0);
        this.upperbody.rotationPointY = this.upperbody.rotationPointY - (float)(0);
        this.upperbody.rotationPointZ = this.upperbody.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 9.75 + (((tickAnim - 7) / 6) * (6.5-(9.75)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 6.5 + (((tickAnim - 13) / 7) * (0-(6.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));

        this.neck.rotationPointX = this.neck.rotationPointX + (float)(0);
        this.neck.rotationPointY = this.neck.rotationPointY - (float)(0);
        this.neck.rotationPointZ = this.neck.rotationPointZ + (float)(0);



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (-9.5-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = -9.5 + (((tickAnim - 7) / 6) * (5-(-9.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 5 + (((tickAnim - 13) / 7) * (0-(5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightside, rightside.rotateAngleX + (float) Math.toRadians(0), rightside.rotateAngleY + (float) Math.toRadians(0), rightside.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 3) / 4) * (12.5-(0)));
            yy = 0 + (((tickAnim - 3) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 4) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 12.5 + (((tickAnim - 7) / 6) * (18.25-(12.5)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 18.25 + (((tickAnim - 13) / 7) * (0-(18.25)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(jaw, jaw.rotateAngleX + (float) Math.toRadians(xx), jaw.rotateAngleY + (float) Math.toRadians(yy), jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 7) / 6) * (30.5-(20)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.5 + (((tickAnim - 13) / 7) * (0-(30.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (20-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 20 + (((tickAnim - 7) / 6) * (30.5-(20)));
            yy = 0 + (((tickAnim - 7) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 6) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 20) {
            xx = 30.5 + (((tickAnim - 13) / 7) * (0-(30.5)));
            yy = 0 + (((tickAnim - 13) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));

    }
    public void animNest(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 1.5 + (((tickAnim - 10) / 30) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 40) / 10) * (0-(1.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -2 + (((tickAnim - 10) / 10) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 2.25 + (((tickAnim - 20) / 10) * (-2-(2.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -2 + (((tickAnim - 30) / 10) * (2.25-(-2)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 2.25 + (((tickAnim - 40) / 10) * (0-(2.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -3.5 + (((tickAnim - 10) / 10) * (10.25-(-3.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 10.25 + (((tickAnim - 20) / 10) * (-3.5-(10.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -3.5 + (((tickAnim - 30) / 10) * (10.25-(-3.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 40) / 10) * (0-(10.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -10.5 + (((tickAnim - 10) / 10) * (1.25-(-10.5)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 1.25 + (((tickAnim - 20) / 10) * (-10.5-(1.25)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -10.5 + (((tickAnim - 30) / 10) * (1.25-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 1.25 + (((tickAnim - 40) / 10) * (0-(1.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -10.5 + (((tickAnim - 10) / 4) * (-15.28-(-10.5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -15.28 + (((tickAnim - 14) / 6) * (-1.5-(-15.28)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -1.5 + (((tickAnim - 20) / 4) * (5.75-(-1.5)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 5.75 + (((tickAnim - 24) / 6) * (-10.5-(5.75)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -10.5 + (((tickAnim - 30) / 3) * (-15.28-(-10.5)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -15.28 + (((tickAnim - 33) / 7) * (-1.5-(-15.28)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -1.5 + (((tickAnim - 40) / 3) * (5.75-(-1.5)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
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
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-7.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = -7.25 + (((tickAnim - 10) / 4) * (-32.56-(-7.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -32.56 + (((tickAnim - 14) / 6) * (-0.75-(-32.56)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 24) {
            xx = -0.75 + (((tickAnim - 20) / 4) * (8.29-(-0.75)));
            yy = 0 + (((tickAnim - 20) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 4) * (0-(0)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 8.29 + (((tickAnim - 24) / 6) * (-7.25-(8.29)));
            yy = 0 + (((tickAnim - 24) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 6) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 33) {
            xx = -7.25 + (((tickAnim - 30) / 3) * (-32.56-(-7.25)));
            yy = 0 + (((tickAnim - 30) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 3) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = -32.56 + (((tickAnim - 33) / 7) * (-0.75-(-32.56)));
            yy = 0 + (((tickAnim - 33) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 43) {
            xx = -0.75 + (((tickAnim - 40) / 3) * (8.29-(-0.75)));
            yy = 0 + (((tickAnim - 40) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 3) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = 8.29 + (((tickAnim - 43) / 7) * (0-(8.29)));
            yy = 0 + (((tickAnim - 43) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 43) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-16.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -16.75 + (((tickAnim - 10) / 10) * (23-(-16.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 23 + (((tickAnim - 20) / 10) * (-16.75-(23)));
            yy = 0 + (((tickAnim - 20) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 10) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -16.75 + (((tickAnim - 30) / 10) * (23-(-16.75)));
            yy = 0 + (((tickAnim - 30) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 10) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 23 + (((tickAnim - 40) / 10) * (0-(23)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-19.25408-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (4.3286-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (8.49363-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -19.25408 + (((tickAnim - 10) / 10) * (16.81676-(-19.25408)));
            yy = 4.3286 + (((tickAnim - 10) / 10) * (-0.75556-(4.3286)));
            zz = 8.49363 + (((tickAnim - 10) / 10) * (-0.82129-(8.49363)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 16.81676 + (((tickAnim - 20) / 10) * (-19.25408-(16.81676)));
            yy = -0.75556 + (((tickAnim - 20) / 10) * (4.3286-(-0.75556)));
            zz = -0.82129 + (((tickAnim - 20) / 10) * (8.49363-(-0.82129)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -19.25408 + (((tickAnim - 30) / 10) * (16.81676-(-19.25408)));
            yy = 4.3286 + (((tickAnim - 30) / 10) * (-0.75556-(4.3286)));
            zz = 8.49363 + (((tickAnim - 30) / 10) * (-0.82129-(8.49363)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 16.81676 + (((tickAnim - 40) / 10) * (0-(16.81676)));
            yy = -0.75556 + (((tickAnim - 40) / 10) * (0-(-0.75556)));
            zz = -0.82129 + (((tickAnim - 40) / 10) * (0-(-0.82129)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (-62.24-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -62.24 + (((tickAnim - 5) / 5) * (0.75-(-62.24)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0.75 + (((tickAnim - 10) / 10) * (21.75-(0.75)));
            yy = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 21.75 + (((tickAnim - 20) / 6) * (-68.9-(21.75)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = -68.9 + (((tickAnim - 26) / 4) * (0.75-(-68.9)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0.75 + (((tickAnim - 30) / 20) * (0-(0.75)));
            yy = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-0.325-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 10) / 10) * (0-(0)));
            yy = -0.325 + (((tickAnim - 10) / 10) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 10) / 10) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.375-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.375 + (((tickAnim - 26) / 4) * (-0.325-(0.375)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 30) / 20) * (0-(0)));
            yy = -0.325 + (((tickAnim - 30) / 20) * (0-(-0.325)));
            zz = 0 + (((tickAnim - 30) / 20) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 0) / 5) * (116.68-(0)));
            yy = 0 + (((tickAnim - 0) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 5) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 116.68 + (((tickAnim - 5) / 5) * (36.25-(116.68)));
            yy = 0 + (((tickAnim - 5) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 5) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 36.25 + (((tickAnim - 10) / 4) * (-0.02-(36.25)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -0.02 + (((tickAnim - 14) / 6) * (80-(-0.02)));
            yy = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 80 + (((tickAnim - 20) / 6) * (103.48-(80)));
            yy = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (0-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 103.48 + (((tickAnim - 26) / 4) * (36.25-(103.48)));
            yy = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 26) / 4) * (0-(0)));
        }
        else if (tickAnim >= 30 && tickAnim < 34) {
            xx = 36.25 + (((tickAnim - 30) / 4) * (-0.02-(36.25)));
            yy = 0 + (((tickAnim - 30) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 30) / 4) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = -0.02 + (((tickAnim - 34) / 6) * (80-(-0.02)));
            yy = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 80 + (((tickAnim - 40) / 10) * (0-(80)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 2) * (1.215-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 12) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 12) / 2) * (0.975-(1.215)));
            zz = 0 + (((tickAnim - 12) / 2) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 0 + (((tickAnim - 14) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 14) / 6) * (0-(0.975)));
            zz = 0 + (((tickAnim - 14) / 6) * (0-(0)));
        }
        else if (tickAnim >= 20 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 20) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 20) / 6) * (0.625-(0)));
            zz = 0 + (((tickAnim - 20) / 6) * (-0.325-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 30) {
            xx = 0 + (((tickAnim - 26) / 4) * (0-(0)));
            yy = 0.625 + (((tickAnim - 26) / 4) * (0-(0.625)));
            zz = -0.325 + (((tickAnim - 26) / 4) * (0-(-0.325)));
        }
        else if (tickAnim >= 30 && tickAnim < 32) {
            xx = 0 + (((tickAnim - 30) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 30) / 2) * (1.215-(0)));
            zz = 0 + (((tickAnim - 30) / 2) * (0-(0)));
        }
        else if (tickAnim >= 32 && tickAnim < 34) {
            xx = 0 + (((tickAnim - 32) / 2) * (0-(0)));
            yy = 1.215 + (((tickAnim - 32) / 2) * (0.975-(1.215)));
            zz = 0 + (((tickAnim - 32) / 2) * (0-(0)));
        }
        else if (tickAnim >= 34 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 34) / 6) * (0-(0)));
            yy = 0.975 + (((tickAnim - 34) / 6) * (0-(0.975)));
            zz = 0 + (((tickAnim - 34) / 6) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (-2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = -2.5 + (((tickAnim - 10) / 30) * (-2.5-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -2.5 + (((tickAnim - 40) / 10) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(0), rightleg2.rotateAngleY + (float) Math.toRadians(0), rightleg2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(0), rightleg3.rotateAngleY + (float) Math.toRadians(0), rightleg3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(0), rightleg4.rotateAngleY + (float) Math.toRadians(0), rightleg4.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 3.5 + (((tickAnim - 10) / 30) * (3.5-(3.5)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 3.5 + (((tickAnim - 40) / 10) * (0-(3.5)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0.225-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            yy = 0.225 + (((tickAnim - 10) / 30) * (0.225-(0.225)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            yy = 0.225 + (((tickAnim - 40) / 10) * (0-(0.225)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody2.rotationPointX = this.upperbody2.rotationPointX + (float)(xx);
        this.upperbody2.rotationPointY = this.upperbody2.rotationPointY - (float)(yy);
        this.upperbody2.rotationPointZ = this.upperbody2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 5.25 + (((tickAnim - 10) / 30) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 40) / 10) * (0-(5.25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (13.21252-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-4.66695-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (-4.82678-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 13.21252 + (((tickAnim - 10) / 30) * (13.21252-(13.21252)));
            yy = -4.66695 + (((tickAnim - 10) / 30) * (-4.66695-(-4.66695)));
            zz = -4.82678 + (((tickAnim - 10) / 30) * (-4.82678-(-4.82678)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 13.21252 + (((tickAnim - 40) / 10) * (0-(13.21252)));
            yy = -4.66695 + (((tickAnim - 40) / 10) * (0-(-4.66695)));
            zz = -4.82678 + (((tickAnim - 40) / 10) * (0-(-4.82678)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (10.25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (-15.75-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 10.25 + (((tickAnim - 10) / 30) * (10.25-(10.25)));
            yy = -15.75 + (((tickAnim - 10) / 30) * (-15.75-(-15.75)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 10.25 + (((tickAnim - 40) / 10) * (0-(10.25)));
            yy = -15.75 + (((tickAnim - 40) / 10) * (0-(-15.75)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (14.75-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 14.75 + (((tickAnim - 10) / 30) * (14.75-(14.75)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 14.75 + (((tickAnim - 40) / 10) * (0-(14.75)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(xx), leftarm.rotateAngleY + (float) Math.toRadians(yy), leftarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (25-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 40) {
            xx = 25 + (((tickAnim - 10) / 30) * (25-(25)));
            yy = 0 + (((tickAnim - 10) / 30) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 30) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 25 + (((tickAnim - 40) / 10) * (0-(25)));
            yy = 0 + (((tickAnim - 40) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 40) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(xx), rightarm.rotateAngleY + (float) Math.toRadians(yy), rightarm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-15.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -15.5 + (((tickAnim - 15) / 20) * (-15.5-(-15.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -15.5 + (((tickAnim - 35) / 15) * (0-(-15.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(xx), body.rotateAngleY + (float) Math.toRadians(yy), body.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-3.175-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = -3.175 + (((tickAnim - 15) / 20) * (-3.175-(-3.175)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = -3.175 + (((tickAnim - 35) / 15) * (0-(-3.175)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.body.rotationPointX = this.body.rotationPointX + (float)(xx);
        this.body.rotationPointY = this.body.rotationPointY - (float)(yy);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-6-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -6 + (((tickAnim - 15) / 20) * (-6-(-6)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -6 + (((tickAnim - 35) / 15) * (0-(-6)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(xx), tail2.rotateAngleY + (float) Math.toRadians(yy), tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -5.25 + (((tickAnim - 15) / 20) * (-5.25-(-5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -5.25 + (((tickAnim - 35) / 15) * (0-(-5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(xx), tail3.rotateAngleY + (float) Math.toRadians(yy), tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 1.5 + (((tickAnim - 15) / 20) * (1.5-(1.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 1.5 + (((tickAnim - 35) / 15) * (0-(1.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(xx), tail4.rotateAngleY + (float) Math.toRadians(yy), tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.25 + (((tickAnim - 15) / 20) * (8.25-(8.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.25 + (((tickAnim - 35) / 15) * (0-(8.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(xx), tail5.rotateAngleY + (float) Math.toRadians(yy), tail5.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (12-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 12 + (((tickAnim - 15) / 20) * (12-(12)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 12 + (((tickAnim - 35) / 15) * (0-(12)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(xx), tail6.rotateAngleY + (float) Math.toRadians(yy), tail6.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23.73853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-10.48004-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-2.75169-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23.73853 + (((tickAnim - 15) / 20) * (23.73853-(23.73853)));
            yy = -10.48004 + (((tickAnim - 15) / 20) * (-10.48004-(-10.48004)));
            zz = -2.75169 + (((tickAnim - 15) / 20) * (-2.75169-(-2.75169)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23.73853 + (((tickAnim - 35) / 15) * (0-(23.73853)));
            yy = -10.48004 + (((tickAnim - 35) / 15) * (0-(-10.48004)));
            zz = -2.75169 + (((tickAnim - 35) / 15) * (0-(-2.75169)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20.75 + (((tickAnim - 15) / 20) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -20.75 + (((tickAnim - 35) / 15) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-71-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -71 + (((tickAnim - 15) / 20) * (-71-(-71)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -71 + (((tickAnim - 35) / 15) * (0-(-71)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (92.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 92.75 + (((tickAnim - 15) / 20) * (92.75-(92.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 92.75 + (((tickAnim - 35) / 15) * (0-(92.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.725 + (((tickAnim - 7) / 8) * (0-(0.725)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 9) * (1.1-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 1.1 + (((tickAnim - 44) / 6) * (0-(1.1)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (23.73853-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (10.48-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (2.7517-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 23.73853 + (((tickAnim - 15) / 20) * (23.73853-(23.73853)));
            yy = 10.48 + (((tickAnim - 15) / 20) * (10.48-(10.48)));
            zz = 2.7517 + (((tickAnim - 15) / 20) * (2.7517-(2.7517)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 23.73853 + (((tickAnim - 35) / 15) * (0-(23.73853)));
            yy = 10.48 + (((tickAnim - 35) / 15) * (0-(10.48)));
            zz = 2.7517 + (((tickAnim - 35) / 15) * (0-(2.7517)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-20.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -20.75 + (((tickAnim - 15) / 20) * (-20.75-(-20.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -20.75 + (((tickAnim - 35) / 15) * (0-(-20.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-71-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -71 + (((tickAnim - 15) / 20) * (-71-(-71)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -71 + (((tickAnim - 35) / 15) * (0-(-71)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (92.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 92.75 + (((tickAnim - 15) / 20) * (92.75-(92.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 92.75 + (((tickAnim - 35) / 15) * (0-(92.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 7) * (0.7-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            yy = 0.7 + (((tickAnim - 7) / 8) * (0-(0.7)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 44) {
            xx = 0 + (((tickAnim - 35) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 35) / 9) * (1.225-(0)));
            zz = 0 + (((tickAnim - 35) / 9) * (0-(0)));
        }
        else if (tickAnim >= 44 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 44) / 6) * (0-(0)));
            yy = 1.225 + (((tickAnim - 44) / 6) * (0-(1.225)));
            zz = 0 + (((tickAnim - 44) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (10.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 10.5 + (((tickAnim - 15) / 20) * (10.5-(10.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 10.5 + (((tickAnim - 35) / 15) * (0-(10.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(xx), upperbody2.rotateAngleY + (float) Math.toRadians(yy), upperbody2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0.725-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            yy = 0.725 + (((tickAnim - 15) / 20) * (0.725-(0.725)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            yy = 0.725 + (((tickAnim - 35) / 15) * (0-(0.725)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.upperbody2.rotationPointX = this.upperbody2.rotationPointX + (float)(xx);
        this.upperbody2.rotationPointY = this.upperbody2.rotationPointY - (float)(yy);
        this.upperbody2.rotationPointZ = this.upperbody2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 8.75 + (((tickAnim - 15) / 20) * (8.75-(8.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 8.75 + (((tickAnim - 35) / 15) * (0-(8.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(xx), upperbody.rotateAngleY + (float) Math.toRadians(yy), upperbody.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.25 + (((tickAnim - 15) / 20) * (13.25-(13.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.25 + (((tickAnim - 35) / 15) * (0-(13.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(xx), neck.rotateAngleY + (float) Math.toRadians(yy), neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.25 + (((tickAnim - 15) / 20) * (-11.25-(-11.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.25 + (((tickAnim - 35) / 15) * (0-(-11.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(xx), head.rotateAngleY + (float) Math.toRadians(yy), head.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0));
    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;
        int animCycle = 21;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+40))*1.3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-20))*2), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+20))*3));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5))*-0.2);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5))*0.2);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5+40))*0.1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-90))*2), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+20))*3));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5+40))*0.1), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-140))*3), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+20))*3));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5+40))*0.1), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-200))*12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+20))*3));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5+40))*0.1), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-220))*12), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+20))*3));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-15.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5+70))*0.1), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-270))*15), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333+40))*3));



        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10.9374 + (((tickAnim - 0) / 3) * (-14.1874-(-10.9374)));
            yy = -3.42725 + (((tickAnim - 0) / 3) * (0-(-3.42725)));
            zz = -0.56041 + (((tickAnim - 0) / 3) * (0-(-0.56041)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -14.1874 + (((tickAnim - 3) / 12) * (20.5-(-14.1874)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 20.5 + (((tickAnim - 15) / 7) * (-10.9374-(20.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (-3.42725-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (-0.56041-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -26 + (((tickAnim - 0) / 3) * (-23.5-(-26)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = -23.5 + (((tickAnim - 3) / 12) * (17.5-(-23.5)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 17.5 + (((tickAnim - 15) / 7) * (-26-(17.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.5 + (((tickAnim - 0) / 3) * (-0.275-(0.5)));
            zz = -0.2 + (((tickAnim - 0) / 3) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = -0.275 + (((tickAnim - 3) / 12) * (0-(-0.275)));
            zz = -0.1 + (((tickAnim - 3) / 12) * (0-(-0.1)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 7) * (0.5-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (-0.2-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -40.75 + (((tickAnim - 0) / 3) * (1-(-40.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 1 + (((tickAnim - 3) / 12) * (-3-(1)));
            yy = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = -3 + (((tickAnim - 15) / 3) * (-30.13-(-3)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = -30.13 + (((tickAnim - 18) / 4) * (-40.75-(-30.13)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0.175 + (((tickAnim - 0) / 3) * (0-(0.175)));
            zz = 0.525 + (((tickAnim - 0) / 3) * (0-(0.525)));
        }
        else if (tickAnim >= 3 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 3) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 12) * (-0.02-(0)));
            zz = 0 + (((tickAnim - 3) / 12) * (0.345-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.02 + (((tickAnim - 15) / 3) * (0.225-(-0.02)));
            zz = 0.345 + (((tickAnim - 15) / 3) * (0.6-(0.345)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 18) / 4) * (0.175-(0.225)));
            zz = 0.6 + (((tickAnim - 18) / 4) * (0.525-(0.6)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg3.rotationPointX = this.leftleg3.rotationPointX + (float)(xx);
        this.leftleg3.rotationPointY = this.leftleg3.rotationPointY - (float)(yy);
        this.leftleg3.rotationPointZ = this.leftleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 111.5 + (((tickAnim - 0) / 3) * (35.95508-(111.5)));
            yy = 0 + (((tickAnim - 0) / 3) * (2.02251-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-2.54453-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 35.95508 + (((tickAnim - 3) / 2) * (27.18664-(35.95508)));
            yy = 2.02251 + (((tickAnim - 3) / 2) * (1.43298-(2.02251)));
            zz = -2.54453 + (((tickAnim - 3) / 2) * (-3.46577-(-2.54453)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 27.18664 + (((tickAnim - 5) / 2) * (22.23-(27.18664)));
            yy = 1.43298 + (((tickAnim - 5) / 2) * (0-(1.43298)));
            zz = -3.46577 + (((tickAnim - 5) / 2) * (0-(-3.46577)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 22.23 + (((tickAnim - 7) / 8) * (90.25-(22.23)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 90.25 + (((tickAnim - 15) / 3) * (105.88-(90.25)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 105.88 + (((tickAnim - 18) / 4) * (111.5-(105.88)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            yy = 0 + (((tickAnim - 3) / 2) * (0.6-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0.2-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0 + (((tickAnim - 5) / 2) * (0-(0)));
            yy = 0.6 + (((tickAnim - 5) / 2) * (0.325-(0.6)));
            zz = 0.2 + (((tickAnim - 5) / 2) * (0-(0.2)));
        }
        else if (tickAnim >= 7 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 7) / 2) * (0-(0)));
            yy = 0.325 + (((tickAnim - 7) / 2) * (0.625-(0.325)));
            zz = 0 + (((tickAnim - 7) / 2) * (0-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 9) / 6) * (0-(0)));
            yy = 0.625 + (((tickAnim - 9) / 6) * (0-(0.625)));
            zz = 0 + (((tickAnim - 9) / 6) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 15) / 3) * (1-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 18) / 4) * (0-(1)));
            zz = -0.15 + (((tickAnim - 18) / 4) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 11.25 + (((tickAnim - 0) / 4) * (20.5-(11.25)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 20.5 + (((tickAnim - 4) / 8) * (-14.06752-(20.5)));
            yy = 0 + (((tickAnim - 4) / 8) * (1.29604-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (1.05891-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -14.06752 + (((tickAnim - 12) / 3) * (-15.24359-(-14.06752)));
            yy = 1.29604 + (((tickAnim - 12) / 3) * (-2.40968-(1.29604)));
            zz = 1.05891 + (((tickAnim - 12) / 3) * (0.5431-(1.05891)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -15.24359 + (((tickAnim - 15) / 7) * (11.25-(-15.24359)));
            yy = -2.40968 + (((tickAnim - 15) / 7) * (0-(-2.40968)));
            zz = 0.5431 + (((tickAnim - 15) / 7) * (0-(0.5431)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0.75 + (((tickAnim - 0) / 4) * (17.5-(0.75)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 17.5 + (((tickAnim - 4) / 8) * (-26-(17.5)));
            yy = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -26 + (((tickAnim - 12) / 3) * (-21.5-(-26)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -21.5 + (((tickAnim - 15) / 7) * (0.75-(-21.5)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 4) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 8) * (1.175-(0)));
            zz = 0 + (((tickAnim - 4) / 8) * (-0.2-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 1.175 + (((tickAnim - 12) / 3) * (-0.125-(1.175)));
            zz = -0.2 + (((tickAnim - 12) / 3) * (-0.1-(-0.2)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.125 + (((tickAnim - 15) / 7) * (0-(-0.125)));
            zz = -0.1 + (((tickAnim - 15) / 7) * (0-(-0.1)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = -6.5 + (((tickAnim - 4) / 4) * (-30.13-(-6.5)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = -30.13 + (((tickAnim - 8) / 4) * (-24.25-(-30.13)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = -24.25 + (((tickAnim - 12) / 3) * (-8.75-(-24.25)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -8.75 + (((tickAnim - 15) / 7) * (0-(-8.75)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (-0.145-(0)));
            zz = 0.325 + (((tickAnim - 0) / 4) * (0.315-(0.325)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = -0.145 + (((tickAnim - 4) / 4) * (0.225-(-0.145)));
            zz = 0.315 + (((tickAnim - 4) / 4) * (0.6-(0.315)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 0.225 + (((tickAnim - 8) / 4) * (0.225-(0.225)));
            zz = 0.6 + (((tickAnim - 8) / 4) * (0.3-(0.6)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0.225 + (((tickAnim - 12) / 3) * (-0.15-(0.225)));
            zz = 0.3 + (((tickAnim - 12) / 3) * (0.11-(0.3)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            yy = -0.15 + (((tickAnim - 15) / 7) * (0-(-0.15)));
            zz = 0.11 + (((tickAnim - 15) / 7) * (0.325-(0.11)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg3.rotationPointX = this.rightleg3.rotationPointX + (float)(xx);
        this.rightleg3.rotationPointY = this.rightleg3.rotationPointY - (float)(yy);
        this.rightleg3.rotationPointZ = this.rightleg3.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 24 + (((tickAnim - 0) / 4) * (90.25-(24)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 90.25 + (((tickAnim - 4) / 4) * (105.88-(90.25)));
            yy = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 105.88 + (((tickAnim - 8) / 4) * (111.5-(105.88)));
            yy = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 4) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 111.5 + (((tickAnim - 12) / 3) * (46.75-(111.5)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 46.75 + (((tickAnim - 15) / 3) * (19.73-(46.75)));
            yy = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 3) * (0-(0)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 19.73 + (((tickAnim - 18) / 4) * (24-(19.73)));
            yy = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 4) * (0-(0)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 4) / 4) * (1-(0)));
            zz = 0 + (((tickAnim - 4) / 4) * (-0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 0 + (((tickAnim - 8) / 4) * (0-(0)));
            yy = 1 + (((tickAnim - 8) / 4) * (0-(1)));
            zz = -0.15 + (((tickAnim - 8) / 4) * (0-(-0.15)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (-0.65-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0.15-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 15) / 3) * (0-(0)));
            yy = -0.65 + (((tickAnim - 15) / 3) * (0.3-(-0.65)));
            zz = 0.15 + (((tickAnim - 15) / 3) * (0-(0.15)));
        }
        else if (tickAnim >= 18 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 18) / 4) * (0-(0)));
            yy = 0.3 + (((tickAnim - 18) / 4) * (0-(0.3)));
            zz = 0 + (((tickAnim - 18) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5+150))*-1), upperbody2.rotateAngleY + (float) Math.toRadians(0), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332+140))*3.8));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332/0.5-50))*-2.8), upperbody.rotateAngleY + (float) Math.toRadians(0), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*332-120))*2));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-120))*2.8), neck.rotateAngleY + (float) Math.toRadians(0), neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-120))*2));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(3.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-320))*2.8), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-30))*-2), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-340))*2));

        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0.175 + (((tickAnim - 0) / 7) * (0.2-(0.175)));
            yy = 0 + (((tickAnim - 0) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 7) * (0-(0)));
        }
        else if (tickAnim >= 7 && tickAnim < 15) {
            xx = 0.2 + (((tickAnim - 7) / 8) * (-0.225-(0.2)));
            yy = 0 + (((tickAnim - 7) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 7) / 8) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 22) {
            xx = -0.225 + (((tickAnim - 15) / 7) * (0.175-(-0.225)));
            yy = 0 + (((tickAnim - 15) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 7) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.head.rotationPointX = this.head.rotationPointX + (float)(xx);
        this.head.rotationPointY = this.head.rotationPointY - (float)(yy);
        this.head.rotationPointZ = this.head.rotationPointZ + (float)(zz);



        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-50))*-2.8), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-120))*2));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-180))*-4), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-120))*2));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-50))*-2.8), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-120))*2));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333/0.5-180))*-4), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*333-120))*2));

    }
    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraPsittacosaurus entity = (EntityPrehistoricFloraPsittacosaurus) entitylivingbaseIn;int animCycle = 14;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(body, body.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+30))*3), body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-30))*8), body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+30))*3.5));
        this.body.rotationPointX = this.body.rotationPointX + (float)(0);
        this.body.rotationPointY = this.body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*490/0.485))*-0.5);
        this.body.rotationPointZ = this.body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*490/0.485))*0.3);


        this.setRotateAngle(tail2, tail2.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+30))*-1), tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-90))*-8), tail2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+50))*3.5));


        this.setRotateAngle(tail3, tail3.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5))*-3), tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-100))*-10), tail3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+30))*3.5));


        this.setRotateAngle(tail4, tail4.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+50))*-5), tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-200))*-12), tail4.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+30))*3.5));


        this.setRotateAngle(tail5, tail5.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+80))*-8), tail5.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-230))*-16), tail5.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+30))*3.5));


        this.setRotateAngle(tail6, tail6.rotateAngleX + (float) Math.toRadians(-0.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+100))*-8), tail6.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-300))*-16), tail6.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+60))*3.5));



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -18.25 + (((tickAnim - 0) / 8) * (27.5394-(-18.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-10.2611-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-3.22236-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 12) {
            xx = 27.5394 + (((tickAnim - 8) / 4) * (1.40847-(27.5394)));
            yy = -10.2611 + (((tickAnim - 8) / 4) * (-5.98515-(-10.2611)));
            zz = -3.22236 + (((tickAnim - 8) / 4) * (-1.10973-(-3.22236)));
        }
        else if (tickAnim >= 12 && tickAnim < 14) {
            xx = 1.40847 + (((tickAnim - 12) / 2) * (-18.25-(1.40847)));
            yy = -5.98515 + (((tickAnim - 12) / 2) * (0-(-5.98515)));
            zz = -1.10973 + (((tickAnim - 12) / 2) * (0-(-1.10973)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg, leftleg.rotateAngleX + (float) Math.toRadians(xx), leftleg.rotateAngleY + (float) Math.toRadians(yy), leftleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = -26.75 + (((tickAnim - 0) / 8) * (20.5-(-26.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 20.5 + (((tickAnim - 8) / 6) * (-26.75-(20.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg2, leftleg2.rotateAngleX + (float) Math.toRadians(xx), leftleg2.rotateAngleY + (float) Math.toRadians(yy), leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0.075 + (((tickAnim - 0) / 8) * (-0.25-(0.075)));
            zz = -0.15 + (((tickAnim - 0) / 8) * (0-(-0.15)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.25 + (((tickAnim - 8) / 6) * (0.075-(-0.25)));
            zz = 0 + (((tickAnim - 8) / 6) * (-0.15-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg2.rotationPointX = this.leftleg2.rotationPointX + (float)(xx);
        this.leftleg2.rotationPointY = this.leftleg2.rotationPointY - (float)(yy);
        this.leftleg2.rotationPointZ = this.leftleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 9.75 + (((tickAnim - 0) / 8) * (11.25-(9.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 11.25 + (((tickAnim - 8) / 3) * (-64-(11.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = -64 + (((tickAnim - 11) / 2) * (-64-(-64)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = -64 + (((tickAnim - 13) / 1) * (9.75-(-64)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg3, leftleg3.rotateAngleX + (float) Math.toRadians(xx), leftleg3.rotateAngleY + (float) Math.toRadians(yy), leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.225 + (((tickAnim - 0) / 8) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 0) / 8) * (0.3-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 6) * (-0.225-(0)));
            zz = 0.3 + (((tickAnim - 8) / 6) * (0-(0.3)));
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
            xx = 33.5 + (((tickAnim - 0) / 2) * (12.61998-(33.5)));
            yy = 0 + (((tickAnim - 0) / 2) * (0.94779-(0)));
            zz = 0 + (((tickAnim - 0) / 2) * (-3.62841-(0)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 12.61998 + (((tickAnim - 2) / 1) * (3.3-(12.61998)));
            yy = 0.94779 + (((tickAnim - 2) / 1) * (0-(0.94779)));
            zz = -3.62841 + (((tickAnim - 2) / 1) * (0-(-3.62841)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 3.3 + (((tickAnim - 3) / 5) * (107.25-(3.3)));
            yy = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 5) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 107.25 + (((tickAnim - 8) / 3) * (103.8-(107.25)));
            yy = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (0-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 103.8 + (((tickAnim - 11) / 2) * (103.8-(103.8)));
            yy = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 11) / 2) * (0-(0)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 103.8 + (((tickAnim - 13) / 1) * (33.5-(103.8)));
            yy = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            zz = 0 + (((tickAnim - 13) / 1) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftleg4, leftleg4.rotateAngleX + (float) Math.toRadians(xx), leftleg4.rotateAngleY + (float) Math.toRadians(yy), leftleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 1) {
            xx = 0 + (((tickAnim - 0) / 1) * (0-(0)));
            yy = -0.15 + (((tickAnim - 0) / 1) * (1.405-(-0.15)));
            zz = 0.275 + (((tickAnim - 0) / 1) * (0.425-(0.275)));
        }
        else if (tickAnim >= 1 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 1) / 1) * (0-(0)));
            yy = 1.405 + (((tickAnim - 1) / 1) * (1.54-(1.405)));
            zz = 0.425 + (((tickAnim - 1) / 1) * (0-(0.425)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0 + (((tickAnim - 2) / 1) * (0-(0)));
            yy = 1.54 + (((tickAnim - 2) / 1) * (0.885-(1.54)));
            zz = 0 + (((tickAnim - 2) / 1) * (0.325-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 3) / 5) * (0-(0)));
            yy = 0.885 + (((tickAnim - 3) / 5) * (0-(0.885)));
            zz = 0.325 + (((tickAnim - 3) / 5) * (0-(0.325)));
        }
        else if (tickAnim >= 8 && tickAnim < 11) {
            xx = 0 + (((tickAnim - 8) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 8) / 3) * (0.65-(0)));
            zz = 0 + (((tickAnim - 8) / 3) * (-0.15-(0)));
        }
        else if (tickAnim >= 11 && tickAnim < 13) {
            xx = 0 + (((tickAnim - 11) / 2) * (0-(0)));
            yy = 0.65 + (((tickAnim - 11) / 2) * (0.65-(0.65)));
            zz = -0.15 + (((tickAnim - 11) / 2) * (-0.15-(-0.15)));
        }
        else if (tickAnim >= 13 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 13) / 1) * (0-(0)));
            yy = 0.65 + (((tickAnim - 13) / 1) * (-0.15-(0.65)));
            zz = -0.15 + (((tickAnim - 13) / 1) * (0.275-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.leftleg4.rotationPointX = this.leftleg4.rotationPointX + (float)(xx);
        this.leftleg4.rotationPointY = this.leftleg4.rotationPointY - (float)(yy);
        this.leftleg4.rotationPointZ = this.leftleg4.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 5) {
            xx = 27.7823 + (((tickAnim - 0) / 5) * (-2.86842-(27.7823)));
            yy = 13.83448 + (((tickAnim - 0) / 5) * (6.57627-(13.83448)));
            zz = 4.38548 + (((tickAnim - 0) / 5) * (1.82065-(4.38548)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -2.86842 + (((tickAnim - 5) / 3) * (-18.25-(-2.86842)));
            yy = 6.57627 + (((tickAnim - 5) / 3) * (0-(6.57627)));
            zz = 1.82065 + (((tickAnim - 5) / 3) * (0-(1.82065)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -18.25 + (((tickAnim - 8) / 6) * (27.7823-(-18.25)));
            yy = 0 + (((tickAnim - 8) / 6) * (13.83448-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (4.38548-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg, rightleg.rotateAngleX + (float) Math.toRadians(xx), rightleg.rotateAngleY + (float) Math.toRadians(yy), rightleg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 20.5 + (((tickAnim - 0) / 8) * (-21.5-(20.5)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = -21.5 + (((tickAnim - 8) / 6) * (20.5-(-21.5)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg2, rightleg2.rotateAngleX + (float) Math.toRadians(xx), rightleg2.rotateAngleY + (float) Math.toRadians(yy), rightleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = -0.25 + (((tickAnim - 0) / 8) * (-0.1-(-0.25)));
            zz = 0 + (((tickAnim - 0) / 8) * (-0.15-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.1 + (((tickAnim - 8) / 6) * (-0.25-(-0.1)));
            zz = -0.15 + (((tickAnim - 8) / 6) * (0-(-0.15)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg2.rotationPointX = this.rightleg2.rotationPointX + (float)(xx);
        this.rightleg2.rotationPointY = this.rightleg2.rotationPointY - (float)(yy);
        this.rightleg2.rotationPointZ = this.rightleg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -7.75 + (((tickAnim - 0) / 3) * (-60.67-(-7.75)));
            yy = 0 + (((tickAnim - 0) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (0-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = -60.67 + (((tickAnim - 3) / 2) * (-60.67-(-60.67)));
            yy = 0 + (((tickAnim - 3) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 3) / 2) * (0-(0)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = -60.67 + (((tickAnim - 5) / 3) * (1-(-60.67)));
            yy = 0 + (((tickAnim - 5) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 5) / 3) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 1 + (((tickAnim - 8) / 6) * (-7.75-(1)));
            yy = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 6) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg3, rightleg3.rotateAngleX + (float) Math.toRadians(xx), rightleg3.rotateAngleY + (float) Math.toRadians(yy), rightleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (-0.225-(0)));
            zz = 0.375 + (((tickAnim - 0) / 8) * (0-(0.375)));
        }
        else if (tickAnim >= 8 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 8) / 6) * (0-(0)));
            yy = -0.225 + (((tickAnim - 8) / 6) * (0-(-0.225)));
            zz = 0 + (((tickAnim - 8) / 6) * (0.375-(0)));
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
            xx = 107.25 + (((tickAnim - 0) / 3) * (109.73226-(107.25)));
            yy = 0 + (((tickAnim - 0) / 3) * (-1.56386-(0)));
            zz = 0 + (((tickAnim - 0) / 3) * (-3.18103-(0)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 109.73226 + (((tickAnim - 3) / 2) * (109.73226-(109.73226)));
            yy = -1.56386 + (((tickAnim - 3) / 2) * (-1.56386-(-1.56386)));
            zz = -3.18103 + (((tickAnim - 3) / 2) * (-3.18103-(-3.18103)));
        }
        else if (tickAnim >= 5 && tickAnim < 8) {
            xx = 109.73226 + (((tickAnim - 5) / 3) * (36.75-(109.73226)));
            yy = -1.56386 + (((tickAnim - 5) / 3) * (0-(-1.56386)));
            zz = -3.18103 + (((tickAnim - 5) / 3) * (0-(-3.18103)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 36.75 + (((tickAnim - 8) / 1) * (18.75216-(36.75)));
            yy = 0 + (((tickAnim - 8) / 1) * (-1.31128-(0)));
            zz = 0 + (((tickAnim - 8) / 1) * (5.34187-(0)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 18.75216 + (((tickAnim - 9) / 1) * (9.47-(18.75216)));
            yy = -1.31128 + (((tickAnim - 9) / 1) * (0-(-1.31128)));
            zz = 5.34187 + (((tickAnim - 9) / 1) * (0-(5.34187)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 9.47 + (((tickAnim - 10) / 4) * (107.25-(9.47)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(rightleg4, rightleg4.rotateAngleX + (float) Math.toRadians(xx), rightleg4.rotateAngleY + (float) Math.toRadians(yy), rightleg4.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 8) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 8) / 0) * (0-(0)));
            yy = 0.025 + (((tickAnim - 8) / 0) * (1.41-(0.025)));
            zz = 0 + (((tickAnim - 8) / 0) * (0.35-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 9) {
            xx = 0 + (((tickAnim - 8) / 1) * (0-(0)));
            yy = 1.41 + (((tickAnim - 8) / 1) * (1.44-(1.41)));
            zz = 0.35 + (((tickAnim - 8) / 1) * (0.3-(0.35)));
        }
        else if (tickAnim >= 9 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 9) / 1) * (0-(0)));
            yy = 1.44 + (((tickAnim - 9) / 1) * (0.985-(1.44)));
            zz = 0.3 + (((tickAnim - 9) / 1) * (0.375-(0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            yy = 0.985 + (((tickAnim - 10) / 4) * (0-(0.985)));
            zz = 0.375 + (((tickAnim - 10) / 4) * (0-(0.375)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.rightleg4.rotationPointX = this.rightleg4.rotationPointX + (float)(xx);
        this.rightleg4.rotationPointY = this.rightleg4.rotationPointY - (float)(yy);
        this.rightleg4.rotationPointZ = this.rightleg4.rotationPointZ + (float)(zz);



        this.setRotateAngle(upperbody2, upperbody2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5+160))*3), upperbody2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+60))*4), upperbody2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+140))*4));


        this.setRotateAngle(upperbody, upperbody.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-40))*5), upperbody.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+120))*3), upperbody.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));


        this.setRotateAngle(neck, neck.rotateAngleX + (float) Math.toRadians(8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-30))*-5), neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+170))*3), neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));


        this.setRotateAngle(head, head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-100))*3), head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508+290))*-5), head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*-4));


        this.setRotateAngle(leftarm, leftarm.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-60))*-5), leftarm.rotateAngleY + (float) Math.toRadians(0), leftarm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));


        this.setRotateAngle(leftarm2, leftarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-60))*7), leftarm2.rotateAngleY + (float) Math.toRadians(0), leftarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));


        this.setRotateAngle(rightarm, rightarm.rotateAngleX + (float) Math.toRadians(17.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-60))*-5), rightarm.rotateAngleY + (float) Math.toRadians(0), rightarm.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));


        this.setRotateAngle(rightarm2, rightarm2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508/0.5-60))*7), rightarm2.rotateAngleY + (float) Math.toRadians(0), rightarm2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*508-120))*4));



    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraPsittacosaurus e = (EntityPrehistoricFloraPsittacosaurus) entity;
        animator.update(entity);


    }
}
