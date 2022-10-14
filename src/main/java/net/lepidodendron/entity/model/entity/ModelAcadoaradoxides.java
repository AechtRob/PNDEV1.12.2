package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelAcadoaradoxides extends AdvancedModelBase {
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer body6;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer tailR;
    private final AdvancedModelRenderer tailL;
    private final AdvancedModelRenderer legR8;
    private final AdvancedModelRenderer legL8;
    private final AdvancedModelRenderer legL7;
    private final AdvancedModelRenderer legR7;
    private final AdvancedModelRenderer legR5;
    private final AdvancedModelRenderer legL5;
    private final AdvancedModelRenderer legL4;
    private final AdvancedModelRenderer legR4;
    private final AdvancedModelRenderer legR3;
    private final AdvancedModelRenderer legL3;
    private final AdvancedModelRenderer legL;
    private final AdvancedModelRenderer legL2;
    private final AdvancedModelRenderer legR;
    private final AdvancedModelRenderer legR2;
    private final AdvancedModelRenderer antennaL;
    private final AdvancedModelRenderer antennaR;

    public ModelAcadoaradoxides() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 17, -1.5F, -1.5F, -7.9F, 3, 1, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 26, -4.5F, -1.0F, -8.0F, 9, 1, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.0436F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 0, 4.15F, -0.75F, -7.75F, 1, 0, 11, 0.0F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.0436F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 0, -5.15F, -0.75F, -7.75F, 1, 0, 11, 0.0F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.5F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 21, 17, -2.5F, -0.5F, -0.01F, 5, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 23, 21, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 2, 3.1F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 2, 2, 3.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 0, -4.1F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 2, 0, -4.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 21, 17, -2.49F, -0.51F, -0.01F, 5, 1, 2, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 23, 21, -0.99F, -0.751F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body2.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 2, 2, 3.1F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 2, 2, 3.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body2.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.7854F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 0, -4.1F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 2, 0, -4.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 21, 17, -2.5F, -0.5F, -0.01F, 5, 1, 2, 0.0F, false));
        this.body3.cubeList.add(new ModelBox(body3, 23, 21, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body3.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 2, 3.1F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 2, 2, 3.85F, -0.5F, -1.1F, 1, 0, 2, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body3.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 0, -3.85F, -0.49F, -0.45F, 1, 0, 2, 0.0F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 2, 0, -4.85F, -0.5F, -1.1F, 1, 0, 2, 0.0F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 21, 17, -2.49F, -0.51F, -0.01F, 5, 1, 2, 0.0F, false));
        this.body4.cubeList.add(new ModelBox(body4, 23, 21, -0.99F, -0.751F, 0.0F, 2, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body4.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 2, 2.85F, -0.49F, -0.7F, 1, 0, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 2, 2, 3.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.body4.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 0, -3.85F, -0.49F, -0.7F, 1, 0, 2, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 2, 0, -4.85F, -0.5F, -1.2F, 1, 0, 2, 0.0F, false));

        this.body6 = new AdvancedModelRenderer(this);
        this.body6.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.body4.addChild(body6);
        this.body6.cubeList.add(new ModelBox(body6, 10, 23, -1.0F, -0.75F, 0.0F, 2, 1, 2, 0.0F, false));
        this.body6.cubeList.add(new ModelBox(body6, 0, 22, -2.0F, -0.5F, -0.01F, 4, 1, 2, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.body6.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, -0.6109F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 2, -0.1F, -0.48F, 2.05F, 1, 0, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.body6.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 2, -0.4F, -0.49F, 1.8F, 1, 0, 2, 0.0F, true));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.body6.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0F, -0.7854F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 2, -0.6F, -0.49F, 1.8F, 1, 0, 2, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.5F, -1.0F);
        this.body6.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.6109F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -0.9F, -0.48F, 2.05F, 1, 0, 2, 0.0F, false));

        this.tailR = new AdvancedModelRenderer(this);
        this.tailR.setRotationPoint(-0.25F, 0.25F, 2.0F);
        this.body6.addChild(tailR);
        this.setRotateAngle(tailR, 0.0F, -0.1745F, 0.0F);
        this.tailR.cubeList.add(new ModelBox(tailR, 12, 8, -2.0F, 0.0F, 0.0F, 2, 0, 8, 0.0F, false));

        this.tailL = new AdvancedModelRenderer(this);
        this.tailL.setRotationPoint(0.25F, 0.25F, 2.0F);
        this.body6.addChild(tailL);
        this.setRotateAngle(tailL, 0.0F, 0.1745F, 0.0F);
        this.tailL.cubeList.add(new ModelBox(tailL, 10, 0, 0.0F, 0.0F, 0.0F, 2, 0, 8, 0.0F, false));

        this.legR8 = new AdvancedModelRenderer(this);
        this.legR8.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.body6.addChild(legR8);
        this.setRotateAngle(legR8, 0.0F, 0.0F, -0.1745F);
        this.legR8.cubeList.add(new ModelBox(legR8, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL8 = new AdvancedModelRenderer(this);
        this.legL8.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.body6.addChild(legL8);
        this.setRotateAngle(legL8, 0.0F, 0.0F, 0.1745F);
        this.legL8.cubeList.add(new ModelBox(legL8, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL7 = new AdvancedModelRenderer(this);
        this.legL7.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body4.addChild(legL7);
        this.setRotateAngle(legL7, 0.0F, 0.0F, 0.1745F);
        this.legL7.cubeList.add(new ModelBox(legL7, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR7 = new AdvancedModelRenderer(this);
        this.legR7.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body4.addChild(legR7);
        this.setRotateAngle(legR7, 0.0F, 0.0F, -0.1745F);
        this.legR7.cubeList.add(new ModelBox(legR7, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR5 = new AdvancedModelRenderer(this);
        this.legR5.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body3.addChild(legR5);
        this.setRotateAngle(legR5, 0.0F, 0.0F, -0.1745F);
        this.legR5.cubeList.add(new ModelBox(legR5, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL5 = new AdvancedModelRenderer(this);
        this.legL5.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body3.addChild(legL5);
        this.setRotateAngle(legL5, 0.0F, 0.0F, 0.1745F);
        this.legL5.cubeList.add(new ModelBox(legL5, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL4 = new AdvancedModelRenderer(this);
        this.legL4.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body2.addChild(legL4);
        this.setRotateAngle(legL4, 0.0F, 0.0F, 0.1745F);
        this.legL4.cubeList.add(new ModelBox(legL4, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR4 = new AdvancedModelRenderer(this);
        this.legR4.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body2.addChild(legR4);
        this.setRotateAngle(legR4, 0.0F, 0.0F, -0.1745F);
        this.legR4.cubeList.add(new ModelBox(legR4, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR3 = new AdvancedModelRenderer(this);
        this.legR3.setRotationPoint(-0.5F, 0.5F, 1.0F);
        this.body.addChild(legR3);
        this.setRotateAngle(legR3, 0.0F, 0.0F, -0.1745F);
        this.legR3.cubeList.add(new ModelBox(legR3, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL3 = new AdvancedModelRenderer(this);
        this.legL3.setRotationPoint(0.5F, 0.5F, 1.0F);
        this.body.addChild(legL3);
        this.setRotateAngle(legL3, 0.0F, 0.0F, 0.1745F);
        this.legL3.cubeList.add(new ModelBox(legL3, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL = new AdvancedModelRenderer(this);
        this.legL.setRotationPoint(0.5F, 0.0F, -6.75F);
        this.head.addChild(legL);
        this.setRotateAngle(legL, 0.0F, 0.0F, 0.1745F);
        this.legL.cubeList.add(new ModelBox(legL, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legL2 = new AdvancedModelRenderer(this);
        this.legL2.setRotationPoint(0.5F, 0.0F, -5.0F);
        this.head.addChild(legL2);
        this.setRotateAngle(legL2, 0.0F, 0.0F, 0.1745F);
        this.legL2.cubeList.add(new ModelBox(legL2, 20, 20, 0.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR = new AdvancedModelRenderer(this);
        this.legR.setRotationPoint(-0.5F, 0.0F, -6.75F);
        this.head.addChild(legR);
        this.setRotateAngle(legR, 0.0F, 0.0F, -0.1745F);
        this.legR.cubeList.add(new ModelBox(legR, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.legR2 = new AdvancedModelRenderer(this);
        this.legR2.setRotationPoint(-0.5F, 0.0F, -5.0F);
        this.head.addChild(legR2);
        this.setRotateAngle(legR2, 0.0F, 0.0F, -0.1745F);
        this.legR2.cubeList.add(new ModelBox(legR2, 9, 22, -4.0F, 0.01F, -0.5F, 4, 0, 1, 0.0F, false));

        this.antennaL = new AdvancedModelRenderer(this);
        this.antennaL.setRotationPoint(2.0F, -0.25F, -8.0F);
        this.head.addChild(antennaL);
        this.setRotateAngle(antennaL, 0.0F, -0.2618F, 0.0F);
        this.antennaL.cubeList.add(new ModelBox(antennaL, 0, 0, 0.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, false));

        this.antennaR = new AdvancedModelRenderer(this);
        this.antennaR.setRotationPoint(-2.0F, -0.25F, -8.0F);
        this.head.addChild(antennaR);
        this.setRotateAngle(antennaR, 0.0F, 0.2618F, 0.0F);
        this.antennaR.cubeList.add(new ModelBox(antennaR, 0, 6, -6.0F, 0.0F, -6.0F, 6, 0, 6, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.render(f5 * 0.48F);
    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        this.head.render(0.022F);
        GlStateManager.enableCull();
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
        this.head.offsetY = 0.75F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.legL, this.legL2, this.legL3, this.legL4, this.legL5, this.legL7, this.legL8};
        AdvancedModelRenderer[] legsR = {this.legR, this.legR2, this.legR3, this.legR4, this.legR5, this.legR7, this.legR8};
        AdvancedModelRenderer[] bodyF = {this.body,this.body2,this.body3,this.body4,this.body6};

        if (isAtBottom) {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.5F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.5F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.5F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.5F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.5F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.5F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.5F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.5F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.5F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.5F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.5F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.5F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.5F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.5F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.1F, 0.02F, -3, f2, 0.5F);
            this.chainWave(bodyF, 0.1F, 0.02f, -3, f2, 0F);
            this.bob(head, 0.0F, 0.0F, false, f2, 1);
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(legL, 0.2F, -0.5F, false, 0, -0.5F, f2, 0.3F);
            this.flap(legR, 0.2F, 0.5F, false, 0, 0.5F, f2, 0.3F);
            this.flap(legL2, 0.2F, -0.5F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(legR2, 0.2F, 0.5F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(legL3, 0.2F, -0.5F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(legR3, 0.2F, 0.5F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(legL4, 0.2F, -0.5F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(legR4, 0.2F, 0.5F, false, 3.0F, 0.5F, f2, 0.3F);
            this.flap(legL5, 0.2F, -0.5F, false, 4.0F, -0.5F, f2, 0.3F);
            this.flap(legR5, 0.2F, 0.5F, false, 4.0F, 0.5F, f2, 0.3F);
            this.flap(legL7, 0.2F, -0.5F, false, 5.0F, -0.5F, f2, 0.3F);
            this.flap(legR7, 0.2F, 0.5F, false, 5.0F, 0.5F, f2, 0.3F);
            this.flap(legL8, 0.2F, -0.5F, false, 6.0F, -0.5F, f2, 0.3F);
            this.flap(legR8, 0.2F, 0.5F, false, 6.0F, 0.5F, f2, 0.3F);
            this.chainSwing(bodyF, 0.2F, 0.01F, -3, f2, 0.2F);
            this.chainWave(bodyF, 0.5F, 0.02f, -3, f2, 0.3F);
            this.bob(head, 0.2F, 0.2F, false, f2, 1);
        }

        this.swing(antennaL, 0.4F, -0.2F, false, 0, -0.1F, f2, 0.8F);
        this.swing(antennaR, 0.4F, 0.2F, false, 0, 0.1F, f2, 0.8F);

        if (f3 != 0.0F) {
            this.swing(tailL, 0.5F, -0.38F, false, 0, 0.25F, f2, 0.6F);
            this.swing(tailR, 0.5F, 0.38F, false, 0, -0.25F, f2, 0.6F);
        }
    }
}
