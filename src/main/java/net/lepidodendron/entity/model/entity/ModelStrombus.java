package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraStrombus;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelStrombus extends AdvancedModelBase {
    private final AdvancedModelRenderer snail;
    private final AdvancedModelRenderer foot;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer leg;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer operculum;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer nose;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer lefteyestalk;
    private final AdvancedModelRenderer righteyestalk;
    private final AdvancedModelRenderer shell;
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
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;

    public ModelStrombus() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.snail = new AdvancedModelRenderer(this);
        this.snail.setRotationPoint(0.0F, 24.0F, -3.25F);
        this.setRotateAngle(snail, 0.2182F, 0.0F, 0.0F);


        this.foot = new AdvancedModelRenderer(this);
        this.foot.setRotationPoint(1.0F, -1.0406F, -0.0229F);
        this.snail.addChild(foot);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -0.5F, 2.25F);
        this.foot.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 19, -1.5F, -1.25F, -1.5F, 2, 2, 3, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.0F, 1.0F, -0.25F);
        this.foot.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 4, -1.0F, -2.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 9, -1.5F, -1.0F, -1.5F, 3, 1, 3, 0.0F, false));

        this.leg = new AdvancedModelRenderer(this);
        this.leg.setRotationPoint(-1.0F, 0.2231F, 1.5504F);
        this.foot.addChild(leg);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-1.0F, 1.2269F, 0.5996F);
        this.leg.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 21, 5, 0.0F, -1.0F, -2.0F, 2, 1, 3, -0.01F, false));

        this.operculum = new AdvancedModelRenderer(this);
        this.operculum.setRotationPoint(0.0F, 1.525F, 1.55F);
        this.leg.addChild(operculum);


        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.operculum.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.2182F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 4, 4, -0.5F, 0.0014F, -1.996F, 1, 0, 2, 0.0F, false));

        this.nose = new AdvancedModelRenderer(this);
        this.nose.setRotationPoint(-1.0F, -1.0F, 1.0F);
        this.foot.addChild(nose);
        this.setRotateAngle(nose, 0.4363F, 0.0F, 0.0F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.5412F, -0.5566F);
        this.nose.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 21, 0, -1.5F, -0.7745F, -3.7153F, 1, 1, 4, 0.0F, false));

        this.lefteyestalk = new AdvancedModelRenderer(this);
        this.lefteyestalk.setRotationPoint(-0.25F, -0.5F, 0.5F);
        this.foot.addChild(lefteyestalk);
        this.setRotateAngle(lefteyestalk, -0.1309F, 0.0F, 0.0F);
        this.lefteyestalk.cubeList.add(new ModelBox(lefteyestalk, 8, 14, 0.0F, -0.5F, -4.25F, 0, 1, 5, 0.0F, false));

        this.righteyestalk = new AdvancedModelRenderer(this);
        this.righteyestalk.setRotationPoint(-1.75F, -0.5F, 0.5F);
        this.foot.addChild(righteyestalk);
        this.setRotateAngle(righteyestalk, -0.1309F, 0.0F, 0.0F);
        this.righteyestalk.cubeList.add(new ModelBox(righteyestalk, 12, 15, 0.0F, -0.5F, -4.25F, 0, 1, 5, 0.0F, false));

        this.shell = new AdvancedModelRenderer(this);
        this.shell.setRotationPoint(-0.748F, -1.2357F, 1.2981F);
        this.foot.addChild(shell);
        this.setRotateAngle(shell, -0.1745F, 0.0F, 0.0F);
        this.shell.cubeList.add(new ModelBox(shell, 0, 9, -1.827F, -2.7852F, 0.4063F, 4, 4, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 11, 13, -1.327F, -1.7852F, -2.5937F, 3, 3, 3, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 18, 24, -0.827F, -0.7852F, -4.5937F, 2, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 0, 14, 1.173F, 0.2148F, -4.3437F, 0, 1, 2, 0.0F, false));
        this.shell.cubeList.add(new ModelBox(shell, 11, 9, -0.802F, -0.2852F, -4.3437F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.173F, -0.7852F, 4.4063F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.1745F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 15, 26, -0.25F, -0.5F, 0.5F, 1, 1, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 9, -1.25F, -0.5F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 10, 0.75F, -0.5F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 9, -0.25F, 0.5F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 11, 10, -0.25F, -1.5F, 0.5F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 25, -0.75F, -1.0F, -0.25F, 2, 2, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 18, -1.75F, -0.5F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 19, 1.25F, -0.5F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 15, -0.25F, 1.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 20, 19, -0.25F, -2.0F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.25F, -1.5F, -1.0F, 3, 3, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.4788F, -1.7852F, 5.0289F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.124F, 0.1231F, -0.7931F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 4, -1.5F, 0.875F, -0.025F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 5, 0.5F, 0.875F, -0.025F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 0, -0.5F, 1.875F, -0.025F, 1, 1, 0, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 7, 7, -0.5F, -0.125F, -0.025F, 1, 1, 0, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.173F, -0.7852F, 4.4063F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.124F, 0.1231F, -0.7931F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 16, -0.35F, 1.325F, -0.25F, 1, 1, 0, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 17, -0.35F, -2.0F, -0.25F, 1, 1, 0, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(1.559F, -1.9319F, 3.908F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.124F, 0.1231F, 0.7931F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 9, -0.5F, 2.85F, 0.0F, 1, 1, 0, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 15, 10, -0.5F, -0.5F, 0.0F, 1, 1, 0, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-1.327F, -0.2852F, 3.4063F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.5236F, -0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 16, -3.2321F, -0.5F, -5.5981F, 2, 1, 4, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-1.327F, -0.2852F, 3.4063F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 1.1781F, -0.3491F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 15, -0.7654F, -0.5F, -1.8478F, 2, 1, 2, -0.01F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-1.327F, -0.2852F, 3.4063F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, -0.3491F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -4.25F, 0.25F, -7.9F, 6, 0, 9, 0.0F, false));
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 21, -2.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(-1.327F, -0.2852F, 3.4063F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, 0.5236F, -0.3491F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 7, -3.3481F, -0.5F, -1.799F, 3, 1, 1, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-2.4502F, 0.2836F, 3.8831F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.5236F, 0.0F, -0.3491F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 18, 13, -2.0F, 0.0F, -0.75F, 4, 0, 2, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(-1.4486F, -3.2852F, 3.1951F);
        this.shell.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.102F, 0.1932F, -0.4899F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 17, -1.0F, -0.25F, -0.5F, 1, 2, 1, -0.01F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(2.4566F, -1.7852F, 2.3294F);
        this.shell.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.0479F, 0.2129F, -0.2233F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 9, -0.525F, -0.5F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(2.4566F, 0.2148F, 2.3294F);
        this.shell.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0846F, 0.2013F, 0.4013F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 26, -0.5F, 0.0F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-1.4486F, 1.2148F, 3.1951F);
        this.shell.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.0757F, 0.2048F, 0.3568F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 21, 0, -0.5F, -0.7F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.0924F, -0.7952F, 2.3823F);
        this.shell.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.0F, 0.2182F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 21, 2, -0.75F, 1.51F, 0.0F, 1, 1, 1, -0.01F, false));
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 21, -2.0F, -1.99F, 0.5F, 4, 4, 1, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.9921F, 1.2148F, 2.654F);
        this.shell.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.0573F, 0.2106F, -0.2679F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 24, 24, -0.5F, -0.7F, -0.5F, 1, 1, 1, -0.01F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.504F, -3.2852F, 2.7622F);
        this.shell.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.0385F, 0.2148F, 0.1787F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 4, 26, -0.25F, -0.4F, -0.5F, 1, 1, 1, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        //this.body.render(f5 * 0.2F);
        snail.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();
        //this.snail.offsetY = 0.83F;


        this.swing(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.swing(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);
        this.flap(lefteyestalk, 0.22F, 0.15F, false, 0, 0.15F, f2, 0.8F);
        this.flap(righteyestalk, 0.22F, 0.15F, true, 0, 0.15F, f2, 0.8F);

        this.lefteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.lefteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleZ += f3 / (180F / (float) Math.PI) * 0.5;
        this.righteyestalk.rotateAngleX += f3 / (180F / (float) Math.PI) * 0.5;
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraStrombus ee = (EntityPrehistoricFloraStrombus) entitylivingbaseIn;
        if (ee.isInWater()) {
            if (ee.getIsMoving()) {
               this.snail.offsetY = -0.2F;
                animHop(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
        }

    }

    public void animHop(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraStrombus entity = (EntityPrehistoricFloraStrombus) entitylivingbaseIn;
        int animCycle = 10;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (10D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 10D + (((tickAnim - 3D) / 2D) * (10.83D-(10D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 10.83D + (((tickAnim - 5D) / 5D) * (0D-(10.83D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(snail, snail.rotateAngleX + (float) Math.toRadians(xx), snail.rotateAngleY + (float) Math.toRadians(yy), snail.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (1.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 1.25D + (((tickAnim - 3D) / 2D) * (1.25D-(1.25D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            yy = 1.25D + (((tickAnim - 5D) / 5D) * (0D-(1.25D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.snail.offsetX = (float) Math.toRadians(xx);
        this.snail.offsetY = (float) Math.toRadians(yy);
        this.snail.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (-27.5D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 10) {
            xx = -27.5D + (((tickAnim - 5D) / 5D) * (0D-(-27.5D)));
            yy = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 5D) / 5D) * (0D-(0D)));
        }
        this.setRotateAngle(leg, leg.rotateAngleX + (float) Math.toRadians(xx), leg.rotateAngleY + (float) Math.toRadians(yy), leg.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        this.leg.offsetX = (float) Math.toRadians(xx);
        this.leg.offsetY = (float) Math.toRadians(yy);
        this.leg.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (27.5D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 27.5D + (((tickAnim - 3D) / 7D) * (0D-(27.5D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(operculum, operculum.rotateAngleX + (float) Math.toRadians(xx), operculum.rotateAngleY + (float) Math.toRadians(yy), operculum.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        this.operculum.offsetX = (float) Math.toRadians(xx);
        this.operculum.offsetY = (float) Math.toRadians(yy);
        this.operculum.offsetZ = (float) Math.toRadians(zz);


    }
}
