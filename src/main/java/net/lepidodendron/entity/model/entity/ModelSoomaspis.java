package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudonaraoia;
import net.lepidodendron.entity.EntityPrehistoricFloraSoomaspis;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class ModelSoomaspis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer soomaspis;
    private final AdvancedModelRenderer cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer anntennae1;
    private final AdvancedModelRenderer anntennae2;
    private final AdvancedModelRenderer thorax1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer leftleg1;
    private final AdvancedModelRenderer rightleg1;
    private final AdvancedModelRenderer thorax2;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer pygidium;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer leftleg4;
    private final AdvancedModelRenderer rightleg4;

    public ModelSoomaspis() {
        this.textureWidth = 25;
        this.textureHeight = 20;

        this.soomaspis = new AdvancedModelRenderer(this);
        this.soomaspis.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.cephalon = new AdvancedModelRenderer(this);
        this.cephalon.setRotationPoint(0.0F, -1.95F, -1.5F);
        this.soomaspis.addChild(cephalon);
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 0, -0.5F, 0.0F, -3.5F, 1, 1, 1, -0.001F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 11, 9, -2.5F, 0.0F, -1.75F, 5, 1, 2, 0.001F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 16, 4, -1.5F, 0.0F, -2.75F, 3, 1, 1, 0.0F, false));
        this.cephalon.cubeList.add(new ModelBox(cephalon, 0, 15, -1.0F, 0.5F, -2.05F, 2, 1, 2, 0.051F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, 3.0F, -3.5F);
        this.cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5672F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 18, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-3.3339F, 3.0F, -0.7871F);
        this.cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 6, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.1868F, 3.0F, -2.4254F);
        this.cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.9599F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 17, 0, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(3.3339F, 3.0F, -0.7871F);
        this.cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 6, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(2.1868F, 3.0F, -2.4254F);
        this.cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.9599F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 17, 0, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.5F, 3.0F, -3.5F);
        this.cephalon.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.5672F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 18, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.anntennae1 = new AdvancedModelRenderer(this);
        this.anntennae1.setRotationPoint(1.0F, 1.5F, -1.05F);
        this.cephalon.addChild(anntennae1);
        this.anntennae1.cubeList.add(new ModelBox(anntennae1, 0, 5, 0.0F, -0.25F, -3.5F, 3, 0, 4, 0.0F, true));

        this.anntennae2 = new AdvancedModelRenderer(this);
        this.anntennae2.setRotationPoint(-1.0F, 1.5F, -1.05F);
        this.cephalon.addChild(anntennae2);
        this.anntennae2.cubeList.add(new ModelBox(anntennae2, 0, 5, -3.0F, -0.25F, -3.5F, 3, 0, 4, 0.0F, false));

        this.thorax1 = new AdvancedModelRenderer(this);
        this.thorax1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.cephalon.addChild(thorax1);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 3.0F, 0.85F);
        this.thorax1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 15, -1.5F, -2.5F, -0.15F, 3, 1, 1, -0.002F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 13, -2.0F, -3.0F, -0.15F, 4, 1, 1, -0.002F, false));

        this.leftleg1 = new AdvancedModelRenderer(this);
        this.leftleg1.setRotationPoint(0.6913F, 1.4881F, 0.5F);
        this.thorax1.addChild(leftleg1);
        this.setRotateAngle(leftleg1, 0.0F, 0.0F, 0.2182F);
        this.leftleg1.cubeList.add(new ModelBox(leftleg1, -1, 5, 0.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, false));

        this.rightleg1 = new AdvancedModelRenderer(this);
        this.rightleg1.setRotationPoint(-0.6913F, 1.4881F, 0.5F);
        this.thorax1.addChild(rightleg1);
        this.setRotateAngle(rightleg1, 0.0F, 0.0F, -0.2182F);
        this.rightleg1.cubeList.add(new ModelBox(rightleg1, -1, 5, -2.0F, 0.0F, -0.5F, 2, 0, 1, 0.0F, true));

        this.thorax2 = new AdvancedModelRenderer(this);
        this.thorax2.setRotationPoint(0.0F, 0.0F, 0.95F);
        this.thorax1.addChild(thorax2);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 3.0F, 0.9F);
        this.thorax2.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -3.1416F, 0.0F, 3.1416F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 15, -1.5F, -2.5F, 0.1F, 3, 1, 1, -0.004F, false));
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 13, -2.0F, -3.0F, 0.1F, 4, 1, 1, -0.004F, false));

        this.pygidium = new AdvancedModelRenderer(this);
        this.pygidium.setRotationPoint(0.0F, 0.0F, 0.6F);
        this.thorax2.addChild(pygidium);
        this.pygidium.cubeList.add(new ModelBox(pygidium, 0, 9, -2.0F, 0.5F, 0.0F, 4, 1, 3, 0.0F, false));
        this.pygidium.cubeList.add(new ModelBox(pygidium, 7, 18, -1.0F, 0.5F, 3.0F, 2, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.5793F, 3.0F, 1.9804F);
        this.pygidium.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 1.5708F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 10, 7, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-2.2321F, 3.0F, 3.95F);
        this.pygidium.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -3.1416F, 1.3963F, -3.1416F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 14, 18, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, true));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, 3.0F, 4.95F);
        this.pygidium.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -3.1416F, 0.5236F, -3.1416F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 10, 5, 0.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, true));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(2.5793F, 3.0F, 1.9804F);
        this.pygidium.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -1.5708F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 10, 7, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(2.2321F, 3.0F, 3.95F);
        this.pygidium.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -3.1416F, -1.3963F, 3.1416F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 14, 18, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.5F, 3.0F, 4.95F);
        this.pygidium.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -3.1416F, -0.5236F, 3.1416F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 10, 5, -2.0F, -3.0F, 0.0F, 2, 1, 1, -0.001F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.0F, 4.95F);
        this.pygidium.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -3.1416F, 0.0F, 3.1416F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.0F, -3.0F, 1.0F, 4, 1, 4, 0.0F, false));
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 2, -0.5F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 3.0F, -0.45F);
        this.pygidium.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -3.1416F, 0.0F, 3.1416F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 0, -0.5F, -3.5F, -4.3F, 1, 1, 3, 0.0F, false));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(0.6674F, 1.4881F, 0.5017F);
        this.pygidium.addChild(leftleg2);
        this.setRotateAngle(leftleg2, -0.0094F, -0.0426F, 0.2184F);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, -1, 5, -0.0212F, 0.0047F, -0.3984F, 2, 0, 1, 0.0F, false));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.6674F, 1.4881F, 0.5017F);
        this.pygidium.addChild(rightleg2);
        this.setRotateAngle(rightleg2, -0.0094F, 0.0426F, -0.2184F);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, -1, 5, -1.9788F, 0.0047F, -0.3984F, 2, 0, 1, 0.0F, true));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(0.5346F, 1.4881F, 2.0547F);
        this.pygidium.addChild(leftleg3);
        this.setRotateAngle(leftleg3, -0.0479F, -0.2129F, 0.2233F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, -1, 5, -0.0423F, 0.0094F, -0.4953F, 2, 0, 1, 0.0F, false));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.5346F, 1.4881F, 2.0547F);
        this.pygidium.addChild(rightleg3);
        this.setRotateAngle(rightleg3, -0.0479F, 0.2129F, -0.2233F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, -1, 5, -1.9577F, 0.0094F, -0.4953F, 2, 0, 1, 0.0F, true));

        this.leftleg4 = new AdvancedModelRenderer(this);
        this.leftleg4.setRotationPoint(0.0346F, 1.4881F, 3.2547F);
        this.pygidium.addChild(leftleg4);
        this.setRotateAngle(leftleg4, -0.1504F, -0.5944F, 0.2643F);
        this.leftleg4.cubeList.add(new ModelBox(leftleg4, -1, 5, -0.0423F, 0.0094F, -0.4953F, 2, 0, 1, 0.0F, false));

        this.rightleg4 = new AdvancedModelRenderer(this);
        this.rightleg4.setRotationPoint(-0.0346F, 1.4881F, 3.2547F);
        this.pygidium.addChild(rightleg4);
        this.setRotateAngle(rightleg4, -0.1504F, 0.5944F, -0.2643F);
        this.rightleg4.cubeList.add(new ModelBox(rightleg4, -1, 5, -1.9577F, 0.0094F, -0.4953F, 2, 0, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.soomaspis.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.soomaspis.offsetY = -2.0F;
        this.soomaspis.offsetX = -1.338F;
        this.soomaspis.rotateAngleY = (float)Math.toRadians(200);
        this.soomaspis.rotateAngleX = (float)Math.toRadians(8);
        this.soomaspis.rotateAngleZ = (float)Math.toRadians(-8);
        this.soomaspis.scaleChildren = true;
        float scaler = 1.63F;
        this.soomaspis.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.soomaspis.render(f);
        //Reset rotations, positions and sizing:
        this.soomaspis.setScale(1.0F, 1.0F, 1.0F);
        this.soomaspis.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.body.offsetZ = 0.1F;
        this.soomaspis.render(0.014F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.pseudonaraoia.offsetY = 1.122F;

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }

        AdvancedModelRenderer[] legsL = {this.leftleg1, this.leftleg2, this.leftleg3, leftleg4};
        AdvancedModelRenderer[] legsR = {this.rightleg1, this.rightleg2, this.rightleg3, rightleg4};

        if (isAtBottom) {
            if (((EntityPrehistoricFloraSoomaspis) e).getIsMoving()) {
                this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
                this.chainWave(legsR, 0.6F, 0.2F, -3, f2, 1);
                this.flap(leftleg1, 0.5F, -0.2F, false, 0, -0.5F, f2, 0.3F);
                this.flap(rightleg1, 0.5F, 0.2F, false, 0, 0.5F, f2, 0.3F);
                this.flap(leftleg2, 0.5F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg2, 0.5F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg3, 0.5F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg3, 0.5F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
                this.flap(leftleg4, 0.5F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
                this.flap(rightleg4, 0.5F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


            }
        }
        else {
            this.chainWave(legsL, 0.2F, 0.2F, -3, f2, 1);
            this.chainWave(legsR, 0.25F, 0.2F, -3, f2, 1);
            this.flap(leftleg1, 0.2F, -0.2F, false, 0, -0.5F, f2, 0.3F);
            this.flap(rightleg1, 0.2F, 0.2F, false, 0, 0.5F, f2, 0.3F);
            this.flap(leftleg2, 0.2F, -0.2F, false, 1.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg2, 0.2F, 0.2F, false, 1.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg3, 0.2F, -0.2F, false, 2.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg3, 0.2F, 0.2F, false, 2.0F, 0.5F, f2, 0.3F);
            this.flap(leftleg4, 0.2F, -0.2F, false, 3.0F, -0.5F, f2, 0.3F);
            this.flap(rightleg4, 0.2F, 0.2F, false, 3.0F, 0.5F, f2, 0.3F);


        }

        this.swing(anntennae1, 0.36F, -0.21F, false, 0, -0.11F, f2, 0.8F);
        this.swing(anntennae2, 0.36F, 0.21F, false, 0, 0.11F, f2, 0.8F);

    }
}