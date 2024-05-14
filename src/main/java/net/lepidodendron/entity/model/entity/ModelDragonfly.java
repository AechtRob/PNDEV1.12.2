package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelDragonfly extends AdvancedModelBase {
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer rightleg2;
    private final AdvancedModelRenderer rightleg;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer leftbackwing;
    private final AdvancedModelRenderer leftfrontwing;
    private final AdvancedModelRenderer rightbackwing;
    private final AdvancedModelRenderer rightfrontwing;
    private final AdvancedModelRenderer leftleg3;
    private final AdvancedModelRenderer leftleg2;
    private final AdvancedModelRenderer leftleg;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer rightleg3;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;

    public ModelDragonfly() {
        this.textureWidth = 34;
        this.textureHeight = 21;

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(-0.3051F, 20.939F, -4.2877F);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.1949F, -0.189F, -1.9623F, 1, 1, 4, -0.001F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, -0.4449F, 0.061F, 1.0377F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 5, -0.6949F, 0.061F, -1.9623F, 2, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 0, 0.0551F, 0.061F, 1.0377F, 1, 1, 1, 0.0F, true));

        this.rightleg2 = new AdvancedModelRenderer(this);
        this.rightleg2.setRotationPoint(-0.6949F, 0.561F, -0.4623F);
        this.body.addChild(rightleg2);
        this.rightleg2.cubeList.add(new ModelBox(rightleg2, 0, 16, -4.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, false));

        this.rightleg = new AdvancedModelRenderer(this);
        this.rightleg.setRotationPoint(-0.6949F, 0.561F, -1.9623F);
        this.body.addChild(rightleg);
        this.setRotateAngle(rightleg, 0.0F, -0.5236F, 0.0F);
        this.rightleg.cubeList.add(new ModelBox(rightleg, 10, 12, -3.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, false));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.3051F, 0.561F, 2.0377F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 0, -0.5F, -0.5F, 0.0F, 1, 1, 11, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 19, 8, -0.75F, -0.5F, 0.0F, 1, 1, 6, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -0.75F, -0.25F, 7.75F, 1, 1, 3, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 10, 12, -0.5F, -0.5F, 0.0F, 1, 1, 7, 0.001F, false));
        this.body2.cubeList.add(new ModelBox(body2, 19, 8, -0.25F, -0.5F, 0.0F, 1, 1, 6, 0.0F, true));
        this.body2.cubeList.add(new ModelBox(body2, 0, 12, -0.25F, -0.25F, 7.75F, 1, 1, 3, -0.001F, true));

        this.leftbackwing = new AdvancedModelRenderer(this);
        this.leftbackwing.setRotationPoint(0.8041F, -0.013F, 0.5367F);
        this.body.addChild(leftbackwing);
        this.setRotateAngle(leftbackwing, 0.0F, -0.0873F, 0.0F);
        this.leftbackwing.cubeList.add(new ModelBox(leftbackwing, 11, 3, 0.0F, 0.001F, -0.5F, 10, 0, 3, 0.0F, true));

        this.leftfrontwing = new AdvancedModelRenderer(this);
        this.leftfrontwing.setRotationPoint(0.8041F, -0.113F, -0.4613F);
        this.body.addChild(leftfrontwing);
        this.setRotateAngle(leftfrontwing, 0.0F, 0.3491F, 0.0F);
        this.leftfrontwing.cubeList.add(new ModelBox(leftfrontwing, 11, 0, 0.0F, 0.001F, -0.5F, 10, 0, 3, 0.0F, true));

        this.rightbackwing = new AdvancedModelRenderer(this);
        this.rightbackwing.setRotationPoint(-0.1939F, -0.013F, 0.5367F);
        this.body.addChild(rightbackwing);
        this.setRotateAngle(rightbackwing, 0.0F, 0.0873F, 0.0F);
        this.rightbackwing.cubeList.add(new ModelBox(rightbackwing, 11, 3, -10.0F, 0.001F, -0.5F, 10, 0, 3, 0.0F, false));

        this.rightfrontwing = new AdvancedModelRenderer(this);
        this.rightfrontwing.setRotationPoint(-0.1939F, -0.113F, -0.4613F);
        this.body.addChild(rightfrontwing);
        this.setRotateAngle(rightfrontwing, 0.0F, -0.3491F, 0.0F);
        this.rightfrontwing.cubeList.add(new ModelBox(rightfrontwing, 11, 0, -10.0F, 0.001F, -0.5F, 10, 0, 3, 0.0F, false));

        this.leftleg3 = new AdvancedModelRenderer(this);
        this.leftleg3.setRotationPoint(1.3051F, 0.561F, 1.0377F);
        this.body.addChild(leftleg3);
        this.setRotateAngle(leftleg3, 0.0F, -0.6981F, 0.0F);
        this.leftleg3.cubeList.add(new ModelBox(leftleg3, 13, 8, 0.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, true));

        this.leftleg2 = new AdvancedModelRenderer(this);
        this.leftleg2.setRotationPoint(1.3051F, 0.561F, -0.4623F);
        this.body.addChild(leftleg2);
        this.leftleg2.cubeList.add(new ModelBox(leftleg2, 0, 16, 0.0F, -0.5F, 0.0F, 4, 3, 0, 0.0F, true));

        this.leftleg = new AdvancedModelRenderer(this);
        this.leftleg.setRotationPoint(1.3051F, 0.561F, -1.9623F);
        this.body.addChild(leftleg);


        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftleg.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.5236F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 12, 0.0F, -0.5F, 0.0F, 3, 3, 0, 0.0F, true));

        this.rightleg3 = new AdvancedModelRenderer(this);
        this.rightleg3.setRotationPoint(-0.6949F, 0.561F, 1.0377F);
        this.body.addChild(rightleg3);
        this.setRotateAngle(rightleg3, 0.0F, 0.6981F, 0.0F);
        this.rightleg3.cubeList.add(new ModelBox(rightleg3, 13, 8, -5.0F, -0.5F, 0.0F, 5, 3, 0, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.2801F, 0.561F, -1.5123F);
        this.body.addChild(head);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1309F, 0.0F, -0.1745F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 2, -0.9242F, -0.8223F, -1.4823F, 1, 1, 1, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.05F, 0.0F, 0.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.1745F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 2, -0.0758F, -0.8223F, -1.4823F, 1, 1, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.025F, 0.0F, 0.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 15, -0.5F, -0.595F, -1.7183F, 1, 1, 2, -0.002F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        GlStateManager.pushMatrix();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        this.body.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    public void renderStaticDisplayCase(float f) {
        this.setRotateAngle(body, 0.0F, 0.0F, 0.0F);
        this.body.offsetY = -0.05F;
        this.body.render(0.01f);
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
        //this.body.offsetY = 0.7F;

        EntityPrehistoricFloraInsectFlyingBase ee = (EntityPrehistoricFloraInsectFlyingBase) e;
        if (ee.flyProgress != 0 && ee.getAttachmentPos() == null) {
            this.setRotateAngle(rightleg3, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(rightleg2, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(leftleg3, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(leftleg2, 0.0F, 0.0F, 0.7854F);
            this.setRotateAngle(rightleg, 0.0F, 0.0F, -0.7854F);
            this.setRotateAngle(leftleg, 0.0F, 0.0F, 0.7854F);
//            this.setRotateAngle(rightbackwing, 0.0F, 0.3491F, 0.0F);
//            this.setRotateAngle(rightfrontwing, 0.0F, -0.3491F, 0.0F);
//            this.setRotateAngle(leftfrontwing, 0.0F, 0.3491F, 0.0F);
//            this.setRotateAngle(leftbackwing, 0.0F, -0.3491F, 0.0F);
            //this.setRotateAngle(cerciL, 0.0F, 0.2618F, 0.0F);
            //this.setRotateAngle(cerciR, 0.0F, -0.2618F, 0.0F);

            //this.swing(cerciL, 1F, -0.4F, false, 0, -0.1F, f2, 0.8F);
            //this.swing(cerciR, 1F, 0.4F, false, 0, 0.1F, f2, 0.8F);
            float modifier = 1F;
            //modifier = 0.02F;
            this.flap(leftfrontwing,2.2F * modifier, 0.5F, true, 0,0, f2, 1F);
            this.flap(leftbackwing,2.2F * modifier, 0.5F, true, 3,0, f2, 1F);
            //this.flap(forewingL,2.2F * modifier, 0.5F, true, -1,0.2F, f2, 1F);
            this.flap(rightfrontwing,2.2F * modifier, 0.5F, false, 0,0, f2, 1F);
            this.flap(rightbackwing,2.2F * modifier, 0.5F, false, 3,0F, f2, 1F);
            //this.flap(forewingR,2.2F * modifier, 0.5F, false, -1,0.2F, f2, 1F);
        }

//        this.walk(antennaL, 0.3F, -0.15F, false,0,0.1F, f2, 1F);
//        this.walk(antennaR, 0.3F, 0.15F, false,0,0.1F, f2, 1F);
//        this.swing(antennaL, 0.3F, -0.25F, false, 0, -0.1F, f2, 0.8F);
//        this.swing(antennaR, 0.3F, 0.25F, false, 0, 0.1F, f2, 0.8F);
//        this.swing(mouth, 0.3F, 0.2F, false, 0, 0.1F, f2, 0.8F);
//        this.swing(cerciL, 0.12F, -0.4F, false, 0, -0.1F, f2, 0.8F);
//        this.swing(cerciR, 0.12F, 0.4F, false, 0, 0.1F, f2, 0.8F);

    }
}
