package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraGemuendina;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelGemuendina extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer tail6;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r30;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r31;
    private final AdvancedModelRenderer cube_r32;

    public ModelGemuendina() {
        this.textureWidth = 70;
        this.textureHeight = 70;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 14, -5.5F, -1.8876F, -4.5383F, 11, 2, 5, -0.003F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.2582F, -0.0214F, -0.6037F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.77F, -1.4628F, 0.7134F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 54, 18, -3.9F, -2.175F, -1.5F, 4, 2, 2, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(5.2582F, -0.0214F, -0.6037F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.77F, 1.4628F, -0.7134F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 18, -0.1F, -2.175F, -1.5F, 4, 2, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-6.4637F, -0.7945F, -4.4577F);
        this.main.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3084F, -0.7155F, 0.2269F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 55, 48, 0.0F, -0.5F, 0.0F, 1, 1, 1, 0.003F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(6.4637F, -0.7945F, -4.4577F);
        this.main.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.3084F, 0.7155F, -0.2269F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 48, -1.0F, -0.5F, 0.0F, 1, 1, 1, 0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-6.4637F, -0.7945F, -4.4577F);
        this.main.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.4192F, -0.9729F, 0.3738F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 53, 0, 0.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-2.4697F, -0.9204F, -7.5299F);
        this.main.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3009F, -0.7013F, 0.239F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 57, -0.0303F, -1.0F, 0.0155F, 2, 1, 2, 0.0F, true));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.487F, -1.4194F, -7.3616F);
        this.main.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1365F, -0.758F, -0.1352F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 58, 0.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-6.4865F, -1.5978F, -4.3663F);
        this.main.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.1992F, -1.0292F, -0.2035F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 53, 6, 0.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(2.4697F, -0.9204F, -7.5299F);
        this.main.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.3009F, 0.7013F, -0.239F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 24, 57, -1.9697F, -1.0F, 0.0155F, 2, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(6.4637F, -0.7945F, -4.4577F);
        this.main.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.4192F, 0.9729F, -0.3738F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 0, -2.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.0303F, -1.9149F, -7.4254F);
        this.main.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1047F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 50, 23, -2.4697F, 0.0F, 0.0155F, 5, 1, 3, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0303F, -2.5642F, -4.4965F);
        this.main.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 59, -1.7304F, -0.05F, -2.2845F, 1, 1, 1, 0.0F, true));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 33, 59, 0.6696F, -0.05F, -2.2845F, 1, 1, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 48, 36, -2.5303F, 0.0F, -2.9845F, 5, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.487F, -1.4194F, -7.3616F);
        this.main.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1365F, 0.758F, 0.1352F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 58, -3.0F, -0.5F, 0.0F, 3, 1, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(6.4865F, -1.5978F, -4.3663F);
        this.main.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1992F, 1.0292F, 0.2035F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 53, 6, -2.0F, -0.5F, -4.0F, 2, 1, 4, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-0.5303F, -2.5642F, -4.4965F);
        this.main.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 22, -4.4696F, 0.0F, 0.0155F, 10, 1, 5, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -1.4024F, 0.1757F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 27, 29, -3.5F, -1.2618F, -1.1722F, 7, 1, 5, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 19, 37, 1.675F, -1.4368F, 0.4028F, 0, 1, 3, 0.0F, false));
        this.tail.cubeList.add(new ModelBox(tail, 19, 37, -1.675F, -1.4368F, 0.4028F, 0, 1, 3, 0.0F, true));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 1.4882F, -1.1722F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0218F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 29, -4.0F, -2.0F, 0.025F, 8, 2, 5, 0.0F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1716F, 3.3419F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 19, 43, -2.5F, -1.0152F, -0.0141F, 5, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 57, 1.65F, -1.2152F, -0.0391F, 0, 1, 4, 0.0F, false));
        this.tail2.cubeList.add(new ModelBox(tail2, 15, 57, -1.65F, -1.2152F, -0.0391F, 0, 1, 4, 0.0F, true));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 1.5098F, -0.0141F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0218F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 27, 36, -3.0F, -1.975F, 0.05F, 6, 2, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.0412F, 3.5207F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 37, -1.5F, -0.9088F, -0.0957F, 3, 1, 6, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.4662F, -0.0207F);
        this.tail3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0305F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 33, 14, -2.0F, -2.0F, 0.0F, 4, 2, 6, -0.003F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-1.475F, -0.6338F, 2.8543F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.0218F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 49, 51, 0.075F, -0.5F, -3.0F, 0, 1, 6, 0.0F, true));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(1.475F, -0.6338F, 2.8543F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, -0.0218F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 49, 51, -0.075F, -0.5F, -3.0F, 0, 1, 6, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(1.0196F, 1.3175F, 2.9793F);
        this.tail3.addChild(backLeftFin);
        this.setRotateAngle(backLeftFin, 0.0354F, -0.1744F, 0.1247F);
        this.backLeftFin.cubeList.add(new ModelBox(backLeftFin, 0, 53, 0.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-1.0196F, 1.3175F, 2.9793F);
        this.tail3.addChild(backRightFin);
        this.setRotateAngle(backRightFin, 0.0354F, 0.1744F, -0.1247F);
        this.backRightFin.cubeList.add(new ModelBox(backRightFin, 0, 53, -3.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, true));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, 0.0338F, 5.3983F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 38, 43, -1.5F, -0.8677F, 0.081F, 3, 2, 5, -0.006F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 59, 45, 0.0F, -1.1677F, 3.256F, 0, 1, 1, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(-1.25F, -0.6677F, -0.244F);
        this.tail4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, 0.0873F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 55, 41, 0.0F, -0.5F, 0.25F, 0, 1, 5, 0.0F, true));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(1.25F, -0.6677F, -0.244F);
        this.tail4.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.0873F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 41, 0.0F, -0.5F, 0.25F, 0, 1, 5, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -0.8677F, 1.581F);
        this.tail4.addChild(cube_r23);
        this.setRotateAngle(cube_r23, -0.48F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 11, 58, 0.0F, -1.4F, -0.3F, 0, 2, 1, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.1323F, 4.419F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 0, 45, -1.0F, -0.6853F, 0.162F, 2, 1, 6, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 54, 29, 0.0F, -0.9853F, 0.662F, 0, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, 1.1147F, 0.162F);
        this.tail5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0436F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 17, 49, -1.0F, -1.0F, 0.05F, 2, 1, 6, -0.003F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(-0.675F, -0.4853F, 3.162F);
        this.tail5.addChild(cube_r25);
        this.setRotateAngle(cube_r25, 0.0F, 0.0873F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 52, 28, 0.15F, -0.5F, -3.0F, 0, 1, 6, 0.0F, true));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(0.675F, -0.4853F, 3.162F);
        this.tail5.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, -0.0873F, 0.0F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 52, 28, -0.15F, -0.5F, -3.0F, 0, 1, 6, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, -0.2968F, 5.6506F);
        this.tail5.addChild(tail6);


        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(0.0F, 0.2615F, 0.0114F);
        this.tail6.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0873F, 0.0F, 0.0F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 34, 51, -0.5F, -0.6F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -0.1885F, 2.0114F);
        this.tail6.addChild(cube_r28);
        this.setRotateAngle(cube_r28, 0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 29, 0.0F, -0.625F, -1.1F, 0, 1, 5, 0.0F, false));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(4.7206F, -0.561F, -2.0996F);
        this.main.addChild(frontLeftFin);
        this.setRotateAngle(frontLeftFin, 0.0F, 0.0F, 0.0436F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(1.5F, 0.0F, -1.75F);
        this.frontLeftFin.addChild(cube_r29);
        this.setRotateAngle(cube_r29, 0.0077F, -0.1727F, 0.0151F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 0, -5.0F, 0.0F, 0.0F, 13, 0, 13, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-4.7206F, -0.561F, -2.0996F);
        this.main.addChild(frontRightFin);
        this.setRotateAngle(frontRightFin, 0.0F, 0.0F, -0.0436F);


        this.cube_r30 = new AdvancedModelRenderer(this);
        this.cube_r30.setRotationPoint(-1.5F, 0.0F, -1.75F);
        this.frontRightFin.addChild(cube_r30);
        this.setRotateAngle(cube_r30, 0.0077F, 0.1727F, -0.0151F);
        this.cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 0, -8.0F, 0.0F, 0.0F, 13, 0, 13, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.0126F, -3.7383F);
        this.main.addChild(jaw);
        this.jaw.cubeList.add(new ModelBox(jaw, 31, 23, -2.5F, -0.9645F, -3.9982F, 5, 1, 4, -0.003F, false));

        this.cube_r31 = new AdvancedModelRenderer(this);
        this.cube_r31.setRotationPoint(-2.5F, -0.4645F, -3.9982F);
        this.jaw.addChild(cube_r31);
        this.setRotateAngle(cube_r31, 0.0F, -0.5236F, 0.0F);
        this.cube_r31.cubeList.add(new ModelBox(cube_r31, 54, 12, 0.0F, -0.5F, 0.0F, 2, 1, 4, -0.006F, true));

        this.cube_r32 = new AdvancedModelRenderer(this);
        this.cube_r32.setRotationPoint(2.5F, -0.4645F, -3.9982F);
        this.jaw.addChild(cube_r32);
        this.setRotateAngle(cube_r32, 0.0F, 0.5236F, 0.0F);
        this.cube_r32.cubeList.add(new ModelBox(cube_r32, 54, 12, -2.0F, -0.5F, 0.0F, 2, 1, 4, -0.006F, false));
        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }

    public void renderStaticWall(float f) {
        this.main.rotateAngleX = (float) Math.toRadians(90);
        this.main.rotateAngleZ = (float) Math.toRadians(90);
        this.main.offsetX = -0.13F;
        this.main.offsetY = -0.22F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {

        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = 0.03F;
        this.main.offsetX = -0.13F;
        this.main.offsetZ = 0.07F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -0.8F;
        this.main.offsetX = 0.9F;
        this.main.offsetZ = 2.0F;
        this.main.rotateAngleY = (float)Math.toRadians(120);
        this.main.rotateAngleX = (float)Math.toRadians(1);
        this.main.rotateAngleZ = (float)Math.toRadians(0);
        this.main.scaleChildren = true;
        float scaler = 1.8F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.body.offsetY = 1.05F;

        EntityPrehistoricFloraGemuendina ee = (EntityPrehistoricFloraGemuendina) e;

        //System.err.println("swimmingTicks = " + ee.swimmingTicks);
        //System.err.println("buriedTicks = " + buriedTicks);

        float speedmodifier = 1;
        float swaymodifier = 1;

        if (ee.getBuriedTick() > 0 || ee.getBuried() || ee.getSwimCount() <= 0) {
            if (ee.getBuriedTick() > 0) {
                speedmodifier = 6F;
            }
            if (ee.getBuried() && (ee.getBuriedTick() <= 0)) {
                this.main.offsetY = 1.13F - 1.05F;
                this.main.rotateAngleX = -(float) Math.toRadians(30);
                swaymodifier = 0;
            }
            else {
                this.main.offsetY = 1.05F - 1.05F + (0.08F * (float)((double)ee.getBuriedTick()/60D));
                this.main.rotateAngleX = -(float) Math.toRadians(30 * ((double)ee.getBuriedTick()/60D));
            }
        }
        else {
            this.main.offsetY = 1.05F - 1.05F;
        }

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }


        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F * speedmodifier;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F * swaymodifier, true, 0, 0, f2, 1);
            //this.walk(jaw, (float) (speed * 0.75), -0.5F, true, 0, 0, f2, 1);
            this.flap(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(frontLeftFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(frontRightFin, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(frontRightFin, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.main.offsetY = 1.0F - 1.05F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
