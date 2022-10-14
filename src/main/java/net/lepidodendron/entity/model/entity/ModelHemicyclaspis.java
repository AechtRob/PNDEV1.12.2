package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelHemicyclaspis extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
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
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer finR;
    private final AdvancedModelRenderer finL;

    public ModelHemicyclaspis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 0, 10, -2.0F, -1.05F, -9.0F, 4, 1, 8, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 33, -1.99F, -1.1F, -10.75F, 4, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0873F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 10, -1.0F, -3.1F, -0.75F, 2, 2, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 37, -1.5F, -3.105F, -5.75F, 3, 0, 5, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.0F, -3.1F, -8.75F, 4, 2, 8, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.3F, 0.1F, -0.45F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.1745F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 19, -5.0F, -1.25F, -7.25F, 4, 1, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, -0.5236F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 13, -5.8F, -1.76F, -6.5F, 1, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.5236F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 3, 4.8F, -1.76F, -6.5F, 1, 1, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.6981F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 25, -7.75F, -1.26F, -6.25F, 2, 1, 3, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 14, -1.5F, -6.2F, -7.45F, 3, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.1F, -1.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 25, 32, 5.75F, -1.26F, -6.25F, 2, 1, 3, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.3F, 0.1F, -0.45F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1745F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 18, 19, 1.0F, -1.25F, -7.25F, 4, 1, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.3F, 0.0F, -0.45F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.0436F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 29, 0, -4.75F, -1.16F, -3.0F, 4, 1, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.3F, 0.0F, -0.45F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0436F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 31, 20, 0.75F, -1.16F, -3.0F, 4, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.5672F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 27, -2.2F, -2.95F, -7.0F, 2, 1, 5, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.1F, 0.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.0F, 0.5672F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 31, 14, 0.2F, -2.95F, -7.0F, 2, 1, 5, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -1.1F, -1.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 16, 0, -1.99F, -1.0F, 0.0F, 4, 2, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 13, 19, -0.49F, -1.95F, 0.98F, 1, 1, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 9, 25, -1.49F, -1.75F, 0.01F, 3, 1, 5, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 25, 7, -1.5F, -1.0F, 0.0F, 3, 2, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 18, 32, -0.51F, -1.75F, -0.02F, 1, 1, 5, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 9, 31, -0.99F, -1.5F, -0.01F, 2, 1, 5, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, -0.1F, 4.5F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 25, 25, -1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 30, 32, -0.49F, -1.25F, -0.01F, 1, 1, 5, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 0, 0, 0.0F, -3.0F, 0.45F, 0, 2, 4, 0.0F, false));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, -1.0F, 5.0F);
        this.body3.addChild(tailfin);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 2.0F, -15.0F);
        this.tailfin.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 16, 10, -0.5F, 3.5F, 14.0F, 1, 1, 7, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 18, 0.0F, 4.5F, 14.0F, 0, 2, 7, 0.0F, false));

        this.finR = new AdvancedModelRenderer(this);
        this.finR.setRotationPoint(-3.75F, -0.5F, -2.0F);
        this.head.addChild(finR);
        this.setRotateAngle(finR, -0.0873F, -0.1745F, 0.0F);
        this.finR.cubeList.add(new ModelBox(finR, 0, 10, -0.5F, 0.0F, 1.0F, 2, 0, 3, 0.0F, false));
        this.finR.cubeList.add(new ModelBox(finR, 0, 1, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        this.finL = new AdvancedModelRenderer(this);
        this.finL.setRotationPoint(3.75F, -0.5F, -2.0F);
        this.head.addChild(finL);
        this.setRotateAngle(finL, -0.0873F, 0.1745F, 0.0F);
        this.finL.cubeList.add(new ModelBox(finL, 0, 0, -1.5F, 0.0F, 1.0F, 2, 0, 3, 0.0F, false));
        this.finL.cubeList.add(new ModelBox(finL, 0, 0, -0.5F, 0.0F, 0.0F, 1, 0, 1, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.29F);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.head.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
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
        this.head.offsetY = 1.05F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3};

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
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(body, speed, 0.3F, true, 0, 0, f2, 1);
            this.flap(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.swing(finL, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            this.flap(finR, (float) (speed * 0.75), -0.12F, true, 0, 0, f2, 1);
            this.swing(finR, (float) (speed * 0.75), 0.12F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                //this.Bodyfront.rotateAngleZ = (float) Math.toRadians(90);
                this.head.offsetY = 1.0F;
                this.bob(head, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
