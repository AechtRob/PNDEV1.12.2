package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelWeinbergina extends AdvancedModelBase {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer bone;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer cheliceraR;
    private final AdvancedModelRenderer cheliceraL;
    private final AdvancedModelRenderer legR1;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legR6;
    private final AdvancedModelRenderer legL6;

    public ModelWeinbergina() {
        this.textureWidth = 32;
        this.textureHeight = 32;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 24.5F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 0, 0, -3.0F, -4.0F, -6.0F, 6, 2, 4, 0.0F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 25, -3.0F, -4.25F, -6.0F, 6, 1, 4, -0.01F, false));
        this.Body.cubeList.add(new ModelBox(Body, 0, 17, -1.0F, -2.5F, -6.0F, 2, 1, 4, -0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -4.0F, -5.0F);
        this.Body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 19, -1.0F, 0.3F, 1.0F, 2, 1, 1, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 19, -1.5F, 0.3F, 2.0F, 3, 1, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(-3.0F, -4.0F, -6.0F);
        this.Body.addChild(bone3);
        this.setRotateAngle(bone3, 0.829F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 11, 0.0F, 0.0F, -3.0F, 6, 0, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.8727F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 6, 0.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, -0.8727F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 6, -2.0F, 0.0F, -3.0F, 2, 0, 3, 0.0F, false));

        this.bone = new AdvancedModelRenderer(this);
        this.bone.setRotationPoint(-3.0F, -4.0F, -4.0F);
        this.Body.addChild(bone);
        this.setRotateAngle(bone, 0.0F, 0.0F, -1.0472F);
        this.bone.cubeList.add(new ModelBox(bone, 13, 8, -3.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-1.0F, 0.0F, -2.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.5236F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 16, -2.0F, 0.0F, -1.0F, 3, 0, 1, 0.0F, false));

        this.bone2 = new AdvancedModelRenderer(this);
        this.bone2.setRotationPoint(3.0F, -4.0F, -4.0F);
        this.Body.addChild(bone2);
        this.setRotateAngle(bone2, 0.0F, 0.0F, 1.0472F);
        this.bone2.cubeList.add(new ModelBox(bone2, 13, 8, 0.0F, 0.0F, -2.0F, 3, 0, 4, 0.0F, true));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, 0.0F, -2.0F);
        this.bone2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.5236F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 16, -1.0F, 0.0F, -1.0F, 3, 0, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -3.75F, -2.0F);
        this.Body.addChild(Body2);
        this.setRotateAngle(Body2, -0.2007F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 12, 15, -2.5F, -0.25F, 0.0F, 5, 2, 2, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 5, 0.0F, -0.75F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 1, -2.25F, -0.75F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 1, 2.25F, -0.75F, 0.5F, 0, 1, 1, 0.0F, true));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 6, -4.5F, 1.25F, 0.0F, 9, 0, 2, 0.0F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body2.addChild(Body3);
        this.setRotateAngle(Body3, -0.0873F, 0.0F, 0.0F);
        this.Body3.cubeList.add(new ModelBox(Body3, 14, 0, -3.5F, 1.25F, 0.0F, 7, 0, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 2, -1.75F, -0.75F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 0, 2, 1.75F, -0.75F, 0.5F, 0, 1, 1, 0.0F, true));
        this.Body3.cubeList.add(new ModelBox(Body3, 2, 2, 0.0F, -0.75F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 12, 19, -2.0F, -0.225F, 0.0F, 4, 2, 2, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Body3.addChild(Body4);
        this.setRotateAngle(Body4, 0.0873F, 0.0F, 0.0F);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, -0.85F, -0.5F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 0, 0.85F, -0.5F, 0.5F, 0, 1, 1, 0.0F, true));
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 22, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 2, 1, 0.0F, -0.5F, 0.5F, 0, 1, 1, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 18, 4, -2.0F, 0.75F, 0.0F, 4, 0, 2, 0.0F, false));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Body4.addChild(Tail);
        this.setRotateAngle(Tail, 0.1309F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 9, 8, -0.5F, -0.475F, 0.0F, 1, 1, 6, 0.0F, false));

        this.cheliceraR = new AdvancedModelRenderer(this);
        this.cheliceraR.setRotationPoint(-0.5F, -1.75F, -6.0F);
        this.Body.addChild(cheliceraR);
        this.setRotateAngle(cheliceraR, 0.4363F, 0.0F, 0.0F);
        this.cheliceraR.cubeList.add(new ModelBox(cheliceraR, 0, 0, -0.75F, 0.0F, -1.5F, 1, 0, 2, 0.0F, false));

        this.cheliceraL = new AdvancedModelRenderer(this);
        this.cheliceraL.setRotationPoint(0.5F, -1.75F, -6.0F);
        this.Body.addChild(cheliceraL);
        this.setRotateAngle(cheliceraL, 0.4363F, 0.0F, 0.0F);
        this.cheliceraL.cubeList.add(new ModelBox(cheliceraL, 0, 0, -0.25F, 0.0F, -1.5F, 1, 0, 2, 0.0F, true));

        this.legR1 = new AdvancedModelRenderer(this);
        this.legR1.setRotationPoint(-1.0F, -1.75F, -6.0F);
        this.Body.addChild(legR1);
        this.setRotateAngle(legR1, 0.3054F, -0.7418F, -0.6109F);
        this.legR1.cubeList.add(new ModelBox(legR1, 0, 14, -3.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(1.0F, -1.75F, -6.0F);
        this.Body.addChild(legL);
        this.setRotateAngle(legL, 0.3054F, 0.7418F, 0.6109F);
        this.legL.cubeList.add(new ModelBox(legL, 0, 14, -1.0F, 0.0F, -0.5F, 4, 0, 1, 0.0F, true));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-1.0F, -1.75F, -5.25F);
        this.Body.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, -0.4363F, -0.3491F);
        this.legR2.cubeList.add(new ModelBox(legR2, 16, 13, -4.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(1.0F, -1.75F, -5.25F);
        this.Body.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.4363F, 0.3491F);
        this.legL2.cubeList.add(new ModelBox(legL2, 16, 13, -1.0F, 0.0F, -0.5F, 5, 0, 1, 0.0F, true));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-1.0F, -1.75F, -4.75F);
        this.Body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, -0.1309F, -0.2618F);
        this.legR3.cubeList.add(new ModelBox(legR3, 16, 12, -5.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(1.0F, -1.75F, -4.75F);
        this.Body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.1309F, 0.2618F);
        this.legL3.cubeList.add(new ModelBox(legL3, 16, 12, -1.0F, 0.0F, -0.5F, 6, 0, 1, 0.0F, true));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-1.0F, -1.75F, -4.25F);
        this.Body.addChild(legR4);
        this.setRotateAngle(legR4, -0.0436F, 0.0873F, -0.2618F);
        this.legR4.cubeList.add(new ModelBox(legR4, 0, 15, -5.0F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(1.0F, -1.75F, -4.25F);
        this.Body.addChild(legL4);
        this.setRotateAngle(legL4, -0.0436F, -0.0873F, 0.2618F);
        this.legL4.cubeList.add(new ModelBox(legL4, 0, 15, -1.0F, 0.0F, -0.5F, 6, 0, 2, 0.0F, true));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-1.0F, -1.75F, -3.75F);
        this.Body.addChild(legR5);
        this.setRotateAngle(legR5, -0.1309F, 0.3054F, -0.2618F);
        this.legR5.cubeList.add(new ModelBox(legR5, 14, 2, -5.0F, 0.0F, -0.5F, 6, 0, 2, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(1.0F, -1.75F, -3.75F);
        this.Body.addChild(legL5);
        this.setRotateAngle(legL5, -0.1309F, -0.3054F, 0.2618F);
        this.legL5.cubeList.add(new ModelBox(legL5, 14, 2, -1.0F, 0.0F, -0.5F, 6, 0, 2, 0.0F, true));

        this.legR6 = new AdvancedModelRenderer(this);
        this.legR6.setRotationPoint(-1.0F, -1.75F, -3.25F);
        this.Body.addChild(legR6);
        this.setRotateAngle(legR6, -0.2182F, 0.5236F, -0.2618F);
        this.legR6.cubeList.add(new ModelBox(legR6, 0, 8, -5.0F, 0.0F, -0.5F, 6, 0, 3, 0.0F, false));

        this.legL6 = new AdvancedModelRenderer(this);
        this.legL6.setRotationPoint(1.0F, -1.75F, -3.25F);
        this.Body.addChild(legL6);
        this.setRotateAngle(legL6, -0.2182F, -0.5236F, 0.2618F);
        this.legL6.cubeList.add(new ModelBox(legL6, 0, 8, -1.0F, 0.0F, -0.5F, 6, 0, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Body.render(f5 * 0.45F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.Body.rotateAngleY = (float) Math.toRadians(90);
        this.Body.offsetX = -0F;
        this.Body.offsetY = -0F;
        this.Body.offsetZ = 0F;
        this.Body.render(0.01F);
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
        this.Body.offsetY = 0.82F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] Tail = {this.Body2, this.Body3, this.Body4, this.Tail};

        if (isAtBottom || !e.isInWater()) {
            //Left
            this.swing(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legL5, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legL6, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(legR1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(legR2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legR3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legR5, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR6, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
        } else if (f3 > 0) {
            this.chainSwing(Tail, 0.1F, 0.2F, -2, f2, 1.0F);
            this.chainWave(Tail, 0.1F, 0.05f, -2, f2, 0F);
            this.bob(Body, 0.0F, 0.0F, false, f2, 1);
            //Left
            this.swing(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.swing(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legL5, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legL6, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);

            //Right:
            this.swing(legR1, 0.5F, -0.5F, true, 0, -0.5F, f2, 0.3F);
            this.swing(legR2, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
            this.swing(legR3, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR4, 0.5F, -0.5F, true, 3.0F, -0.5F, f2, 0.3F);
            this.swing(legR5, 0.5F, -0.5F, true, 2.0F, -0.5F, f2, 0.3F);
            this.swing(legR6, 0.5F, -0.5F, true, 1.0F, -0.5F, f2, 0.3F);
        } else {
            this.chainSwing(Tail, 0.2F, 0.08F, -2, f2, 0.5F);
            this.chainWave(Tail, 0.2F, 0.05f, -2, f2, 0.8F);
            this.bob(Body, 0.2F, 0.1F, false, f2, 0.5F);
        }

    }
}
