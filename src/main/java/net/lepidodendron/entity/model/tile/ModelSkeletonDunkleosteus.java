package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelSkeletonDunkleosteus extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Headslope;
    private final AdvancedModelRenderer Headslope_r1;
    private final AdvancedModelRenderer Throat;
    private final AdvancedModelRenderer Throatslope;
    private final AdvancedModelRenderer Throatslope_r1;
    private final AdvancedModelRenderer Throatslope_r2;
    private final AdvancedModelRenderer Upperjawback;
    private final AdvancedModelRenderer Upperjawfront;
    private final AdvancedModelRenderer Upperjawslope2;
    private final AdvancedModelRenderer Upperfrontshears;
    private final AdvancedModelRenderer Leftuppershears;
    private final AdvancedModelRenderer Rightuppershears;
    private final AdvancedModelRenderer Rightuppershears_r1;
    private final AdvancedModelRenderer Rightuppershears2;
    private final AdvancedModelRenderer Rightuppershears_r2;
    private final AdvancedModelRenderer Upperjawslope1;
    private final AdvancedModelRenderer Upperjawslope4_r1;
    private final AdvancedModelRenderer Leftcheekslope;
    private final AdvancedModelRenderer Rightcheekslope;
    private final AdvancedModelRenderer Rightcheekslope_r1;
    private final AdvancedModelRenderer Rightcheekslope2;
    private final AdvancedModelRenderer Rightcheekslope_r2;
    private final AdvancedModelRenderer Lowerjawback;
    private final AdvancedModelRenderer Lowerjawback_r1;
    private final AdvancedModelRenderer Lowerjawmiddle;
    private final AdvancedModelRenderer Lowerjawfront;
    private final AdvancedModelRenderer Lowerjawshears;
    private final AdvancedModelRenderer Lowerjawslope2;
    private final AdvancedModelRenderer Lowerjawmiddle2;
    private final AdvancedModelRenderer Lowerjawfront2;
    private final AdvancedModelRenderer Lowerjawshears2;
    private final AdvancedModelRenderer Lowerjawslope3;
    private final AdvancedModelRenderer Lowerjawslope1;

    public ModelSkeletonDunkleosteus() {
        this.textureWidth = 50;
        this.textureHeight = 50;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 10.0F, 14.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.7F, -9.0F);
        this.root.addChild(Head);
        this.setRotateAngle(Head, 0.0637F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 20, 29, 2.5F, -2.3F, -6.0F, 1, 7, 2, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 20, 29, -3.5F, -2.3F, -6.0F, 1, 7, 2, 0.001F, true));
        this.Head.cubeList.add(new ModelBox(Head, 11, 14, 3.5F, -2.5F, -4.0F, 1, 7, 4, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 0, 14, -4.5F, -2.5F, -4.0F, 1, 7, 4, 0.0F, false));

        this.Headslope = new AdvancedModelRenderer(this);
        this.Headslope.setRotationPoint(0.0F, -4.1F, 0.0F);
        this.Head.addChild(Headslope);
        this.setRotateAngle(Headslope, 0.2759F, 0.0F, 0.0F);
        this.Headslope.cubeList.add(new ModelBox(Headslope, 0, 7, -2.0F, 0.0F, -4.0F, 4, 1, 5, 0.0F, false));
        this.Headslope.cubeList.add(new ModelBox(Headslope, 17, 21, 2.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, false));
        this.Headslope.cubeList.add(new ModelBox(Headslope, 17, 21, -4.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F, true));

        this.Headslope_r1 = new AdvancedModelRenderer(this);
        this.Headslope_r1.setRotationPoint(0.0F, 0.5F, 1.0F);
        this.Headslope.addChild(Headslope_r1);
        this.setRotateAngle(Headslope_r1, -0.48F, 0.0F, 0.0F);
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 32, 36, 0.0F, 0.5F, -2.2F, 0, 1, 4, 0.0F, false));
        this.Headslope_r1.cubeList.add(new ModelBox(Headslope_r1, 26, 42, -0.5F, -0.5F, -0.2F, 1, 1, 2, 0.0F, false));

        this.Throat = new AdvancedModelRenderer(this);
        this.Throat.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.Head.addChild(Throat);


        this.Throatslope = new AdvancedModelRenderer(this);
        this.Throatslope.setRotationPoint(0.0F, 3.8F, 1.0F);
        this.Throat.addChild(Throatslope);
        this.setRotateAngle(Throatslope, -0.1911F, 0.0F, 0.0F);


        this.Throatslope_r1 = new AdvancedModelRenderer(this);
        this.Throatslope_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Throatslope.addChild(Throatslope_r1);
        this.setRotateAngle(Throatslope_r1, 0.1309F, 0.0F, 0.0F);
        this.Throatslope_r1.cubeList.add(new ModelBox(Throatslope_r1, 18, 10, -2.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        this.Throatslope_r2 = new AdvancedModelRenderer(this);
        this.Throatslope_r2.setRotationPoint(0.0F, -0.5F, -6.0F);
        this.Throatslope.addChild(Throatslope_r2);
        this.setRotateAngle(Throatslope_r2, 0.0436F, 0.0F, 0.0F);
        this.Throatslope_r2.cubeList.add(new ModelBox(Throatslope_r2, 37, 36, -2.0F, -0.1F, 0.0F, 4, 1, 1, 0.0F, false));
        this.Throatslope_r2.cubeList.add(new ModelBox(Throatslope_r2, 0, 0, -3.0F, -0.1F, 1.0F, 6, 1, 5, 0.0F, false));

        this.Upperjawback = new AdvancedModelRenderer(this);
        this.Upperjawback.setRotationPoint(0.0F, -1.7F, -6.0F);
        this.Head.addChild(Upperjawback);
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 0, 36, 3.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, false));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 14, 9, 3.0F, 0.6F, -1.5F, 1, 1, 1, 0.02F, false));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 0, 36, -4.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F, true));
        this.Upperjawback.cubeList.add(new ModelBox(Upperjawback, 14, 9, -4.0F, 0.6F, -1.5F, 1, 1, 1, 0.02F, true));

        this.Upperjawfront = new AdvancedModelRenderer(this);
        this.Upperjawfront.setRotationPoint(0.0F, 4.0F, -2.0F);
        this.Upperjawback.addChild(Upperjawfront);
        this.setRotateAngle(Upperjawfront, -0.1911F, 0.0F, 0.0F);
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 34, 30, 2.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 34, 30, -3.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 34, 30, -2.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F, true));
        this.Upperjawfront.cubeList.add(new ModelBox(Upperjawfront, 33, 26, -1.5F, -2.0F, -3.0F, 4, 2, 1, 0.0F, false));

        this.Upperjawslope2 = new AdvancedModelRenderer(this);
        this.Upperjawslope2.setRotationPoint(0.0F, -3.95F, -0.6F);
        this.Upperjawfront.addChild(Upperjawslope2);
        this.setRotateAngle(Upperjawslope2, 0.7055F, 0.0F, 0.0F);
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 26, 0, -2.0F, 0.0F, -3.0F, 4, 1, 3, 0.0F, false));
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 8, 35, 2.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, false));
        this.Upperjawslope2.cubeList.add(new ModelBox(Upperjawslope2, 8, 35, -3.0F, 0.0F, -3.0F, 1, 2, 3, 0.0F, true));

        this.Upperfrontshears = new AdvancedModelRenderer(this);
        this.Upperfrontshears.setRotationPoint(0.0F, -0.5F, -2.7F);
        this.Upperjawfront.addChild(Upperfrontshears);
        this.setRotateAngle(Upperfrontshears, 0.0848F, 0.0F, 0.0F);
        this.Upperfrontshears.cubeList.add(new ModelBox(Upperfrontshears, 36, 5, -2.5F, 0.0F, 0.0F, 5, 2, 0, 0.0F, false));

        this.Leftuppershears = new AdvancedModelRenderer(this);
        this.Leftuppershears.setRotationPoint(-2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Leftuppershears);
        this.setRotateAngle(Leftuppershears, 0.1274F, -0.1485F, 0.0F);


        this.Rightuppershears = new AdvancedModelRenderer(this);
        this.Rightuppershears.setRotationPoint(2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Rightuppershears);
        this.setRotateAngle(Rightuppershears, 0.1274F, 0.1485F, 0.0F);


        this.Rightuppershears_r1 = new AdvancedModelRenderer(this);
        this.Rightuppershears_r1.setRotationPoint(-2.9407F, 0.451F, -1.8821F);
        this.Rightuppershears.addChild(Rightuppershears_r1);
        this.setRotateAngle(Rightuppershears_r1, -0.2588F, -0.0098F, -0.0374F);
        this.Rightuppershears_r1.cubeList.add(new ModelBox(Rightuppershears_r1, 14, 38, 2.9557F, -1.2694F, 0.386F, 0, 2, 3, 0.0F, false));

        this.Rightuppershears2 = new AdvancedModelRenderer(this);
        this.Rightuppershears2.setRotationPoint(-2.7F, -0.5F, -1.2F);
        this.Upperjawfront.addChild(Rightuppershears2);
        this.setRotateAngle(Rightuppershears2, 0.1274F, -0.1485F, 0.0F);


        this.Rightuppershears_r2 = new AdvancedModelRenderer(this);
        this.Rightuppershears_r2.setRotationPoint(2.4593F, 0.451F, -1.8821F);
        this.Rightuppershears2.addChild(Rightuppershears_r2);
        this.setRotateAngle(Rightuppershears_r2, -0.2588F, 0.0098F, 0.0374F);
        this.Rightuppershears_r2.cubeList.add(new ModelBox(Rightuppershears_r2, 14, 38, -2.4743F, -1.2694F, 0.386F, 0, 2, 3, 0.0F, true));

        this.Upperjawslope1 = new AdvancedModelRenderer(this);
        this.Upperjawslope1.setRotationPoint(0.0F, -0.8F, 0.0F);
        this.Upperjawback.addChild(Upperjawslope1);
        this.setRotateAngle(Upperjawslope1, 0.4138F, 0.0F, 0.0F);


        this.Upperjawslope4_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslope4_r1.setRotationPoint(0.0F, -0.2F, -1.8F);
        this.Upperjawslope1.addChild(Upperjawslope4_r1);
        this.setRotateAngle(Upperjawslope4_r1, -0.1309F, 0.0F, 0.0F);
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 38, 0, -1.5F, 0.2F, 0.3F, 3, 1, 1, -0.001F, false));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 40, 8, -1.5F, 0.2F, -0.2F, 3, 1, 1, 0.0F, false));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 22, 16, -3.5F, 0.2F, -0.2F, 2, 1, 2, 0.0F, true));
        this.Upperjawslope4_r1.cubeList.add(new ModelBox(Upperjawslope4_r1, 22, 16, 1.5F, 0.2F, -0.2F, 2, 1, 2, 0.0F, false));

        this.Leftcheekslope = new AdvancedModelRenderer(this);
        this.Leftcheekslope.setRotationPoint(-3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Leftcheekslope);
        this.setRotateAngle(Leftcheekslope, 0.7006F, -0.0424F, -0.0848F);


        this.Rightcheekslope = new AdvancedModelRenderer(this);
        this.Rightcheekslope.setRotationPoint(3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Rightcheekslope);
        this.setRotateAngle(Rightcheekslope, 0.7006F, 0.0424F, 0.0848F);


        this.Rightcheekslope_r1 = new AdvancedModelRenderer(this);
        this.Rightcheekslope_r1.setRotationPoint(0.5F, -1.0F, 0.5F);
        this.Rightcheekslope.addChild(Rightcheekslope_r1);
        this.setRotateAngle(Rightcheekslope_r1, 0.0F, 0.0F, -0.1309F);
        this.Rightcheekslope_r1.cubeList.add(new ModelBox(Rightcheekslope_r1, 27, 16, -0.5F, 0.0F, -0.5F, 1, 5, 4, 0.0F, false));

        this.Rightcheekslope2 = new AdvancedModelRenderer(this);
        this.Rightcheekslope2.setRotationPoint(-3.0F, 4.0F, -1.9F);
        this.Upperjawback.addChild(Rightcheekslope2);
        this.setRotateAngle(Rightcheekslope2, 0.7006F, -0.0424F, -0.0848F);


        this.Rightcheekslope_r2 = new AdvancedModelRenderer(this);
        this.Rightcheekslope_r2.setRotationPoint(-0.5F, -1.0F, 0.5F);
        this.Rightcheekslope2.addChild(Rightcheekslope_r2);
        this.setRotateAngle(Rightcheekslope_r2, 0.0F, 0.0F, 0.1309F);
        this.Rightcheekslope_r2.cubeList.add(new ModelBox(Rightcheekslope_r2, 0, 26, -0.5F, 0.0F, -0.5F, 1, 5, 4, 0.0F, false));

        this.Lowerjawback = new AdvancedModelRenderer(this);
        this.Lowerjawback.setRotationPoint(0.0F, 4.0F, -2.39F);
        this.Head.addChild(Lowerjawback);
        this.setRotateAngle(Lowerjawback, 0.1616F, 0.0F, 0.0F);
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 11, 26, 3.0F, -2.0F, -3.0F, 1, 5, 3, 0.0F, false));
        this.Lowerjawback.cubeList.add(new ModelBox(Lowerjawback, 11, 26, -4.0F, -2.0F, -3.0F, 1, 5, 3, 0.0F, true));

        this.Lowerjawback_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawback_r1.setRotationPoint(-3.5F, 2.9F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawback_r1);
        this.setRotateAngle(Lowerjawback_r1, -0.2618F, 0.0F, 0.0F);
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 17, 1, -0.5F, -0.9F, 0.0F, 1, 1, 6, -0.001F, true));
        this.Lowerjawback_r1.cubeList.add(new ModelBox(Lowerjawback_r1, 17, 1, 6.5F, -0.9F, 0.0F, 1, 1, 6, -0.001F, false));

        this.Lowerjawmiddle = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle);
        this.setRotateAngle(Lowerjawmiddle, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle.cubeList.add(new ModelBox(Lowerjawmiddle, 34, 13, 2.5F, -2.0F, -2.7F, 1, 2, 3, 0.0F, false));

        this.Lowerjawfront = new AdvancedModelRenderer(this);
        this.Lowerjawfront.setRotationPoint(0.0F, -2.0F, -2.7F);
        this.Lowerjawmiddle.addChild(Lowerjawfront);
        this.setRotateAngle(Lowerjawfront, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 21, 39, 2.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 41, 39, 1.0F, 0.0F, -3.0F, 2, 2, 1, 0.0F, false));
        this.Lowerjawfront.cubeList.add(new ModelBox(Lowerjawfront, 7, 41, 0.5F, 0.0F, -3.0F, 2, 2, 1, -0.001F, false));

        this.Lowerjawshears = new AdvancedModelRenderer(this);
        this.Lowerjawshears.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.Lowerjawfront.addChild(Lowerjawshears);
        this.setRotateAngle(Lowerjawshears, -0.1274F, 0.0F, 0.0F);
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 31, 5, 2.5F, -1.6572F, 0.1119F, 0, 2, 4, 0.0F, false));
        this.Lowerjawshears.cubeList.add(new ModelBox(Lowerjawshears, 0, 7, 0.5F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Lowerjawslope2 = new AdvancedModelRenderer(this);
        this.Lowerjawslope2.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.Lowerjawmiddle.addChild(Lowerjawslope2);
        this.setRotateAngle(Lowerjawslope2, -0.0953F, 0.0F, 0.0F);


        this.Lowerjawmiddle2 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle2.setRotationPoint(0.0F, 2.5F, -3.0F);
        this.Lowerjawback.addChild(Lowerjawmiddle2);
        this.setRotateAngle(Lowerjawmiddle2, -0.0637F, 0.0F, 0.0F);
        this.Lowerjawmiddle2.cubeList.add(new ModelBox(Lowerjawmiddle2, 27, 33, -3.5F, -2.0F, -2.7F, 1, 2, 3, 0.0F, false));

        this.Lowerjawfront2 = new AdvancedModelRenderer(this);
        this.Lowerjawfront2.setRotationPoint(0.0F, -2.0F, -2.7F);
        this.Lowerjawmiddle2.addChild(Lowerjawfront2);
        this.setRotateAngle(Lowerjawfront2, 0.0637F, 0.0F, 0.0F);
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 38, 19, -3.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 40, 11, -3.0F, 0.0F, -3.0F, 2, 2, 1, 0.0F, false));
        this.Lowerjawfront2.cubeList.add(new ModelBox(Lowerjawfront2, 7, 14, -2.5F, 0.0F, -3.0F, 2, 2, 1, -0.001F, false));

        this.Lowerjawshears2 = new AdvancedModelRenderer(this);
        this.Lowerjawshears2.setRotationPoint(0.0F, 0.3F, -2.8F);
        this.Lowerjawfront2.addChild(Lowerjawshears2);
        this.setRotateAngle(Lowerjawshears2, -0.1274F, 0.0F, 0.0F);
        this.Lowerjawshears2.cubeList.add(new ModelBox(Lowerjawshears2, 28, 26, -2.5F, -1.6572F, 0.1119F, 0, 2, 4, 0.0F, false));
        this.Lowerjawshears2.cubeList.add(new ModelBox(Lowerjawshears2, 0, 0, -2.5F, -2.0F, 0.0F, 2, 2, 0, 0.0F, false));

        this.Lowerjawslope3 = new AdvancedModelRenderer(this);
        this.Lowerjawslope3.setRotationPoint(0.0F, 0.6F, 0.2F);
        this.Lowerjawmiddle2.addChild(Lowerjawslope3);
        this.setRotateAngle(Lowerjawslope3, -0.0953F, 0.0F, 0.0F);


        this.Lowerjawslope1 = new AdvancedModelRenderer(this);
        this.Lowerjawslope1.setRotationPoint(0.0F, 3.5F, 1.0F);
        this.Lowerjawback.addChild(Lowerjawslope1);
        this.setRotateAngle(Lowerjawslope1, -0.1061F, 0.0F, 0.0F);

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.render(0.01f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
