package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelKoonwarria extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer bodyfront;
    private final AdvancedModelRenderer bodymiddle;
    private final AdvancedModelRenderer bodyend;
    private final AdvancedModelRenderer tailbase;
    private final AdvancedModelRenderer tailend;
    private final AdvancedModelRenderer tailfin;
    private final AdvancedModelRenderer dorsalslopebodyend;
    private final AdvancedModelRenderer dorsalfin;
    private final AdvancedModelRenderer bellyslopebodyend;
    private final AdvancedModelRenderer analfin;
    private final AdvancedModelRenderer bellyslopebodymiddle;
    private final AdvancedModelRenderer dorsalslopebodymiddle;
    private final AdvancedModelRenderer dorsalbodyfront1;
    private final AdvancedModelRenderer dorsalbodyfront2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer headslope;
    private final AdvancedModelRenderer throatslope;
    private final AdvancedModelRenderer leftpectoralfin;
    private final AdvancedModelRenderer rightpectoralfin;
    private final AdvancedModelRenderer eyeportion;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer leftcheek;
    private final AdvancedModelRenderer rightcheek;
    private final AdvancedModelRenderer eyeportionslope;
    private final AdvancedModelRenderer lefteye;
    private final AdvancedModelRenderer righteye;
    private final AdvancedModelRenderer lowerjawbase;
    private final AdvancedModelRenderer lowerjawfront;
    private final AdvancedModelRenderer leftcheekflesh;
    private final AdvancedModelRenderer rightcheekflesh;
    private final AdvancedModelRenderer leftpelvicfin;
    private final AdvancedModelRenderer rightpelvicfin;

    public ModelKoonwarria() {
        this.textureWidth = 64;
        this.textureHeight = 32;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 0.0F);


        this.bodyfront = new AdvancedModelRenderer(this);
        this.bodyfront.setRotationPoint(0.0F, 17.0F, -1.5F);
        this.root.addChild(bodyfront);
        this.bodyfront.cubeList.add(new ModelBox(bodyfront, 0, 20, -1.5F, -2.5F, -5.0F, 3, 7, 5, 0.0F, true));

        this.bodymiddle = new AdvancedModelRenderer(this);
        this.bodymiddle.setRotationPoint(-0.01F, 0.4F, -0.6F);
        this.bodyfront.addChild(bodymiddle);
        this.bodymiddle.cubeList.add(new ModelBox(bodymiddle, 17, 22, -1.5F, -2.5F, 0.0F, 3, 6, 4, 0.0F, true));

        this.bodyend = new AdvancedModelRenderer(this);
        this.bodyend.setRotationPoint(0.0F, -0.1F, 3.5F);
        this.bodymiddle.addChild(bodyend);
        this.bodyend.cubeList.add(new ModelBox(bodyend, 32, 24, -1.0F, -1.5F, 0.0F, 2, 4, 4, 0.0F, true));

        this.tailbase = new AdvancedModelRenderer(this);
        this.tailbase.setRotationPoint(0.0F, 0.51F, 3.6F);
        this.bodyend.addChild(tailbase);
        this.tailbase.cubeList.add(new ModelBox(tailbase, 47, 9, -0.5F, -2.0F, 0.0F, 1, 4, 2, 0.0F, true));

        this.tailend = new AdvancedModelRenderer(this);
        this.tailend.setRotationPoint(-0.01F, 0.0F, 1.6F);
        this.tailbase.addChild(tailend);
        this.tailend.cubeList.add(new ModelBox(tailend, 31, 8, -0.5F, -1.5F, 0.0F, 1, 3, 2, 0.0F, true));

        this.tailfin = new AdvancedModelRenderer(this);
        this.tailfin.setRotationPoint(0.0F, 0.1F, 1.0F);
        this.tailend.addChild(tailfin);
        this.tailfin.cubeList.add(new ModelBox(tailfin, 54, 0, 0.0F, -4.5F, 0.0F, 0, 9, 5, 0.0F, true));

        this.dorsalslopebodyend = new AdvancedModelRenderer(this);
        this.dorsalslopebodyend.setRotationPoint(-0.01F, -2.7F, 0.0F);
        this.bodyend.addChild(dorsalslopebodyend);
        this.setRotateAngle(dorsalslopebodyend, -0.2972F, 0.0F, 0.0F);
        this.dorsalslopebodyend.cubeList.add(new ModelBox(dorsalslopebodyend, 52, 17, -1.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.dorsalfin = new AdvancedModelRenderer(this);
        this.dorsalfin.setRotationPoint(0.0F, 0.5F, 0.5F);
        this.dorsalslopebodyend.addChild(dorsalfin);
        this.setRotateAngle(dorsalfin, 0.3609F, 0.0F, 0.0F);
        this.dorsalfin.cubeList.add(new ModelBox(dorsalfin, 34, 0, 0.0F, -3.0F, -1.0F, 0, 3, 4, 0.0F, true));

        this.bellyslopebodyend = new AdvancedModelRenderer(this);
        this.bellyslopebodyend.setRotationPoint(0.02F, 3.8F, 0.0F);
        this.bodyend.addChild(bellyslopebodyend);
        this.setRotateAngle(bellyslopebodyend, 0.3396F, 0.0F, 0.0F);
        this.bellyslopebodyend.cubeList.add(new ModelBox(bellyslopebodyend, 39, 17, -1.0F, -2.0F, 0.0F, 2, 2, 4, 0.0F, true));

        this.analfin = new AdvancedModelRenderer(this);
        this.analfin.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bellyslopebodyend.addChild(analfin);
        this.setRotateAngle(analfin, 0.3396F, 0.0F, 0.0F);
        this.analfin.cubeList.add(new ModelBox(analfin, 43, 0, 0.0F, 0.0F, 0.0F, 0, 3, 5, 0.0F, true));

        this.bellyslopebodymiddle = new AdvancedModelRenderer(this);
        this.bellyslopebodymiddle.setRotationPoint(0.02F, 4.1F, 0.0F);
        this.bodymiddle.addChild(bellyslopebodymiddle);
        this.setRotateAngle(bellyslopebodymiddle, 0.1061F, 0.0F, 0.0F);
        this.bellyslopebodymiddle.cubeList.add(new ModelBox(bellyslopebodymiddle, 25, 16, -1.5F, -1.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.dorsalslopebodymiddle = new AdvancedModelRenderer(this);
        this.dorsalslopebodymiddle.setRotationPoint(0.02F, -3.5F, 0.1F);
        this.bodymiddle.addChild(dorsalslopebodymiddle);
        this.setRotateAngle(dorsalslopebodymiddle, -0.1911F, 0.0F, 0.0F);
        this.dorsalslopebodymiddle.cubeList.add(new ModelBox(dorsalslopebodymiddle, 11, 16, -1.5F, 0.0F, 0.0F, 3, 1, 4, 0.0F, true));

        this.dorsalbodyfront1 = new AdvancedModelRenderer(this);
        this.dorsalbodyfront1.setRotationPoint(-0.01F, -3.05F, 0.0F);
        this.bodyfront.addChild(dorsalbodyfront1);
        this.dorsalbodyfront1.cubeList.add(new ModelBox(dorsalbodyfront1, 0, 15, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.dorsalbodyfront2 = new AdvancedModelRenderer(this);
        this.dorsalbodyfront2.setRotationPoint(0.02F, 0.0F, -3.0F);
        this.dorsalbodyfront1.addChild(dorsalbodyfront2);
        this.setRotateAngle(dorsalbodyfront2, 0.1698F, 0.0F, 0.0F);
        this.dorsalbodyfront2.cubeList.add(new ModelBox(dorsalbodyfront2, 54, 0, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(-0.01F, 1.1F, -5.0F);
        this.bodyfront.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 45, 24, -1.5F, -2.5F, -3.0F, 3, 5, 3, 0.0F, true));

        this.headslope = new AdvancedModelRenderer(this);
        this.headslope.setRotationPoint(0.02F, -3.8F, 0.0F);
        this.head.addChild(headslope);
        this.setRotateAngle(headslope, 0.4033F, 0.0F, 0.0F);
        this.headslope.cubeList.add(new ModelBox(headslope, 35, 11, -1.5F, 0.0F, -3.0F, 3, 2, 3, 0.0F, true));

        this.throatslope = new AdvancedModelRenderer(this);
        this.throatslope.setRotationPoint(-0.01F, 3.4F, 0.0F);
        this.head.addChild(throatslope);
        this.setRotateAngle(throatslope, -0.2759F, 0.0F, 0.0F);
        this.throatslope.cubeList.add(new ModelBox(throatslope, 12, 12, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, true));

        this.leftpectoralfin = new AdvancedModelRenderer(this);
        this.leftpectoralfin.setRotationPoint(-1.48F, -0.5F, -1.4F);
        this.throatslope.addChild(leftpectoralfin);
        this.setRotateAngle(leftpectoralfin, 1.1037F, -0.1911F, 0.0848F);
        this.leftpectoralfin.cubeList.add(new ModelBox(leftpectoralfin, 9, 3, 0.0F, 0.0F, -0.5F, 0, 3, 2, 0.0F, true));

        this.rightpectoralfin = new AdvancedModelRenderer(this);
        this.rightpectoralfin.setRotationPoint(1.48F, -0.5F, -1.4F);
        this.throatslope.addChild(rightpectoralfin);
        this.setRotateAngle(rightpectoralfin, 1.1037F, 0.1911F, -0.0848F);
        this.rightpectoralfin.cubeList.add(new ModelBox(rightpectoralfin, 9, 7, 0.0F, 0.0F, -0.5F, 0, 3, 2, 0.0F, true));

        this.eyeportion = new AdvancedModelRenderer(this);
        this.eyeportion.setRotationPoint(0.0F, -0.4F, -3.0F);
        this.head.addChild(eyeportion);
        this.eyeportion.cubeList.add(new ModelBox(eyeportion, 0, 10, -1.5F, -1.0F, -2.0F, 3, 2, 2, 0.0F, true));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(-0.01F, -0.78F, -2.3F);
        this.eyeportion.addChild(snout);
        this.setRotateAngle(snout, 0.658F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 0, 5, -1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F, true));

        this.leftcheek = new AdvancedModelRenderer(this);
        this.leftcheek.setRotationPoint(-1.0F, 1.9F, -1.0F);
        this.snout.addChild(leftcheek);
        this.setRotateAngle(leftcheek, 0.299F, -0.0637F, 0.1274F);
        this.leftcheek.cubeList.add(new ModelBox(leftcheek, 22, 8, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.rightcheek = new AdvancedModelRenderer(this);
        this.rightcheek.setRotationPoint(1.0F, 1.9F, -1.0F);
        this.snout.addChild(rightcheek);
        this.setRotateAngle(rightcheek, 0.2972F, 0.0637F, -0.1274F);
        this.rightcheek.cubeList.add(new ModelBox(rightcheek, 13, 6, -2.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, true));

        this.eyeportionslope = new AdvancedModelRenderer(this);
        this.eyeportionslope.setRotationPoint(0.01F, -1.4F, -1.5F);
        this.eyeportion.addChild(eyeportionslope);
        this.setRotateAngle(eyeportionslope, 0.4419F, 0.0F, 0.0F);
        this.eyeportionslope.cubeList.add(new ModelBox(eyeportionslope, 32, 0, -1.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, true));

        this.lefteye = new AdvancedModelRenderer(this);
        this.lefteye.setRotationPoint(-1.05F, 0.1F, -0.9F);
        this.eyeportion.addChild(lefteye);
        this.setRotateAngle(lefteye, 0.0F, -0.0848F, 0.0F);
        this.lefteye.cubeList.add(new ModelBox(lefteye, 6, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.righteye = new AdvancedModelRenderer(this);
        this.righteye.setRotationPoint(1.05F, 0.1F, -0.9F);
        this.eyeportion.addChild(righteye);
        this.setRotateAngle(righteye, 0.0F, 0.0848F, 0.0F);
        this.righteye.cubeList.add(new ModelBox(righteye, 1, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));

        this.lowerjawbase = new AdvancedModelRenderer(this);
        this.lowerjawbase.setRotationPoint(0.0F, 2.1F, -2.6F);
        this.head.addChild(lowerjawbase);
        this.setRotateAngle(lowerjawbase, -0.4882F, 0.0F, 0.0F);
        this.lowerjawbase.cubeList.add(new ModelBox(lowerjawbase, 43, 0, -1.0F, -0.5F, -3.0F, 2, 1, 3, 0.0F, true));

        this.lowerjawfront = new AdvancedModelRenderer(this);
        this.lowerjawfront.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.lowerjawbase.addChild(lowerjawfront);
        this.setRotateAngle(lowerjawfront, -0.1911F, 0.0F, 0.0F);
        this.lowerjawfront.cubeList.add(new ModelBox(lowerjawfront, 41, 0, -0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F, true));

        this.leftcheekflesh = new AdvancedModelRenderer(this);
        this.leftcheekflesh.setRotationPoint(-0.98F, -0.5F, -3.0F);
        this.lowerjawbase.addChild(leftcheekflesh);
        this.setRotateAngle(leftcheekflesh, -0.4033F, 0.0213F, 0.0637F);
        this.leftcheekflesh.cubeList.add(new ModelBox(leftcheekflesh, 27, 0, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.rightcheekflesh = new AdvancedModelRenderer(this);
        this.rightcheekflesh.setRotationPoint(0.98F, -0.5F, -3.0F);
        this.lowerjawbase.addChild(rightcheekflesh);
        this.setRotateAngle(rightcheekflesh, -0.4033F, -0.0213F, -0.0637F);
        this.rightcheekflesh.cubeList.add(new ModelBox(rightcheekflesh, 20, 0, 0.0F, -3.0F, 0.0F, 0, 3, 3, 0.0F, true));

        this.leftpelvicfin = new AdvancedModelRenderer(this);
        this.leftpelvicfin.setRotationPoint(-0.5F, 4.5F, -2.0F);
        this.bodyfront.addChild(leftpelvicfin);
        this.setRotateAngle(leftpelvicfin, -0.1911F, -0.1274F, 0.2972F);
        this.leftpelvicfin.cubeList.add(new ModelBox(leftpelvicfin, 13, 0, 0.0F, -0.5F, 0.0F, 0, 2, 3, 0.0F, true));

        this.rightpelvicfin = new AdvancedModelRenderer(this);
        this.rightpelvicfin.setRotationPoint(0.5F, 4.5F, -2.0F);
        this.bodyfront.addChild(rightpelvicfin);
        this.setRotateAngle(rightpelvicfin, -0.1911F, 0.1274F, -0.2972F);
        this.rightpelvicfin.cubeList.add(new ModelBox(rightpelvicfin, 28, 11, 0.0F, -0.5F, 0.0F, 0, 2, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.root.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -2.0F;
        this.root.offsetX = -1.338F;
        this.root.rotateAngleY = (float)Math.toRadians(200);
        this.root.rotateAngleX = (float)Math.toRadians(8);
        this.root.rotateAngleZ = (float)Math.toRadians(-8);
        this.root.scaleChildren = true;
        float scaler = 1.63F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetZ = -0.34F;
        this.root.offsetY = -0.18F;
        this.root.offsetX = -0.0F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.root.offsetY = -0.14F;
        this.root.offsetZ = 0.015F;
        this.root.render(0.01F);
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
        this.resetToDefaultPose();
        //this.main.offsetY = 0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.bodyend, this.tailbase, this.tailend, this.tailfin};
        float speed = 0.5F;
        if (!e.isInWater()) {
            speed = 0.8F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.8F, 0.27F, 0, f2, 1);
            this.walk(lowerjawbase, (float) (speed * 0.75), 0.3F, true, 0, -0.3F, f2, 1);

            this.flap(rightpectoralfin, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(rightpectoralfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.flap(leftpectoralfin, (float) (speed * 0.75), 0.15F, true, -3, 0, f2, 1);
            this.swing(leftpectoralfin, (float) (speed * 0.75), 0.2F, true, -3, 0, f2, 1);
            this.flap(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.swing(rightpelvicfin, (float) (speed * 0.75), 0.1F, true, 0, 0, f2, 1);
            this.flap(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);
            this.swing(leftpelvicfin, (float) (speed * 0.75), 0.1F, true, -3, 0, f2, 1);


            this.swing(root, speed*0.8F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                 this.root.rotateAngleZ = (float) Math.toRadians(90);
                 this.root.offsetY = 1.4F;
                 this.root.offsetX = 1.1F;
                 this.bob(root, -speed, 5F, false, f2, 1);
            }
        }
    }
}
