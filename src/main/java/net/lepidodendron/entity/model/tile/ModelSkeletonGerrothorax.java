package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonGerrothorax extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer neck;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer gillR;
    private final AdvancedModelRenderer gillL;
    private final AdvancedModelRenderer gillR2;
    private final AdvancedModelRenderer gillL2;
    private final AdvancedModelRenderer gillR3;
    private final AdvancedModelRenderer gillL3;
    private final AdvancedModelRenderer lowerjaw;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer upperjaw;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer forelegL;
    private final AdvancedModelRenderer forelegL2;
    private final AdvancedModelRenderer forelegL3;
    private final AdvancedModelRenderer forelegL4;
    private final AdvancedModelRenderer forelegL5;
    private final AdvancedModelRenderer forelegL6;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;
    private final AdvancedModelRenderer cube_r25;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r26;
    private final AdvancedModelRenderer cube_r27;
    private final AdvancedModelRenderer cube_r28;
    private final AdvancedModelRenderer hindlegL;
    private final AdvancedModelRenderer hindlegL2;
    private final AdvancedModelRenderer hindlegL3;
    private final AdvancedModelRenderer hindlegL4;
    private final AdvancedModelRenderer hindlegL5;
    private final AdvancedModelRenderer hindlegL6;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r29;
    private final AdvancedModelRenderer body5;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer body7;

    public ModelSkeletonGerrothorax() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, 14.75F, 1.0F);
        this.setRotateAngle(body, 0.0F, 0.0F, -0.5236F);
        this.body.cubeList.add(new ModelBox(body, 0, 17, -1.5F, 0.966F, -13.251F, 2, 0, 9, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 38, -0.5F, -1.034F, -3.05F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 37, 40, -0.5F, -1.034F, -5.05F, 2, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 24, -0.5F, -1.034F, -7.05F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 36, -0.5F, -1.034F, -9.05F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 20, 36, -3.5F, -1.034F, -9.05F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 36, 24, -3.5F, -1.034F, -7.05F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 37, 40, -2.5F, -1.034F, -5.05F, 2, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 37, 17, -0.5F, -1.034F, -1.05F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 37, 13, -0.5F, -1.034F, 0.95F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 36, 26, -0.5F, -1.034F, 2.95F, 3, 0, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 17, 38, -3.5F, -1.034F, -3.05F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 37, 17, -3.5F, -1.034F, -1.05F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 36, 26, -3.5F, -1.034F, 2.95F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 37, 13, -3.5F, -1.034F, 0.95F, 3, 0, 1, 0.0F, true));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -1.0F, -1.444F, -9.25F, 1, 1, 15, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-5.2F, -0.334F, -10.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0F, 2.5307F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 33, -1.9785F, 0.0561F, 2.749F, 2, 0, 3, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.5F, 0.866F, -10.0F);
        this.body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.3491F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 17, -3.9F, 0.1F, -1.251F, 4, 0, 7, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(4.2F, -0.334F, -10.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -2.5307F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 10, 33, -0.0215F, 0.0561F, 2.749F, 2, 0, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, 0.866F, -10.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, -0.3491F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 17, -0.1F, 0.1F, -1.251F, 4, 0, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-1.0F, -1.034F, 3.0F);
        this.body.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.0F, -0.48F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 41, -4.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 9, 37, -5.2175F, -1.1544F, -2.05F, 3, 0, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 15, -5.2175F, -1.1544F, -4.05F, 3, 0, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 30, -5.2175F, -1.1544F, -6.05F, 3, 0, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 42, -3.2175F, -1.1544F, -10.05F, 1, 0, 1, 0.0F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 42, -3.2175F, -1.1544F, -12.05F, 1, 0, 1, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, -1.034F, 3.0F);
        this.body.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.0F, 0.48F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 41, 2.2175F, -1.1544F, -0.05F, 2, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 37, 2.2175F, -1.1544F, -2.05F, 3, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 15, 2.2175F, -1.1544F, -4.05F, 3, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 42, 2.2175F, -1.1544F, -12.05F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 42, 2.2175F, -1.1544F, -10.05F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 37, 30, 2.2175F, -1.1544F, -6.05F, 3, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.5F, -1.034F, -5.0F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, -0.2618F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 34, -1.987F, 0.0383F, -0.05F, 2, 0, 1, 0.0F, true));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(1.5F, -1.034F, -5.0F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, 0.2618F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 40, 34, -0.013F, 0.0383F, -0.05F, 2, 0, 1, 0.0F, false));

        this.neck = new AdvancedModelRenderer(this);
        this.neck.setRotationPoint(-0.5F, -0.134F, -9.0F);
        this.body.addChild(neck);
        this.setRotateAngle(neck, -0.2618F, -0.1745F, 0.0F);
        this.neck.cubeList.add(new ModelBox(neck, 42, 0, 0.0F, -0.8F, -2.05F, 2, 0, 1, 0.0F, false));
        this.neck.cubeList.add(new ModelBox(neck, 42, 0, -2.0F, -0.8F, -2.05F, 2, 0, 1, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.0F, -3.5F);
        this.neck.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0785F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 30, -0.5F, 0.0F, 0.25F, 1, 1, 4, 0.001F, false));

        this.gillR = new AdvancedModelRenderer(this);
        this.gillR.setRotationPoint(-6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillR);
        this.setRotateAngle(gillR, 0.1745F, 0.0873F, 0.1745F);


        this.gillL = new AdvancedModelRenderer(this);
        this.gillL.setRotationPoint(6.0F, -0.5F, -3.15F);
        this.neck.addChild(gillL);
        this.setRotateAngle(gillL, 0.1745F, -0.0873F, -0.1745F);


        this.gillR2 = new AdvancedModelRenderer(this);
        this.gillR2.setRotationPoint(-6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillR2);
        this.setRotateAngle(gillR2, 0.1309F, 0.1309F, 0.1309F);


        this.gillL2 = new AdvancedModelRenderer(this);
        this.gillL2.setRotationPoint(6.0F, -0.25F, -2.4F);
        this.neck.addChild(gillL2);
        this.setRotateAngle(gillL2, 0.1309F, -0.1309F, -0.1309F);


        this.gillR3 = new AdvancedModelRenderer(this);
        this.gillR3.setRotationPoint(-6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillR3);
        this.setRotateAngle(gillR3, 0.0873F, 0.2618F, 0.0873F);


        this.gillL3 = new AdvancedModelRenderer(this);
        this.gillL3.setRotationPoint(6.0F, 0.0F, -1.65F);
        this.neck.addChild(gillL3);
        this.setRotateAngle(gillL3, 0.0873F, -0.2618F, -0.0873F);


        this.lowerjaw = new AdvancedModelRenderer(this);
        this.lowerjaw.setRotationPoint(0.0F, 0.125F, -3.0F);
        this.neck.addChild(lowerjaw);
        this.setRotateAngle(lowerjaw, 0.3491F, 0.0F, 0.0F);
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 30, 21, -2.5F, -0.085F, -5.0F, 5, 1, 1, 0.0F, false));
        this.lowerjaw.cubeList.add(new ModelBox(lowerjaw, 41, 19, -1.5F, -0.585F, -4.75F, 3, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.5F, 0.925F, -5.0F);
        this.lowerjaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.8639F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 8, -6.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.0F, 0.875F, 2.0F);
        this.lowerjaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, 0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 11, 0.1F, 0.1F, -5.251F, 1, 0, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 7, 27, -0.9F, 0.1F, -5.251F, 1, 0, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 30, 40, -2.9F, -0.1F, -3.251F, 2, 0, 1, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 40, 32, -2.9F, 0.3F, -3.251F, 2, 0, 1, 0.0F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(1.0F, 0.875F, 2.0F);
        this.lowerjaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 40, 0.9F, -0.1F, -3.251F, 2, 0, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 40, 32, 0.9F, 0.3F, -3.251F, 2, 0, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 11, -1.1F, 0.1F, -5.251F, 1, 0, 1, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 7, 27, -0.1F, 0.1F, -5.251F, 1, 0, 2, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-2.5F, 1.175F, -5.0F);
        this.lowerjaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.8727F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 35, 38, -4.5F, -1.75F, 0.35F, 4, 1, 0, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(2.5F, 1.175F, -5.0F);
        this.lowerjaw.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, -0.8727F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 39, 0.5F, -1.75F, 0.35F, 4, 1, 0, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(2.5F, 0.925F, -5.0F);
        this.lowerjaw.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, -0.8639F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 5, 0.0F, -1.0F, 0.0F, 6, 1, 1, 0.0F, false));

        this.upperjaw = new AdvancedModelRenderer(this);
        this.upperjaw.setRotationPoint(0.0F, 0.025F, -3.0F);
        this.neck.addChild(upperjaw);
        this.setRotateAngle(upperjaw, -0.3927F, 0.0F, 0.0F);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.5F, -1.025F, -2.6F);
        this.upperjaw.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0435F, 0.0038F, 0.0001F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 35, 0, -1.9924F, -0.1759F, -1.0076F, 2, 1, 2, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-2.5F, -1.025F, -2.6F);
        this.upperjaw.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0435F, -0.0038F, -0.0001F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 22, -0.0076F, -0.1759F, -1.0076F, 2, 1, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.upperjaw.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0436F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 36, -1.5F, -0.5468F, 0.1346F, 3, 1, 0, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 33, -2.5F, -1.075F, 0.0F, 5, 1, 1, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 0, -3.0F, -1.075F, 1.0F, 6, 1, 4, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(0.0F, 0.025F, -5.0F);
        this.upperjaw.addChild(bone);
        this.setRotateAngle(bone, 0.0436F, 0.0F, 0.0F);


        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-2.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.8639F, -0.0436F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 18, 6, -6.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(-2.5F, -0.35F, 0.0F);
        this.bone.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.0F, 0.8727F, -0.0436F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 4, -4.4054F, -0.2215F, 0.1832F, 4, 1, 0, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(2.5F, -0.35F, 0.0F);
        this.bone.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0F, -0.8727F, 0.0436F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 39, 28, 0.4054F, -0.2215F, 0.1832F, 4, 1, 0, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(2.5F, 0.0F, 0.0F);
        this.bone.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.0F, -0.8639F, 0.0436F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 20, 25, 0.0F, -1.0F, 0.0F, 6, 1, 3, 0.0F, false));

        this.forelegL = new AdvancedModelRenderer(this);
        this.forelegL.setRotationPoint(4.1F, 0.116F, -7.7F);
        this.body.addChild(forelegL);
        this.setRotateAngle(forelegL, 0.3927F, -1.1781F, 0.1745F);
        this.forelegL.cubeList.add(new ModelBox(forelegL, 32, 35, -0.5924F, -0.6563F, -0.489F, 3, 1, 1, 0.0F, false));

        this.forelegL2 = new AdvancedModelRenderer(this);
        this.forelegL2.setRotationPoint(2.4076F, -0.4063F, 0.511F);
        this.forelegL.addChild(forelegL2);
        this.setRotateAngle(forelegL2, 0.3927F, 0.4363F, 0.0F);
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 25, 30, 0.0F, -0.24F, -0.99F, 2, 1, 1, 0.0F, false));
        this.forelegL2.cubeList.add(new ModelBox(forelegL2, 14, 20, 0.0F, -0.24F, -2.24F, 2, 1, 1, 0.0F, false));

        this.forelegL3 = new AdvancedModelRenderer(this);
        this.forelegL3.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.forelegL2.addChild(forelegL3);
        this.setRotateAngle(forelegL3, -0.1384F, 0.3215F, -0.5897F);
        this.forelegL3.cubeList.add(new ModelBox(forelegL3, 29, 30, 0.0F, -0.23F, -1.5F, 2, 1, 3, 0.0F, false));

        this.forelegL4 = new AdvancedModelRenderer(this);
        this.forelegL4.setRotationPoint(-5.1F, 0.116F, -7.7F);
        this.body.addChild(forelegL4);
        this.setRotateAngle(forelegL4, 0.9163F, -0.3927F, -0.1745F);
        this.forelegL4.cubeList.add(new ModelBox(forelegL4, 32, 35, -2.4076F, -0.6563F, -0.489F, 3, 1, 1, 0.0F, true));

        this.forelegL5 = new AdvancedModelRenderer(this);
        this.forelegL5.setRotationPoint(-2.4076F, -0.4063F, 0.511F);
        this.forelegL4.addChild(forelegL5);
        this.setRotateAngle(forelegL5, -0.1332F, -0.2261F, 0.5387F);
        this.forelegL5.cubeList.add(new ModelBox(forelegL5, 25, 30, -2.0F, -0.24F, -0.99F, 2, 1, 1, 0.0F, true));
        this.forelegL5.cubeList.add(new ModelBox(forelegL5, 14, 20, -2.0F, -0.24F, -2.24F, 2, 1, 1, 0.0F, true));

        this.forelegL6 = new AdvancedModelRenderer(this);
        this.forelegL6.setRotationPoint(-2.0F, 0.0F, -1.0F);
        this.forelegL5.addChild(forelegL6);
        this.setRotateAngle(forelegL6, 0.2298F, -0.2651F, -0.5544F);
        this.forelegL6.cubeList.add(new ModelBox(forelegL6, 29, 30, -2.0F, -0.23F, -1.5F, 2, 1, 3, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(-0.5F, -0.134F, 5.75F);
        this.body.addChild(body2);
        this.setRotateAngle(body2, 0.0873F, 0.0F, 0.0F);
        this.body2.cubeList.add(new ModelBox(body2, 34, 6, 0.0F, -0.9F, -0.8F, 3, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 40, 8, 0.0F, -0.9F, 1.2F, 2, 0, 1, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 34, 6, -3.0F, -0.9F, -0.8F, 3, 0, 1, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 40, 8, -2.0F, -0.9F, 1.2F, 2, 0, 1, 0.0F, true));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(-0.5F, -0.9F, 1.25F);
        this.body2.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.0F, 0.0F, -0.48F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 16, 40, -3.2175F, -0.6544F, -0.05F, 2, 0, 1, 0.0F, true));
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 23, 40, -4.2175F, -1.1544F, -2.05F, 2, 0, 1, 0.0F, true));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.5F, -0.9F, 1.25F);
        this.body2.addChild(cube_r24);
        this.setRotateAngle(cube_r24, 0.0F, 0.0F, 0.48F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 16, 40, 1.2175F, -0.6544F, -0.05F, 2, 0, 1, 0.0F, false));
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 23, 40, 2.2175F, -1.1544F, -2.05F, 2, 0, 1, 0.0F, false));

        this.cube_r25 = new AdvancedModelRenderer(this);
        this.cube_r25.setRotationPoint(0.0F, -1.0F, -12.25F);
        this.body2.addChild(cube_r25);
        this.setRotateAngle(cube_r25, -0.0611F, 0.0F, 0.0F);
        this.cube_r25.cubeList.add(new ModelBox(cube_r25, 30, 15, -0.5F, -1.025F, 11.15F, 1, 1, 4, 0.001F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.1F, 3.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 18, 11, -3.0F, 0.88F, -1.0F, 6, 0, 3, 0.0F, false));

        this.cube_r26 = new AdvancedModelRenderer(this);
        this.cube_r26.setRotationPoint(-3.0F, 1.0F, -1.05F);
        this.body3.addChild(cube_r26);
        this.setRotateAngle(cube_r26, 0.0F, 0.0F, 2.3562F);
        this.cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 11, -3.0F, -0.12F, 0.05F, 3, 0, 3, 0.0F, true));

        this.cube_r27 = new AdvancedModelRenderer(this);
        this.cube_r27.setRotationPoint(3.0F, 1.0F, -1.05F);
        this.body3.addChild(cube_r27);
        this.setRotateAngle(cube_r27, 0.0F, 0.0F, -2.3562F);
        this.cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 11, 0.0F, -0.12F, 0.05F, 3, 0, 3, 0.0F, false));

        this.cube_r28 = new AdvancedModelRenderer(this);
        this.cube_r28.setRotationPoint(0.0F, -1.0F, -0.75F);
        this.body3.addChild(cube_r28);
        this.setRotateAngle(cube_r28, -0.0873F, 0.0F, 0.0F);
        this.cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 35, -0.5F, -0.22F, -0.25F, 1, 1, 3, 0.0F, false));

        this.hindlegL = new AdvancedModelRenderer(this);
        this.hindlegL.setRotationPoint(3.0F, 0.25F, 0.9F);
        this.body3.addChild(hindlegL);
        this.setRotateAngle(hindlegL, 0.7575F, 0.5041F, 0.3586F);
        this.hindlegL.cubeList.add(new ModelBox(hindlegL, 0, 36, -0.4298F, -0.5129F, -0.4983F, 3, 1, 1, 0.0F, false));

        this.hindlegL2 = new AdvancedModelRenderer(this);
        this.hindlegL2.setRotationPoint(2.5702F, -0.2629F, -0.8983F);
        this.hindlegL.addChild(hindlegL2);
        this.setRotateAngle(hindlegL2, 0.0303F, -0.4253F, 0.2399F);
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 9, 39, 0.0F, -0.24F, 1.01F, 2, 1, 1, 0.0F, false));
        this.hindlegL2.cubeList.add(new ModelBox(hindlegL2, 14, 17, 0.0F, -0.24F, -0.39F, 2, 1, 1, 0.0F, false));

        this.hindlegL3 = new AdvancedModelRenderer(this);
        this.hindlegL3.setRotationPoint(2.0F, 0.0F, 1.0F);
        this.hindlegL2.addChild(hindlegL3);
        this.setRotateAngle(hindlegL3, 0.039F, 0.2625F, 0.2291F);
        this.hindlegL3.cubeList.add(new ModelBox(hindlegL3, 0, 0, 0.0F, -0.23F, -1.5F, 3, 1, 3, 0.0F, false));

        this.hindlegL4 = new AdvancedModelRenderer(this);
        this.hindlegL4.setRotationPoint(-3.0F, 0.25F, 0.9F);
        this.body3.addChild(hindlegL4);
        this.setRotateAngle(hindlegL4, -0.1309F, 0.8727F, -0.1745F);
        this.hindlegL4.cubeList.add(new ModelBox(hindlegL4, 0, 36, -2.5702F, -0.5129F, -0.4983F, 3, 1, 1, 0.0F, true));

        this.hindlegL5 = new AdvancedModelRenderer(this);
        this.hindlegL5.setRotationPoint(-2.5702F, -0.2629F, -0.8983F);
        this.hindlegL4.addChild(hindlegL5);
        this.setRotateAngle(hindlegL5, 0.0F, 0.4363F, 0.0F);
        this.hindlegL5.cubeList.add(new ModelBox(hindlegL5, 9, 39, -2.0F, -0.24F, 1.01F, 2, 1, 1, 0.0F, true));
        this.hindlegL5.cubeList.add(new ModelBox(hindlegL5, 14, 17, -2.0F, -0.24F, -0.39F, 2, 1, 1, 0.0F, true));

        this.hindlegL6 = new AdvancedModelRenderer(this);
        this.hindlegL6.setRotationPoint(-2.0F, 0.0F, 1.0F);
        this.hindlegL5.addChild(hindlegL6);
        this.setRotateAngle(hindlegL6, -0.0436F, -0.2618F, 0.0873F);
        this.hindlegL6.cubeList.add(new ModelBox(hindlegL6, 0, 0, -3.0F, -0.23F, -1.5F, 3, 1, 3, 0.0F, true));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.setRotateAngle(body4, 0.1372F, 0.3027F, 0.0411F);


        this.cube_r29 = new AdvancedModelRenderer(this);
        this.cube_r29.setRotationPoint(0.0F, -0.6F, -0.75F);
        this.body4.addChild(cube_r29);
        this.setRotateAngle(cube_r29, -0.0436F, 0.0F, 0.0F);
        this.cube_r29.cubeList.add(new ModelBox(cube_r29, 34, 8, -0.5F, -0.49F, -0.25F, 1, 1, 3, 0.0F, false));

        this.body5 = new AdvancedModelRenderer(this);
        this.body5.setRotationPoint(0.0F, -0.5F, 1.2F);
        this.body4.addChild(body5);
        this.setRotateAngle(body5, -0.0002F, 0.0872F, -0.0038F);
        this.body5.cubeList.add(new ModelBox(body5, 11, 27, -0.5F, -0.48F, -0.2F, 1, 1, 4, -0.001F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.body5.addChild(body6);
        this.setRotateAngle(body6, 0.0436F, 0.1745F, 0.0F);
        this.body6.cubeList.add(new ModelBox(body6, 0, 27, -0.5F, -0.47F, -0.2F, 1, 1, 4, 0.0F, false));

        this.body7 = new AdvancedModelRenderer(this);
        this.body7.setRotationPoint(0.0F, 0.5F, 3.8F);
        this.body6.addChild(body7);
        this.setRotateAngle(body7, 0.0436F, -0.0436F, 0.0F);
        this.body7.cubeList.add(new ModelBox(body7, 0, 17, -0.5F, -0.96F, -1.0F, 1, 1, 3, -0.001F, false));
        this.body7.cubeList.add(new ModelBox(body7, 10, 0, -0.5F, -1.0F, 2.0F, 1, 1, 1, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.body.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
